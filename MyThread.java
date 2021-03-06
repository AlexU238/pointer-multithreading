package com.thread;

import java.util.Scanner;

public class MyThread extends Thread {
    private Scanner in = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Enter the number of fibonacci numbers you want to see in direct order");
        int number = in.nextInt();
        if (number < 0) {
            System.out.println("0");
        }
        int[] fibonacci = new int[number];
        int n0 = 1;
        int n1 = 1;
        int n2;
        fibonacci[0] = n0;
        fibonacci[1] = n1;
        for (int i = 2; i < number; i++) {
            n2 = n0 + n1;
            fibonacci[i] = n2;
            n0 = n1;
            n1 = n2;
        }

        System.out.print("Потік Thread : ");
        for (int i1 : fibonacci) {
            System.out.print(i1 + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getCause();
                e.printStackTrace();
                break;
            }
        }
        System.out.println('\n');
    }


}
