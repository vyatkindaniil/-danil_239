package directorii;

import java.util.Scanner;
public class lineinoe {
    public static void main( String[] args){
    int R, r;
    double  S;
    Scanner in = new Scanner(System.in);
    System.out.print("Введи внешний радиус R = ");
    R = in.nextInt();
    System.out.print("Введи внутрений радиус r = ");
    r = in.nextInt();

    S = 3.14 * ((Math.pow(R,2)) - (Math.pow(r,2)));
    System.out.print("Площадь s = ");
    System.out.println( S );
    System.out.printf("Отформатированное значение S = %.4f", S);
}
}
