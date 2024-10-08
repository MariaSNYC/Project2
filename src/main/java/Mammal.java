public class Mammal extends Animal{
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Mammal Name: " + name + ", Age: " + age);
    }
}

