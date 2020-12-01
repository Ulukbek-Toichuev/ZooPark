package Animals;

import Food.*;

public class Hippo extends Herbivore implements Voice, Run, Walk, Sleep, Swim {

    @Override
    public void sleep() {
        System.out.println("Бегемот спит в свое пещере.");
    }

    @Override
    public String voice() {
        String voice = "Бегемот: фыркает!";
        return voice;
    }

    @Override
    public void run() {
        System.out.println("Бегемот бегает по своему воьеру.");
    }

    @Override
    public void walk() {
        System.out.println("Бегемот ходит по своему вольеру.");
    }

    @Override
    public String swim() {
        String swim = "Бегемот плавает.";
        System.out.println(swim);
        return swim;
    }

    @Override
    public void eat(Food food) {
        String beef = "Бегемот кушает свежую траву.";
        String mutton = "Бегемот кушает фрукты.";
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
            System.out.println("Бегемот не плотоядное животное!");
        }
    }
}
