package Animals;

import Food.*;

public class Bear extends Carnivorous implements Run, Walk, Voice, Sleep, Swim {

    @Override
    public void sleep() {
        System.out.println("Медведь спит в своей пещере.");
    }

    @Override
    public String swim() {
        String swim = "Медведь плавает в пруду чтобы охладится.";
        System.out.println(swim);
        return swim;
    }

    @Override
    public void run() {
        System.out.println("Медведь ходит по своему вольеру.");
    }

    @Override
    public void walk() {
        System.out.println("Медведь бегает по своему вольеру.");
    }

    @Override
    public String voice() {
        String voice = "Медведь: издает рев.";
        return voice;
    }

    @Override
    public void eat(Food food) {
        String beef = "Медведь кушает говядину.";
        String mutton = "Медведь кушает рыбу.";
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
            System.out.println("Медведь не травоядное животное!");
        }
    }
}
