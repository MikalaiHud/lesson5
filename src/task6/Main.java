package task6;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Дано слово. Заменить в слове все маленькие латинские буквы от ‘a’ до ‘y’ на следующие по алфавиту
 * (для слова “abc2=zx0” получаем “bcd2=zy0”).
 */
public class Main {
    public static void main(String[] args) {
        String string6 = "abc4de+fgh3ij=klm1no-pqrst2UvW05xyz";
        string6 = shiftToright(string6,3);
        System.out.println(string6);
    }
    private static String shiftToright(String intermediateStringNew, int shift) {
        char[] charArray61 = intermediateStringNew.toCharArray();
        String newString = "";
        for (int i = 0; i < charArray61.length; i++) {
            if (charArray61[i] > 96 && charArray61[i] < 123 - shift) {
                charArray61[i] += shift;
            }
            newString += charArray61[i];
        }
        return newString;
    }
}
