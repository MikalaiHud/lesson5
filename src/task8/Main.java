package task8;

import java.util.Random;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Дана строка. Разделить строку на фрагменты по три подряд идущих символа.
 * В каждом фрагменте средний символ заменить на случайный символ, не совпадающий ни с одним из символов этого фрагмента.
 * Показать фрагменты, упорядоченные по алфавиту.
 */
public class Main {
    public static void main(String[] args) {
        String string8 = "abzcdc101xyzlol";
        System.out.println();
        System.out.println(string8);
        String[] stringArray8 = separatingThreeLetters(string8);
        printStringArray(stringArray8);
        printAlphabetStrings(stringArray8);
        stringArray8 = editingAverageLetter(stringArray8);
        printStringArray(stringArray8);
    }

    private static String[] separatingThreeLetters(String intermediateString) {
        String[] intermediateStringArray = new String[intermediateString.length() / 3];
        char[] intermediateCharArray = intermediateString.toCharArray();
        for (int i = 0; i < intermediateCharArray.length; i += 3) {
            String result = "";
            for (int j = i; j < i + 3; j++) {
                result += intermediateCharArray[j];
            }
            intermediateStringArray[i / 3] = result;
        }
        return intermediateStringArray;
    }

    private static String[] editingAverageLetter(String[] intermediateStringArray) {
        for (int i = 0; i < intermediateStringArray.length; i++) {
            String result = "";
            char[] intermediateCharArray = intermediateStringArray[i].toCharArray();
            int random;
            do {
                random = new Random().nextInt(256);
            } while (intermediateCharArray[0] == (char) random || intermediateCharArray[1] == (char) random || intermediateCharArray[2] == (char) random);
            intermediateCharArray[1] = (char) random;
            for (int j = 0; j < intermediateCharArray.length; j++) {
                result += intermediateCharArray[j];
            }
            intermediateStringArray[i] = result;
        }
        return intermediateStringArray;
    }

    private static void printStringArray(String[] intermediateArray) {
        System.out.println("--------------------------------------");
        System.out.println("Вывод массива строк");
        for (int i = 0; i < intermediateArray.length; i++) {
            System.out.println(intermediateArray[i]);
        }
        System.out.println("--------------------------------------");
    }

    private static void printAlphabetStrings(String[] intermediateStringArray) {
        System.out.println("--------------------------------------");
        System.out.println("Строки, упорядоченные по алфавиту:");
        for (int i = 0; i < intermediateStringArray.length; i++) {
            char[] intermediateCharArray = intermediateStringArray[i].toCharArray();
            if (intermediateCharArray[0] > 96 && intermediateCharArray[0] < 123 && intermediateCharArray[1] > 96 && intermediateCharArray[1] < 123 &&
                    intermediateCharArray[2] > 96 && intermediateCharArray[2] < 123 && intermediateCharArray[0] < intermediateCharArray[1] &&
                    intermediateCharArray[1] < intermediateCharArray[2]) {
                String result = "";
                for (int j = 0; j < intermediateCharArray.length; j++) {
                    result += intermediateCharArray[j];
                }
                System.out.println("Строка " + i + ": " + result);
            }
        }
        System.out.println("-------------------------------------");
    }
}
