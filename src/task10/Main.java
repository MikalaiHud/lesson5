package task10;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Дан текст. Найти сумму имеющихся в нем цифр.
 */
public class Main {
    public static void main(String[] args) {
        String string10 = "dfaldfs57dfgdfswrfs9dfsd2";
        System.out.println("Строка:");
        System.out.println(string10);
        int number = numeralNumber(string10);
        System.out.println("Количество цифр в строке: " + number);
    }
    private static int numeralNumber(String intermediateString) {
        int result = 0;
        char[] intermediateCharArray = intermediateString.toCharArray();
        for (int i = 0; i < intermediateCharArray.length; i++) {
            if (intermediateCharArray[i] > 47 && intermediateCharArray[i] < 58) {
                result++;
            }
        }
        return result;
    }
}
