package homework.hw03;

public class Calculator {
    public static float plus(float a, float b) {
        return a + b;
    }
    public static float minus(float a, float b) {
        return a - b;
    }
    public static float mult(float a, float b) {
        return a * b;
    }
    public static float teil(float a, float b) {
        return (float) a / b;
    }
    public static void main(String[] args) {
        float num1 = 45f;
        float num2 = 1f;

        System.out.println("Cложение: " + plus(num1, num2));
        System.out.println("Вычитание: " + minus(num1, num2));
        System.out.println("Умножение: " + mult(num1, num2));
        System.out.println("Деление: " + teil(num1, num2));
    }
    }
