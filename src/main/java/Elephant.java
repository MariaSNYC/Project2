
    public class Elephant extends Mammal {
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " trumpets.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Elephant Name: " + name + ", Age: " + age);
        }
    }
