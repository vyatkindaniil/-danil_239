package directorii.lesson008;
import java.io.*;
import java.util.*;
/*Имеется текстовый файл. Добавить в него строку из двенадцати черточек  (------------), разместив ее:
        а) после пятой строки;
        б) после последней из строк, в которых нет пробела.
        Если таких строк нет, то новая строка должна быть добавлена после всех строк имеющегося файла.*/
public class file5 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("E://111/mane12.txt");
        Scanner reader = new Scanner(fileReader);
        ArrayList<String> array = new ArrayList<>();
        while (reader.hasNextLine()) {
            array.add(reader.nextLine());
        }
        // условие Б
        for(int i=0;i<array.size();i++){
        String N= array.get(i);
           for (int j=0;j< N.length();j++){
               char simvol = ' ';
               if(N.charAt(j) == simvol) {
                   break;
               }
               int g=N.length()-1;
               if(g==j){
                   array.add(i+1,"----------");
                   i++;
               }
           }
        }
        //условие A
        array.add(5,"----------");
        FileWriter fileWriter1 = new FileWriter("E://111/mane12.txt");
        for (int i = 0; i < array.size(); i++) {
            fileWriter1.write(array.get(i));
            fileWriter1.write("\n");
        }
        fileWriter1.close();
}
}
