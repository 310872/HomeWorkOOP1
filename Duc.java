import java.time.LocalDate;

public class Duc extends Animal {
    private int wingQuantity;

    public Duc(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }
}
