package HA;

public class Massiv_n {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5};
        int n1 = 5;
        System.out.println("Недостающий элемент: " + findNumber(array1, n1));

        int[] array2 = {6,1,2,8,3,4,7,10,5};
        int n2 = 10;
        System.out.println("Недостающий элемент: " + findNumber(array2, n2));
    }

    public static int findNumber(int[] array, int n) {
        int Sum = n * (n+1)/2;

        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return Sum - arraySum;
    }
}
