package Animals;

import Food.*;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        super.eat(food);
        boolean isEat = food instanceof Grass;
        System.out.println(isEat);
    }
}
