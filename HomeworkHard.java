import java.util.Random;
import java.util.Scanner;

public class HomeworkHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = scanner.nextLine();
        char ch;
        int count = 0;

        for (int i = 0; i < string.length(); i++)
        {
            ch = string.charAt(i);
            if(Character.isLowerCase(ch))
            {
                count++;
            }
        }
        if(count == string.length() && string.matches("[a-z]+"))
        {
            System.out.println("В строке все буквы латинские в нижнем регистре. Круто!");
        }
        else System.out.println("Не все/ни одна из букв в строке содержат латинские буквы в нижнем регистре");
    }
}
