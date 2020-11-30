package Animals;

import Food.*;

public class Lion extends Carnivorous implements Run, Swim, Voice{

    @Override
    public void run(){
        System.out.println("Лев бежит.");
    }

    @Override
    public void swim(){
        System.out.println("Лев плавает.");
    }

    @Override
    public String voice(String s){
        System.out.println(s);
        return s;
    }

    @Override
    public void eat(Food food) {
        String beef = "Лев кушает говядину";
        String mutton = "Лев кушает баранину";
        super.eat(food);
        boolean isEat = food instanceof Meat;
        if (isEat == true){
            int a = (int) (Math.random() *2);
            switch (a) {
                case 0:
                    System.out.println(beef);
                    break;
                case 1:
                    System.out.println(mutton);
                    break;
            }
        }else if (isEat == false){
            System.out.println("Лев не травоядное животное!");
        }
    }
}
