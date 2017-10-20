package directorii.lesson008;
import java.io.*;
import java.util.*;
/**
 * 9)	Имеется текстовый файл. Добавить в него строку из двенадцати черточек  (------------), разместив ее:
 а) после пятой строки;
 б) после последней из строк, в которых нет пробела.
 Если таких строк нет, то новая строка должна быть добавлена после всех строк имеющегося файла.
 */
public class file {
    public static void main(String[] args) throws Exception {
       //Создаем файл
        Scanner in = new Scanner(System.in);
        System.out.print("Введите диск куда сохранить файл: ");
        String file = in.nextLine();
        System.out.print("Введите название файла: ");
        String fileName = in.nextLine();
        System.out.print("Введите количество строк: ");
        int k = in.nextInt();
        in.nextLine();
        Random rnd = new Random();
        FileWriter fileWriter = new FileWriter(file + ":\\" + fileName);
        for (int i = 0; i < k; i++) {
           System.out.print("Введите количество цифр в [" + i + "] строке: ");
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                fileWriter.write((rnd.nextInt(20) + 1) + " ");
            }
            fileWriter.write("\n");
        }

        fileWriter.close();
        FileReader fileReader = new FileReader(file + ":\\" + fileName);
        Scanner reader = new Scanner(fileReader);
        while (reader.hasNextLine()) {

        }
    }
}