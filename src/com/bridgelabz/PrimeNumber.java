package com.bridgelabz;


public class PrimeNumber {

    public static void main(String[] args) {
        String primeNumber = "";
        String nonPrimeNumber = "";

        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int number = i; number >= 1; number--) {
                if (i % number == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumber = primeNumber + i + " ";
            } else
                nonPrimeNumber = nonPrimeNumber + i + " ";
        }

            System.out.println("Prime Numbers from 1 to 100 : ");
            System.out.println(primeNumber);
            System.out.println("Non Prime Numbers from 1 to 100 : ");
            System.out.println(nonPrimeNumber);

    }
}