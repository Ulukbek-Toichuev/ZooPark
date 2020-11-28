package Animals;

public class Duck extends Herbivore implements Fly, Voice, Run, Swim {

    @Override
    public void fly() {

        System.out.println("Утка летает.");
    }

    @Override
    public String voice(String s){
        System.out.println(s);
        return s;
    }

    @Override
    public void run(){

        System.out.println("Утка бежит.");
    }

    @Override
    public void swim(){
        System.out.println("Утка плавает.");
    }
}
