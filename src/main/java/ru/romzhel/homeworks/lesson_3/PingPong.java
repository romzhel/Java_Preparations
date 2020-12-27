package ru.romzhel.homeworks.lesson_3;

public class PingPong {
    private static final String[] PRINT_VALUES = {"ping", "pong"};
    private static final Object MONITOR = new Object();
    private static volatile int nextIndex;

    public static void print() {
        nextIndex = 0;

        for (int printIndex = 0; printIndex < PRINT_VALUES.length; printIndex++) {
            int finalPrintIndex = printIndex;
            new Thread(() -> {
                while (true) {
                    print(finalPrintIndex);
                }
            }).start();
        }
    }

    private static void print(int printIndex) {
        synchronized (MONITOR) {
            try {
                while (nextIndex != printIndex) {
                    MONITOR.wait();
                }

                System.out.println(PRINT_VALUES[printIndex]);

                nextIndex = ++nextIndex % PRINT_VALUES.length;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                MONITOR.notify();
            }
        }
    }
}
