package directorii;
import java.util.Scanner;

public class vetvivibor {
    public static void main(String[] args) {
    double x;
    double y;
    Scanner scn = new Scanner(System.in);
    System.out.print("Введи х: ");
    x = scn.nextDouble();
    if (x > 0){
        y = Math.sin( Math.pow(x, 2));
        System.out.print( "ответ:" + y );
    } else if (x < 0){
        y = 1 - 2 * Math.sin( Math.pow(x, 2));
        System.out.print ( " в противном случае " + y);
    }
}
}
