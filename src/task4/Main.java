package task4;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Вводится строка.
 * Удалить из нее все пробелы.
 * После этого определить, является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder org4 = new StringBuilder();
        org4.append("к а з а к");
        System.out.println(org4);
        StringBuilder org4b = spaceDeleter(org4);
        System.out.println(org4b);
        palindrome(org4b);
    }
    private static StringBuilder spaceDeleter ( StringBuilder intermediateString) {
        for (int i = 0; i < intermediateString.length(); i++) {
            if (intermediateString.charAt(i) == ' ') {
                intermediateString.deleteCharAt(i);
            }
        }
        return intermediateString;
    }
    private static void palindrome (StringBuilder intermediateString) {
        StringBuilder org4Reverse = new StringBuilder();
        org4Reverse.append(intermediateString);
        org4Reverse.reverse();
        if (intermediateString.toString().equalsIgnoreCase(org4Reverse.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
