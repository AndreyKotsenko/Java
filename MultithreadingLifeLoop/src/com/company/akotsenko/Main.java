package com.company.akotsenko;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*
                    Waiting/  ----
                    blocking      |
                   ||            ||
                   \/            \/
        New ---> Runnable <---> Running ---> Dead
         */


        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(1000); // waiting
        System.out.println("thread main");

        MyThread myThread1 = new MyThread();
        myThread1.start();
        Thread.yield(); //not guaranteed
        System.out.println("again thread main");

        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
        myThread2.join();
        System.out.println("third thread main");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread 0");
    }
}


class MyThread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 50; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}