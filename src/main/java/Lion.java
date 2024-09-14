import com.sun.tools.javac.Main;

    public class Lion extends Mammal {
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " roars.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Lion Name: " + name + ", Age: " + age);
        }
    }

