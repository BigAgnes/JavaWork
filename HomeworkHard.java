import java.util.Arrays;
import java.util.Random;

public class HomeworkHard {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10800);
            Arrays.sort(array);
        }
        System.out.println(array[0]);
    }
}