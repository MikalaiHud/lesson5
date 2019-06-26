package task5;

import java.util.Random;

/**
 * @author Mikalai_Hud
 * <p>
 * Task:
 * Дан массив слов. Заменить последние три символа слов, имеющих выбранную длину на символ "$".
 */
public class Main {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "DogQeqweq";
        words[1] = "CatANDeqEQ";
        words[2] = "Lesson";
        words[3] = "Le3123";
        words[4] = "Os123AX";
        printStringArray(words);
        editingSymbols(words, 3, '$');
        printStringArray(words); //Похоже, меняется сам массив words, ибо words и words2 выводятся одинаковыми
    }

    private static String convertingToString(char[] charArray) {
        String result = "";
        for (int j = 0; j < charArray.length; j++) {
            result += charArray[j];
        }
        return result;
    }

    private static void changeLastSymbols(int numberOfSymbols, char changeSign, char[] intermediateCharArrayMethod) {
        for (int j = intermediateCharArrayMethod.length - numberOfSymbols; j < intermediateCharArrayMethod.length; j++) {
            intermediateCharArrayMethod[j] = changeSign;
        }
    }

    private static void printStringArray(String[] printArray) {
        System.out.println();
        System.out.println("Массив символов:");
        for (int i = 0; i < printArray.length; i++) {
            System.out.println("Элемент № " + i + ": " + printArray[i]);
        }
        System.out.println();
    }

    private static void editingSymbols(String[] intermediateStringArray, int numberOfSymbols, char changeSymbol) {
        for (int i = 0; i < intermediateStringArray.length; i++) {
            char[] intermediateCharArray = intermediateStringArray[i].toCharArray();
            changeLastSymbols(3, '$', intermediateCharArray);
            intermediateStringArray[i] = convertingToString(intermediateCharArray);
        }
    }
}

