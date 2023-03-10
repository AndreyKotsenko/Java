package com.company.akotsenko;

public class Main {

    public static void main(String[] args) {
	    MyThread myThread = new MyThread();
	    myThread.start();
        System.out.println(Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("this is new thread");
        //someMethod();
        System.out.println("This is thread = " + Thread.currentThread().getName());
    }

    private void someMethod() {
        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
