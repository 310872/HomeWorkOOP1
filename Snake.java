import java.time.LocalDate;

public class Snake extends Animal {
    public Snake(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    public void toGo() {
        System.out.println(getType() + " не могут бегать");
    }

    public void toFly() {
        System.out.println(getType() + " не могут летать");
    }

    public void toSwim() {
        System.out.println(getType() + " не могут плавать");
    }
}

