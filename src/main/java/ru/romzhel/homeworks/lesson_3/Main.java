package ru.romzhel.homeworks.lesson_3;

public class Main {
    public static void main(String[] args) {

        //task 2
        ThreadSafeCounter counter = new ThreadSafeCounter();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    counter.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }


        //task 1
        PingPong.print();
    }
}
