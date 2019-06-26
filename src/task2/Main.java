package task2;

/**
 * @author Mikalai_Hud
 *
 * Task:
 * Найти в строке указанную подстроку и заменить ее на новую.
 * Строку, ее подстроку для замены и новую подстроку вводит пользователь.
 */
public class Main {

    public static void main(String[] args) {
        String org2 = changeString("Kolya Hud Krutoy", "Artsiom Buhautsou", "Kolya Hud");
        System.out.println(org2);
    }

    private static String changeString(String mainString, String replaceString, String oldString) {
        int i = mainString.indexOf(oldString);
        if (i != 1) {
            String result = mainString.substring(0, i);
            result += replaceString;
            result += mainString.substring(i + oldString.length());
            return result;
        }
        return null;
    }
    }
