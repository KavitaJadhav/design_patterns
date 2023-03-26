package factory.com.app;

public class App {
    public static void main(String[] args) {
        new AnimalBuilder().get_animal(AnimalType.DOG).eat();
        new AnimalBuilder().get_animal(AnimalType.CAT).eat();
        new AnimalBuilder().get_animal(AnimalType.HEN).eat();

    }
}