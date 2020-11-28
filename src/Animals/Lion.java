package Animals;

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
}
