package HA;

import java.util.Random;

public class Massiv_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10,100);
        }

        System.out.println("Massiv");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        if (MassivIncreasing(array)) {
            System.out.println("Massiv_plus");
        } else {
            System.out.println("Massiv_minus");
        }
    }

    public static boolean MassivIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}