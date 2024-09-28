package homework.hw02;

public class Test {
        public static void main(String[] args) {
            char oxChar = 'G';
            int oxInt = 89;
            byte oxByte = 4;
            short oxShort = 56;
            float oxFloat = 4.7333436F;
            double oxDouble = 4.355453532;
            long oxLong = 12121;
            boolean oxBool = true;
            String oxString = "Я учла комментарии";
            Integer oxInteger = Integer.valueOf(oxInt);
            Double oxDoubleOb = Double.valueOf(oxDouble);
            Character oxCharOb = Character.valueOf(oxChar);

            System.out.println("Character: " + oxChar);
            System.out.println("Integer: " + oxInt);
            System.out.println("Byte: " + oxByte);
            System.out.println("Short: " + oxShort);
            System.out.println("Float: " + oxFloat);
            System.out.println("Double: " + oxDouble);
            System.out.println("Long: " + oxLong);
            System.out.println("Boolean: " + oxBool);
            System.out.println("String: " + oxString);
            System.out.println("Integer: " + oxInteger);
            System.out.println("Double: " + oxDoubleOb);
            System.out.println("Character: " + oxCharOb);

        }
    }
