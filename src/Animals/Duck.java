package Animals;
import Food.*;

public class Duck extends Herbivore implements Fly, Voice, Run, Swim {

    @Override
    public void fly() {

        System.out.println("Утка летает.");
    }

    @Override
    public String voice(){
        String voice = "Утка: кряк! Кряк! Кряк!";
        //System.out.println(voice);
        return voice;
    }

    @Override
    public void run(){

        System.out.println("Утка бежит.");
    }

    @Override
    public void swim(){
        System.out.println("Утка плавает.");
    }


    @Override
    public void eat(Food food) {
        String feed = "Утка кушает из рук корм.";
        String grass = "Утка щипает траву у пруда.";
        super.eat(food);
        boolean isEat = food instanceof Grass;
        if (isEat == true){
            int a = (int) (Math.random() *2);
            switch (a) {
                case 0:
                    System.out.println(feed);
                    break;
                case 1:
                    System.out.println(grass);
                    break;
            }
        }else if (isEat == false){
            System.out.println("Утка не плотоядное животное!");
        }
    }


}
