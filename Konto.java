package HA;

public class Konto {
    public static void main(String[] args) {
        int N = 21;
        int days = 0;

        while (N > 1) {
            for (int i = N - 1; i >=1; i--) {
                if (N % i == 0) {
                    N -= i;
                    days++;
                    System.out.println(" " + N);
                    break;
                }
            }
            if (N == 1) {
                N = 0;
                days++;
                System.out.println(" " + N);
            }
        }
        System.out.println("Sie brauchen: " + days);
    }
}
