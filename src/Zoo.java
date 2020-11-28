import Animals.*;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.run();
        duck.swim();
        duck.voice("Кряк! Кряк! Кряк!");

        for (int i = 0; i < 10; i++){
            System.out.print("-");
        }System.out.println();

        Lion lion = new Lion();
        lion.run();
        lion.swim();
        lion.voice("Лев рычит!");
    }
}
