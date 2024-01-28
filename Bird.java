import java.time.LocalDate;

public class Bird extends Animal {
    private int wingQuantity;

    public Bird(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    public void toGo() {
        System.out.println(getType() + " не могут бегать");
    }

    public void toSwim() {
        System.out.println(getType() + " не могут плавать");
    }
}