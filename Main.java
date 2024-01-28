import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 03, 20), new Illness("Лишай"));
        Animal animal = new Animal();
        cat.setIllness(new Illness(null));
        // System.out.println(cat.getIllness());
        Animal dog = new Dog("Персик", LocalDate.of(2020, 02, 10), new Illness("Лишай"));
        // System.out.println(dog.illness);
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Ласточка", LocalDate.of(2020, 03, 20), new Illness("Лишай"), 2));
        // System.out.println(list);
        Animal bird = new Bird("Ласточка", LocalDate.of(2020, 03, 20), new Illness("Лишай"), 2);
        Animal duc = new Duc("Серая шейка", LocalDate.of(2020, 03, 20), new Illness("Пероз"), 2);
        Animal snake = new Snake("Гадюка", LocalDate.of(2020, 03, 20), new Illness("Амебиаз"));
        Animal swimmingTurtle = new SwimmingTurtle("Тортила", LocalDate.of(2020, 03, 20), new Illness("Склероз"));
        Animal rat = new Rat("Лариса", LocalDate.of(2020, 03, 20), new Illness("Листериоз"));
        rat.toFly();
    }
}