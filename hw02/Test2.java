package homework.hw02;

public class Test2 {
    public static void main(String[] args) {
        int num = 345;

        int num1 = num / 100;
        int num2 = num / 10 % 10;
        int num3 = num % 10;
        System.out.println("Число 345 -> " + num1 + "," + num2 + "," +num3);
    }
}
