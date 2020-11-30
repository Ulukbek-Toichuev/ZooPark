import Animals.*;
import Food.*;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        //Создаются объекты животных и работника
        Lion lion = new Lion();
        Duck duck = new Duck();
        Elephant elephant = new Elephant();
        Worker mike = new Worker();


        //Создаются объекты еды
        Food food = new Food();
        Meat meat = new Meat();
        Grass grass = new Grass();

        //Вызываются методы утки
        duck.fly();
        duck.run();
        duck.swim();

        drawALine();

        //Вызываются методы льва
        lion.run();
        lion.swim();

        drawALine();

        //Вызываются методы слона
        elephant.walk();
        elephant.run();

        drawALine();

        /* Создается объект рабочего и вызывается все его методы с разными видами параметров.*/

        //Работник кормит животных
        mike.feed(lion, meat);
        mike.feed(duck, grass);
        mike.feed(elephant, grass);

        drawALine();

        //Животные подают голос работнику
        mike.getVoice(elephant);
        mike.getVoice(lion);
        mike.getVoice(duck);
    }

    //Этот метод нужен для того чтобы отделять выведенные данные на экран
    public static void drawALine(){
        for (int i = 0; i < 10; i++){
            System.out.print("-");
        }System.out.println();
    }

}
