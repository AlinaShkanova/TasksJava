public class Calculator {

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        char sign = '^';
        int result = 0;
        int resultDegree = 1;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("На ноль делить нельзя!");
                return;
            }
        } else if (sign == '^') {
            for (int i = 0; i < b; i++) {
                resultDegree = resultDegree * a;
            }
            System.out.println("Результат: " + a + " " + sign + " " + b + " = " + resultDegree);
            return;
        }
        if (sign == '%') {
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
