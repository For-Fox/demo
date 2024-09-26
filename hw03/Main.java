package homework.hw03;

public class Main {
    public static void main(String[] args) {
        String oxString = new String("I study Basic Java!");
        char oxPredLast = oxString.charAt(oxString.length() -2 );

        System.out.println("Предпоследний символ: " + oxPredLast);
        System.out.println(oxString.contains("Java"));

        String oxsubstring = oxString.substring(14, 18);
        System.out.println("Вырезанная строка: " + oxsubstring);

        String oxModString = oxString.replace('a', 'o');
        System.out.println("Измененная строка: " + oxModString);

        String oxUpString = oxString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + oxUpString);

        String oxDownString = oxString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + oxDownString);
    }
}

