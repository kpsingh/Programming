package com.self.concurrent.dinningphilospher;

import java.util.concurrent.Semaphore;

public class Test {


    private final Semaphore oddJobPermits = new Semaphore(0);
    private final Semaphore evenJobPermits = new Semaphore(1);

    private class EvenJob implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    evenJobPermits.acquire();
                    System.out.println("Even : " + i * 2);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    oddJobPermits.release();
                }
            }
        }
    }

    private class OddJob implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    oddJobPermits.acquire();
                    System.out.println("Odd : " + (i * 2 + 1));
                   Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    evenJobPermits.release();
                }
            }
        }
    }

    public void run() {
        new Thread(new EvenJob()).start();
        new Thread(new OddJob()).start();
    }

    public static void main(String[] args) {
        new Test().run();
    }

}
