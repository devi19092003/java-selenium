package com;

public class MultithreadingWithRunnableInterface implements Runnable {

    java.lang.ThreadLocal<Integer> threadLocal = new java.lang.ThreadLocal<>();

   // ThreadLocal threadLocal = new ThreadLocal();

    @Override
    public void run() {
      threadLocal.set((int)(Math.random()*50D));
    }

    public static void main(String[] args) {

        MultithreadingWithRunnableInterface mr = new MultithreadingWithRunnableInterface();

        Thread thread1 = new Thread(mr);
        Thread thread2 = new Thread(mr);
        thread1.start();
        thread2.start();




    }

}
