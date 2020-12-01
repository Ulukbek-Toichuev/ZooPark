import Animals.*;
import Food.*;

public class Zoo {

    public static void main(String[] args) {

        //Создаются объекты животных и работника
        Lion lion = new Lion();
        Horse horse = new Horse();
        Fish pike = new Fish();
        Duck duck = new Duck();
        Bear whiteBear = new Bear();
        Hippo hippo = new Hippo();
        Worker mike = new Worker();


        //Создаются объекты еды
        Food food = new Food();
        Meat meat = new Meat();
        Grass grass = new Grass();

        //Вызываются методы утки
        duck.fly();
        duck.run();
        duck.sleep();

        drawALine();

        //Вызываются методы льва
        lion.run();
        lion.walk();
        lion.sleep();

        drawALine();

        //Вызываются методы бегемота
        hippo.walk();
        hippo.run();
        hippo.sleep();

        drawALine();

        //Вызываются методы лошади
        horse.run();
        horse.walk();
        horse.sleep();

        drawALine();

        //Вызываются методы волка
        whiteBear.run();
        whiteBear.walk();
        whiteBear.sleep();

        drawALine();

        //Вызываются методы щуки
        pike.swim();

        drawALine();
        /* Создается объект рабочего и вызывается все его методы с разными видами параметров.*/

        //Работник кормит животных
        mike.feed(lion, meat);
        mike.feed(duck, grass);
        mike.feed(hippo, grass);
        mike.feed(pike, meat);
        mike.feed(horse, grass);
        mike.feed(whiteBear, meat);

        drawALine();

        //Животные подают голос работнику
        mike.getVoice(hippo);
        mike.getVoice(lion);
        mike.getVoice(duck);
        mike.getVoice(horse);
        mike.getVoice(whiteBear);

        drawALine();

        //Пруд – массив с животными которые умеют плавать.
        String[] pond = new String[5];
        pond[0] = hippo.swim();
        pond[1] = duck.swim();
        pond[2] = pike.swim();
        pond[3] = lion.swim();
        pond[4] = whiteBear.swim();
    }

    //Этот метод нужен для того чтобы отделять выведенные данные на экран
    public static void drawALine(){
        for (int i = 0; i < 10; i++){
            System.out.print("-");
        }System.out.println();
    }

}
