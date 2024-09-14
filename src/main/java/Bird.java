
    public class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is pecking at food.");
        }
        public void makeSound() {
            System.out.println(name + " chirps.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Bird Name: " + name + ", Age: " + age);
        }
    }

