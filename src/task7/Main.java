package task7;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Дана строка. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.
 */
public class Main {
    public static void main(String[] args) {
        String string7a = "abcdfdgffgsabcdfabc";
        String string7b = "zulus ";
        System.out.println(string7a);
        System.out.println(string7b);
        System.out.println();
        string7a = changeStringToWWW(string7a);
        string7b = changeStringToWWW(string7b);
        System.out.println(string7a);
        System.out.println(string7b);
    }
    private static String changeStringToWWW(String newString) {
        int index = newString.indexOf("abc");
        if (index == 0) {
            String result = "";
            char[] intermediateArray = newString.toCharArray();
            for (int i = 0; i < intermediateArray.length; i++) {
                if (i >= 0 && i < 3) {
                    intermediateArray[i] = 'w';
                }
                result += intermediateArray[i];
            }
            return result;
        } else {
            return newString += "zzz";
        }
    }
}
