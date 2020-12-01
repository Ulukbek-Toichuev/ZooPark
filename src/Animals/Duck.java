package Animals;
import Food.*;

public class Duck extends Herbivore implements Fly, Voice, Run, Swim, Sleep {

    @Override
    public void sleep() {
        System.out.println("Утка спит в своем домике на пруду.");
    }

    @Override
    public void fly() {
        System.out.println("Утка летает по своему вольеру.");
    }

    @Override
    public String voice(){
        String voice = "Утка: кряк! Кряк! Кряк!";
        return voice;
    }

    @Override
    public void run(){

        System.out.println("Утка бежит чтобы взлететь.");
    }

    @Override
    public String swim() {
        String swim = "Утка плавает в пруду.";
        System.out.println(swim);
        return swim;
    }

    @Override
    public void eat(Food food) {
        String feed = "Утка кушает из рук корм.";
        String grass = "Утка щипает траву у пруда.";
        super.eat(food);
        boolean isEat = food instanceof Grass;
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
            System.out.println("Утка не плотоядное животное!");
        }
    }


}
