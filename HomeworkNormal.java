import java.util.Arrays;

public class HomeworkNormal {
    public static void main(String[] args) {
        int [] array = new int[25];
        int numberOne = 1;
        int numberTwo = 0;
        int numberThree;

        for(int i = 0; i < array.length; i++)
        {
            numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
            array[i] = numberTwo;
        }
        System.out.println(Arrays.toString(array));
    }
}