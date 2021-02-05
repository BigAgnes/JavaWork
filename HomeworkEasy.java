import java.util.Scanner;

public class HomeworkEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 2;
        int y = 1;

        while (x <= n)
        {
            y = x * y;
            x++;
            System.out.println(y);
        }
    }
}
//Вычислить факториал числа n