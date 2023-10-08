/*
printMatrix выводит в консоль талицу римских чисел от 1 до 109.

getRoman возвращает перевод арабского числа(от 1 до 109) в римское.
 */


public class RomanMatrix {
    String space;
    String s;

    String[] dec = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    void printMatrix() {

        System.out.println("Таблица римских чисел от 1 до 109.\n" +
                "=".repeat(96));


        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {

                s = dec[i] + units[j];

                space = " ".repeat(10 - s.length());

                System.out.print(s + space);
            }
            System.out.println();
        }
        System.out.println("=".repeat(96) + "\n");
    }

    String getRoman(int arabic) {

        int d = arabic / 10;
        int u = arabic % 10;
        String roman = dec[d] + units[u];

        return roman;
    }


}


