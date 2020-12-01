package Animals;

import Food.*;

public class Fish extends Carnivorous implements Swim{
    @Override
    public void swim(){
        System.out.println("плавает.");
    }

    @Override
    public void eat(Food food) {
        String feed = "Рыба питается планктонами и подводными насекомыми.";
        String grass = "Рыба кушает корм.";
        super.eat(food);
        boolean isEat = food instanceof Meat;
        if (isEat){
            int a = (int) (Math.random() *2);
            switch (a) {
                case 0:
                    System.out.println(feed);
                    break;
                case 1:
                    System.out.println(grass);
                    break;
            }
        }else {
            System.out.println("Рыба не травоядное животное!");
        }
    }
}
