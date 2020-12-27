package ru.romzhel.homeworks.lesson_3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeCounter {
    private volatile int counter;
    private Lock lock;

    public ThreadSafeCounter() {
        this.counter = 0;
        lock = new ReentrantLock();
    }

    public void increment() throws Exception {
        System.out.println(Thread.currentThread().getName() + " try to increment");
        boolean locked = false;
        try {
            if ((locked = lock.tryLock(5, TimeUnit.SECONDS))) {
                counter++;
                System.out.println(Thread.currentThread().getName() + " -> " + counter);
            } else {
                throw new RuntimeException("can't get access to counter");
            }
        } finally {
            if (locked) {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " unlocked");
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
