import Animals.*;
import Food.*;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        //Создаются объекты животных и работника
        Lion lion = new Lion();
        Horse horse = new Horse();
        Fish fish = new Fish();
        Duck duck = new Duck();
        Wolf wolf = new Wolf();
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
        duck.sleep();

        drawALine();

        //Вызываются методы льва
        lion.run();
        lion.swim();
        lion.walk();
        lion.sleep();

        drawALine();

        //Вызываются методы слона
        elephant.walk();
        elephant.run();
        elephant.sleep();

        drawALine();

        //Вызываются методы лошади
        horse.run();
        horse.walk();
        horse.sleep();

        drawALine();

        //Вызываются методы волка
        wolf.run();
        wolf.walk();
        wolf.sleep();

        drawALine();

        //Вызываются методы рыбы
        fish.swim();

        drawALine();
        /* Создается объект рабочего и вызывается все его методы с разными видами параметров.*/

        //Работник кормит животных
        mike.feed(lion, meat);
        mike.feed(duck, grass);
        mike.feed(elephant, grass);
        mike.feed(fish, meat);
        mike.feed(horse, grass);
        mike.feed(wolf, meat);

        drawALine();

        //Животные подают голос работнику
        mike.getVoice(elephant);
        mike.getVoice(lion);
        mike.getVoice(duck);
        mike.getVoice(horse);
        mike.getVoice(wolf);
    }

    //Этот метод нужен для того чтобы отделять выведенные данные на экран
    public static void drawALine(){
        for (int i = 0; i < 10; i++){
            System.out.print("-");
        }System.out.println();
    }

}
