package directorii.uslojnen.dvumer;
import java.util.Random;
public class massiv {
    public static void main(String[] args) {
        Random  rnd = new Random();
        final int N =rnd.nextInt(10)+1;
        final int M=rnd.nextInt (10)+1;
        int max=0;
        int maxI,maxJ;

        int[][] array = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = rnd.nextInt(90) + 10;

            }
        }
// вывод массива
        System.out.println("Двумерный массив:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //Поиск  масимального
        max = array[0][0];
        maxI = 0; maxJ = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j ++) {
                if (array[i][j] > max) {
                    max =array[i][j];
                    maxI = i;  maxJ = j;

                }
            }
        }
        System.out.println("Максимальный элемент = " + max + ". Его интекс = [" + maxI + "," + maxJ + "].");
        for (int i = 0; i < array[maxI].length; i++) {
            array[maxI][i]=0;
            for (int j = 0; j <  array.length; j ++) {
                array[j][maxJ]=0;
            }
        }

        System.out.println("Двумерный массивпо условию :");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
