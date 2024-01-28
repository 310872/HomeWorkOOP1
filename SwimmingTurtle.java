import java.time.LocalDate;

public class SwimmingTurtle extends Animal {

    public SwimmingTurtle(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    public void toGo() {
        System.out.println(getType() + " не могут бегать");
    }

    public void toFly() {
        System.out.println(getType() + " не могут летать");
    }
}
