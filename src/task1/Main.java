package task1;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
 * Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.
 */

public class Main {
    public static void main(String[] args) {
        String experimentString1 = "                   1                2      3        ";
        System.out.println(experimentString1);
        experimentString1 = experimentString1.trim();
        System.out.println(experimentString1);
        String[] newString = experimentString1.split(" ");
        for (int i = 0; i < newString.length; i++) {
            System.out.println(newString[i]);
        }
        String result = new String();
        for (int i = 0; i < newString.length; i++) {
            result += newString[i];
        }
        System.out.println("result:" + result);
    }
}

