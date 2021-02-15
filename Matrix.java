import java.util.Arrays;

public class Matrix {
    double[][] array = new double[2][2];
    int rows;
    int columns;

    public Matrix (double[][] array){
        this.array = array;
        this.rows = array.length;
        this.columns = array[0].length;
    }

    public void additionOfArrays(Matrix arraySecond){
        if((this.rows == arraySecond.rows) && (this.columns == arraySecond.columns))
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += arraySecond.array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

//Создать класс "Матрица". Класс должен иметь следующие поля:
//1) двумерный массив вещественных чисел;
//2) количество строк и столбцов в матрице.
//
//Класс должен иметь следующие методы:
//1) сложение с другой матрицей;
//2) умножение на число;
//3) вывод на печать;
//4) умножение матриц - по желанию.
