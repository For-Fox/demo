package HA;

public class Kolba {
    public static void main(String[] args) {
        int temp1 = 105;
        int temp2 = 50;

        boolean KolbaPlus = checkKolba(temp1, temp2);

        if (KolbaPlus) {
            System.out.println("Funktioniert");
        }
        else {
            System.out.println("NichtFunktioniert");
        }
    }

    public static boolean checkKolba (int temp1, int temp2) {
        return temp1 > 100 && temp2 < 100;
    }
}
