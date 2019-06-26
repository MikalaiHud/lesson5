package task3;

/**
 * @author Mikalai_Hud
 * <p>
 * Task:
 * Вводится строка.
 * Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef"
 */
public class Main {
    public static void main(String[] args) {
        String exampleString = "new west string";
        System.out.println(exampleString);
        System.out.println();
        exampleString = spaceDeleter(exampleString);
        exampleString = iterationDeleter(exampleString);
        System.out.println("Result:" + exampleString);
    }

    private static String spaceDeleter(String intermediateString) {
        String result = "";
        String[] intermediateStringArray = intermediateString.split(" ");
        for (int i = 0; i < intermediateStringArray.length; i++) {
            result += intermediateStringArray[i];
        }
        return result;
    }

    private static String iterationDeleter(String intermedateString) {
        char[] intermediateCharArray = intermedateString.toCharArray();
        for (int i = 0; i < intermediateCharArray.length - 1; i++) {
            char tempIterationChar = intermediateCharArray[i];
            for (int j = i + 1; j < intermediateCharArray.length; j++) {
                if (intermediateCharArray[j] == tempIterationChar) {
                    intermediateCharArray[j] = 0;
                }
            }
        }
        String result = "";
        for (int i = 0; i < intermediateCharArray.length; i++) {
            result += intermediateCharArray[i];
        }
        return result;
    }
}
