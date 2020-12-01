package Animals;

import Food.*;

public class Lion extends Carnivorous implements Run, Swim, Voice, Walk, Sleep{

    @Override
    public void sleep() {
        System.out.println("Лев спит в своей пещере.");
    }

    @Override
    public void walk() {
        System.out.println("Лев бегает по своему вольеру.");
    }

    @Override
    public void run(){
        System.out.println("Лев бегает по своему вольеру.");
    }

    @Override
    public String swim() {
        String swim = "Лев плавает в пруду чтобы охладится.";
        System.out.println(swim);
        return swim;
    }

    @Override
    public String voice(){
        String voice = "Лев: издает рёв!";
        return voice;
    }

    @Override
    public void eat(Food food) {
        String beef = "Лев кушает говядину.";
        String mutton = "Лев кушает баранину.";
        super.eat(food);
        boolean isEat = food instanceof Meat;
        if (isEat){
            int a = (int) (Math.random() *2);
            switch (a) {
                case 0:
                    System.out.println(beef);
                    break;
                case 1:
                    System.out.println(mutton);
                    break;
            }
        }else {
            System.out.println("Лев не травоядное животное!");
        }
    }
}
