/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

/**
 *
 * @author Sifiso
 */
public class JavaApplication64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int startingNumber = 1; // Change this to your desired starting number

        // Create two threads, one for even numbers and one for odd numbers
        Thread evenThread = new Thread(new EvenNumberPrinter(startingNumber));
        Thread oddThread = new Thread(new OddNumberPrinter(startingNumber));

        // Start both threads
        evenThread.start();
        oddThread.start();
        evenThread.join(0);
    }
}

class EvenNumberPrinter implements Runnable {
    private int startingNumber;

    public EvenNumberPrinter(int startingNumber) {
        this.startingNumber = startingNumber;
    }

    @Override
    public synchronized void run() {
        System.out.println("Even Numbers:");
        for (int i = startingNumber; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}

class OddNumberPrinter implements Runnable {
    private int startingNumber;

    public OddNumberPrinter(int startingNumber) {
        this.startingNumber = startingNumber;
    }

    @Override
    public synchronized void run() {
        System.out.println("Odd Numbers:");
        for (int i = startingNumber; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

    
    

