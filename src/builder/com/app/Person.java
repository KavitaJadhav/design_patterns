package builder.com.app;

public class Person {
    private String name;
    private String email;
    private String address;
    private int age;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.email = personBuilder.email;
        this.address = personBuilder.address;
        this.age = personBuilder.age;
    }

    public static class PersonBuilder {
        private final String name;
        private final String email;
        private String address;
        private int age;

        public PersonBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public PersonBuilder set_address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder set_age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public String toString() {
        return name + " , " + address + " , " + email + " , " + age;
    }
}
