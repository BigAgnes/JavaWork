import java.util.Random;

public class HomeworkHard {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            array[i]=random.nextInt(1000);
        }
        for (int i = 0; i < 100; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println(min);
        while (min % 3 == 0 && min >= 3){
            min /= 3;
        }
        if (min == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
