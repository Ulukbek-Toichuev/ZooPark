package Animals;

import Food.*;

public class Fish extends Carnivorous implements Swim{
    @Override
    public String swim() {
        String swim = "Щука плавает.";
        System.out.println(swim);
        return swim;
    }

    @Override
    public void eat(Food food) {
        String feed = "Щука питается мелкими рыбами и подводными насекомыми.";
        String grass = "Щука кушает корм.";
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
            System.out.println("Щука не травоядное животное!");
        }
    }
}
