package directorii.lesson009;

/**
 1)	Написать класс, позволяющий определить какой цифрой
 заканчивается целое произвольное число – четной или нечетной.
 Написать тестовый класс для проверки
 */
public class classobekt {
        int num;
        String message;
        void ttt(){
            //проверка на четность
        if (num%2==0){
          message="число четное";
        }
        else{
            message= "число не четное";
        }

    }
}
