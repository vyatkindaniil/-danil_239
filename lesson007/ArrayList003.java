package directorii.lesson007;
import java.util.*;
/*
Заполнить списочный массив словами вводимыми с клавиатуры.
Ввод осуществляется до дех пор, пока не введен символ ".".
Во всех элементах с нечетными индексами поменять местами первый и последний символ.
 */
public class ArrayList003 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<>();
        String slovo;
        String slovo2;
        int i =0;
        //Заполняем массив
        do{
            System.out.print("Введите слово: ");
            slovo = scn.nextLine();
            Name.add(slovo);
            slovo=Name.get(i);
            i++;
        }while (!".".equals(slovo));
        for (String name : Name) {
            System.out.println(name);

        }
        //Меняем первый и последний символ в не четных индексах
        for(int index=0;index<i;index++){
            if(index%2!=0) {
                int h= Name.size()-1;
                slovo2=Name.get(index);
                String [] str=new String[h];
                char one=slovo2.charAt(0);
                char last=slovo2.charAt(slovo2.length()-1);
                //вывод
                String u= "";
                u = u + last  ;
                for(int b=1;b<slovo2.length()-1;b++) {
             u=u+ slovo2.charAt(b);
            }
            u=u+one;


                System.out.println(u);
        }
    }
}}
