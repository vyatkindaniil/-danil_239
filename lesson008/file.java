package directorii.lesson008;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * 9)	Имеется текстовый файл. Добавить в него строку из двенадцати черточек  (------------), разместив ее:
 а) после пятой строки;
 б) после последней из строк, в которых нет пробела.
 Если таких строк нет, то новая строка должна быть добавлена после всех строк имеющегося файла.
 */

public class file {
    public static void main(String[] args) throws Exception {
        FileWriter file = new FileWriter("MyText.txt");
        for (int i = 0; i < 4; i++) {
            file.write(" " + "\n");
        }
        for( int i=0;i<12;i++ ){
            file.write("-");
        }
        file.close();
    }
}