package Animals;

import Food.*;

public class Elephant extends Herbivore implements Voice, Run, Walk {

    @Override
    public String voice() {
        String voice = "Слон: трубит!";
        return voice;
    }

    @Override
    public void run() {
        System.out.println("Слон бежит.");
    }

    @Override
    public void walk() {
        System.out.println("Слон ходит по своему вольеру.");
    }

    @Override
    public void eat(Food food) {
        String beef = "Слон кушает свежую траву.";
        String mutton = "Слон кушает сено.";
        super.eat(food);
        boolean isEat = food instanceof Grass;
        if (isEat) {
            int a = (int) (Math.random() * 2);
            switch (a) {
                case 0:
                    System.out.println(beef);
                    break;
                case 1:
                    System.out.println(mutton);
                    break;
            }
        } else {
            System.out.println("Слон не плотоядное животное!");
        }
    }
}
