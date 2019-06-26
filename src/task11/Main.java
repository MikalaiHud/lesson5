package task11;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Строка состоит из слов, разделенных одним или несколькими пробелами.
 * Поменяйте местами наибольшее по длине слово и наименьшее.
 */
public class Main {
    public static void main(String[] args) {
        String string11 = "Строка для сравнения длин слов и перемены местами наибольшего и наименьшего слов";
        System.out.println(string11);
        String[] stringArray11 = stringToArray(string11);
        printStringArray(stringArray11);
        int minString = minStringIndex(stringArray11);
        int maxString = maxStringIndex(stringArray11);
        System.out.println("Минимальный индекс равен " + minString);
        System.out.println("Максимальный индекс равен " + maxString);
        String newString11 = minMaxReverseArrayToString(stringArray11, minString, maxString);
        System.out.println(newString11);
    }
    private static String[] stringToArray (String intermediateString) {
        String[] intermediateStringArray = intermediateString.split(" ");
        return intermediateStringArray;
    }
    private static int minStringIndex(String[] intermediateArray) {
        int minIndex = 0;
        int minLength = intermediateArray[0].length();
        for (int i = 0; i < intermediateArray.length; i++) {
            if (intermediateArray[i].length() < minLength) {
                minIndex = i;
                minLength = intermediateArray[i].length();
            }
        }
        return minIndex;
    }
    private static int maxStringIndex(String[] intermediateArray) {
        int maxIndex = 0;
        int maxLength = intermediateArray[0].length();
        for (int i = 0; i < intermediateArray.length; i++) {
            if (intermediateArray[i].length() > maxLength) {
                maxIndex = i;
                maxLength = intermediateArray[i].length();
            }
        }
        return maxIndex;
    }


    private static String minMaxReverseArrayToString (String[] intermediateStringArray, int minIndex, int maxIndex) {
        String tempString;
        tempString = intermediateStringArray[minIndex];
        intermediateStringArray[minIndex] = intermediateStringArray[maxIndex];
        intermediateStringArray[maxIndex] = tempString;
        String result = "";
        for (int i = 0; i < intermediateStringArray.length - 1; i++) {
            result += intermediateStringArray[i];
            result += " ";
        }
        result += intermediateStringArray[intermediateStringArray.length - 1];
        return result;
    }
    private static void printStringArray(String[] intermediateArray) {
        System.out.println("----------------------------------------------");
        System.out.println("Массив строк:");
        for (int i = 0; i < intermediateArray.length; i++) {
            System.out.println("Строка " + i + ": " + intermediateArray[i]);
        }
        System.out.println("----------------------------------------------");
    }
}
