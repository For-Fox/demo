package HA;

import java.util.Random;

public class Massiv_8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,51);
        }

        System.out.println("Initial Array");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("Final Array");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

