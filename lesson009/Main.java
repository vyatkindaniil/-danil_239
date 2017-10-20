package directorii.lesson009;
import java.util.Scanner;
/**
тестовый класс
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("введи произвольное число ");
        int num = scn.nextInt();
        classobekt  ime = new classobekt();
        ime.num=num;
        ime.ttt();
        System.out.println(ime.message);
    }
}

