import java.time.LocalDate;

public class Rat extends Animal {
    public Rat(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    public void toFly() {
        System.out.println(getType() + " не могут летать");
    }

    public void toSwim() {
        System.out.println(getType() + " не могут плавать");
    }

}
