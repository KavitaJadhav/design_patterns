package factory.com.app;

public class AnimalBuilder {
    public Animal get_animal(AnimalType type) {
        if (type == AnimalType.DOG) {
            return new Dog();
        }
        if (type == AnimalType.CAT) {
            return new Cat();
        }
        if (type == AnimalType.HEN) {
            return new Hen();
        }
        return null;
    }

}
