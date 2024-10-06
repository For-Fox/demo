package hausaufgabe;

import java.util.Scanner;

public class halb{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.println("Erste Word, bitte:");
        String ersteWord = vvod.next();

        System.out.println("Zweite Word, bitte:");
        String zweiteWord = vvod.next();

        if (ersteWord.length() % 2 ==0 && zweiteWord.length() % 2 ==0)
        {
            String ersteHalb = ersteWord.substring(0, ersteWord.length() / 2);
            String zweiteHalb = zweiteWord.substring(zweiteWord.length() /2);

            String neuWord = ersteHalb + zweiteHalb;

            System.out.println(neuWord);
        } else
            System.out.println("Falsch");}
}
