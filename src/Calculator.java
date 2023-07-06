import java.util.Random;

public class Calculator {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(100) + 1;
        int b = random.nextInt(100) + 1;
        char[] operators = {'+', '-', '*', '/', '^', '%'};
        char sign = operators[random.nextInt(operators.length)];
        int result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if  (b != 0) {
            result = a / b;
        } else {
                System.out.println("На ноль делить нельзя!");
            }
        }
            else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            if (b != 0) {
                result = a % b;
            } else {
                System.out.println("На ноль делить нельзя!");
                return;
            }
        }
        System.out.println("Результат: " + a + " " + sign + " " + b + " = " + result);
    }
}
