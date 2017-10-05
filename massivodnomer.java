package directorii.uslojnen;
/*	Создайте массив из 20-ти первых чисел Фибоначчи
        и выведите его на экран.
        Напоминаем, что первый и второй члены последовательности равны единицам,
        а каждый следующий — сумме двух предыдущих.*/

        import java.util.Scanner;

public class massivodnomer {
    public static void main(String[] args){
        int[] n= new int[20];
        n[0]=1;
        n[1]=1;
        int array1 = 1;
        int array2 = 1;
        for(int i=2; i<n.length; i++){
            n[i] = array1+array2;
            array2=array1;
            array1 = n[i];
        }
        System.out.println ("массив первых 20 чисел Фибоначчи");
        for (int i = 0; i < n.length; i++) {
            System.out.print ( + n[i]+" ");
        }

    }
}
