package directorii.uslojnen;
/*Ученикам 1 класса назначается дополнительный стакан молока (200 мл),
если их вес меньше 30 кг. Определить сколько литров молока потребуется
ежедневно для одного класса, состоящего из N-учеников.*/

import java.util.Scanner;
public class algoritm {
    public static void main(String[] args) {
        double N = 0;
        double m = 0;
        double z=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Количество учеников в классе = ");
        N = scn.nextInt();
        for(int i=0; i < N; i++){
            System.out.print("вес ученика =");
            m = scn.nextInt();
            if(m<30){
                z=z+0.200;
            }
        }
        System.out.print( "кол-во молока потребуется " + z);
    }
}

