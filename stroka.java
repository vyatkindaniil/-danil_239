/**
 Дана произвольная строка,
 слова в которой разделены пробелами, заменить эти пробелы символом «:»
 */
package directorii;
import java.util.Scanner;

public class stroka {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("введи стороку, слова в которой разделены пробелами");
        String text = scn.nextLine();
        text = text.replace(' ', '*');
        System.out.println(text);
    }
}
