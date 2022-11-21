package com;

public class Multithreading extends Thread {

    @Override
    public void run() {
        System.out.println("thread"+Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        int n = 8;
        for (int i = 0; i<n; i++){
            Multithreading mt = new Multithreading();
            mt.start();
        }

    }
}
