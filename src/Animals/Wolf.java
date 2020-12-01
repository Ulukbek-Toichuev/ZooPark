package Animals;

import Food.*;

public class Wolf extends Carnivorous implements Run, Walk, Voice, Sleep {

    @Override
    public void sleep() {
        System.out.println("Волк спит в своей пещере.");
    }

    @Override
    public void run() {
        System.out.println("Волк ходит по своему вольеру.");
    }

    @Override
    public void walk() {
        System.out.println("Волк бегает по своему вольеру.");
    }

    @Override
    public String voice() {
        String voice = "Волк: воет";
        return voice;
    }

    @Override
    public void eat(Food food) {
        String beef = "Волк кушает говядину.";
        String mutton = "Волк кушает баранину.";
        super.eat(food);
        boolean isEat = food instanceof Meat;
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
            System.out.println("Волк не травоядное животное!");
        }
    }
}
