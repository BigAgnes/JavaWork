import java.util.Scanner;

public class HomeworkNormal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int number_one = x / 100;
        int number_two = (x % 100) / 10;
        int number_three = x % 10;
        System.out.println((number_one + number_two + number_three));
    }
}