import java.util.Scanner;

public class HomeworkEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int x = 0;

        while (i <= n) {
            x = x + i;
            i++;
        }
        System.out.println(x);
    }

}
