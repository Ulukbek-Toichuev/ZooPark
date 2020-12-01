package Animals;

import Food.*;

public class Horse extends Herbivore implements Voice, Run, Walk, Sleep{

    @Override
    public void sleep() {
        System.out.println("Лошадь спит в своей конюшне.");
    }

    @Override
    public String voice(){
        String voice = "Лошадь: Иго-го!";
        return voice;
    }

    @Override
    public void run() {
        System.out.println("Лошадь скачет по своему вольеру.");
    }

    @Override
    public void walk() {
        System.out.println("Лошадь ходит по своему вольеру.");
    }

    @Override
    public void eat(Food food) {
        String feed = "Лошадь кушает сено.";
        String grass = "Утка щипает траву в своем вольере.";
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
            System.out.println("Лошадь не плотоядное животное!");
        }
    }
}
