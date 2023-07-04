public class VariablesTheme {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("1. Вывод характеристик компьютера\n");
        byte numberOfCores = 12;
        short productiveCores = 4;
        int energyCores = 8;
        long ram = 16;
        float cpu = 2.5f;
        double increaseInFrequency = 4.5;
        char goodLuckSymbol = 0024;
        boolean opticalDrive = false;
        System.out.println("Процессор:\n" +
                "Общее количество ядер - " + numberOfCores + "\n" +
                "Количество производительных ядер - " + productiveCores + "\n" +
                "Количество энергоэффективных ядер - " + energyCores + "\n" +
                "Частота процессора " + cpu + " ГГц" + "\n" +
                "Оперативная память: \n" +
                "Объем оперативной памяти - " + ram + " Гб" + "\n" +
                "Автоматическое увеличение частоты - " + increaseInFrequency + " ГГц\n" +
                "Символ на удачу - " + goodLuckSymbol + "\n" +
                "Наличие оптического привода - " + opticalDrive + "\n");

        //Задача 2
        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int pen = 100, book = 200, percent = 11;
        int summa = pen + book;
        int discount = (summa / 100) * percent;
        int generalSumma = summa - discount;
        System.out.println("Общая стоимость товара без скидки: " + summa + "\n" +
                "Сумма скидки: " + discount + "\n" +
                "Общая стоимость товаров со скидкой: " + generalSumma + "\n");

        //Задача 3
        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a  \n");

        //Задача 4
        System.out.println("4. Вывод min и max значений целых числовых типов\n");
        byte numberByte = Byte.MAX_VALUE;
        short numberShort = Short.MAX_VALUE;
        int numberInt = Integer.MAX_VALUE;
        long numberLong = Long.MAX_VALUE;
        System.out.println("byte: " + numberByte + ", " + (++numberByte) + ", " + (--numberByte) + "\n" +
                "short: " + numberShort + ", " + (++numberShort) + ", " + (--numberShort) + "\n" +
                "int: " + numberInt + ", " + (++numberInt) + ", " + (--numberInt) + "\n" +
                "long: " + numberLong + ", " + (++numberLong) + ", " + (--numberLong) + "\n");

        //Задача 5
        System.out.println("5. Перестановка значений переменных\n");
        int x = 2;
        int y = 5;
        System.out.println("Первый способ. Перестановка с помощью третьей переменной\n" +
                "x = " + x + ", " + "y = " + y);
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + ", " + "y = " + y);
        System.out.println("Второй способ. Перестановка с помощью арифметических операций\n" +
                "x = " + x + ", " + "y = " + y);
        x *= y;
        y = x / y;
        x /= y;
        System.out.println("x = " + x + ", " + "y = " + y);
        System.out.println("Третий способ. Перестановка с помощью побитовой операции\n" +
                "x = " + x + ", " + "y = " + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("x = " + x + ", " + "y = " + y + "\n");

        //Задача 6
        System.out.println("6. Вывод символов и их кодов\n");
        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '_';
        int code1 = symbol1;
        int code2 = symbol2;
        int code3 = symbol3;
        int code4 = symbol4;
        int code5 = symbol5;
        System.out.println(code1 + " = " + symbol1 + "\n" + code2 + " = " + symbol2 + "\n" +
                "" + code3 + " = " + symbol3 + "\n" + code4 + " = " + symbol4 + "\n" + code5 + " = " + symbol5 + "\n");

        //Задача 7
        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        char leftBraket = '(';
        char rightBraket = ')';
        char leftSlash = '\\';
        char rightSlash = '/';
        char underscore = '_';
        System.out.println("    " + rightSlash + leftSlash + "\n" +
                "   " + rightSlash + "  " + leftSlash + "\n" +
                "  " + rightSlash + underscore + leftBraket + " " + rightBraket + leftSlash + "\n" +
                " " + rightSlash + "      " + leftSlash + "\n" +
                rightSlash + underscore + underscore + underscore + underscore + rightSlash + leftSlash + "\n" +
                "" + underscore + underscore + leftSlash + "\n");

        //Задача 8
        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");
        int n = 123;
        int hundreds = n / 100;
        int dozens = n / 10;
        int units = n / 1;
        int addition = hundreds + dozens + units;
        int multiplication = hundreds * dozens * units;
        System.out.println("Число 123 содержит:\n" +
                "Сотен: " + hundreds + "\n" +
                "Десятков: " + dozens + "\n" +
                "Единиц: " + units + "\n" +
                "Сумма = " + addition + "\n" +
                "Произведение = " + multiplication + "\n");

        //Задача 9
        System.out.println("9. Вывод времени\n");
        int secs = 86399;
        int remainder1 = secs % 60;
        int del = secs / 60;
        int remainder2 = del % 60;
        del = del / 60;
        System.out.print(del + ":" + remainder2 + ":" + remainder1);
    }
}
