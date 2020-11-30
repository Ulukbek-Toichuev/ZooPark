import Animals.*;
import Food.*;

public class Zoo {

    public static void main(String[] args) {
        Food food = new Food();
        Meat meat = new Meat();
        Grass grass = new Grass();
        Duck duck = new Duck();
        duck.eat(meat);
        duck.fly();
        duck.run();
        duck.swim();
        duck.voice("Кряк! Кряк! Кряк!");

        for (int i = 0; i < 10; i++){
            System.out.print("-");
        }System.out.println();

        Lion lion = new Lion();
        lion.eat(meat);
    }
}
