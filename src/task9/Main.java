package task9;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Дана строка, состоящая из слов, разделенных символами, которые перечислены во второй строке. Показать все слова.
 */
public class Main {
    public static void main(String[] args) {
        String string9a = "Это_строка_с_номером_9";
        System.out.println(string9a);
        String space9b = "_";
        System.out.println(space9b);
        String[] string9b = convertingToStringArray(string9a,space9b);
        printStringArray(string9b);
    }
    private static String[] convertingToStringArray (String intermediateString, String space) {
        String[] intermediateStringArray = intermediateString.split(space);
        return intermediateStringArray;
    }
    private static void printStringArray (String[] printArray) {
        System.out.println("--------------------------------");
        System.out.println("Вывод массива строк");
        for (int i = 0; i < printArray.length; i++) {
            int n = i + 1;
            System.out.println("Строка " + n + ": " + printArray[i]);
        }
        System.out.println("--------------------------------");
    }
}
