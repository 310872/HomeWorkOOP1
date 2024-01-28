import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    public void toFly() {
        System.out.println(getType() + " не могут летать");
    }

    public void toSwim() {
        System.out.println(getType() + " не могут плавать");
    }
}
