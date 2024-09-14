public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Parrot Name: " + name + ", Age: " + age);
    }
}

