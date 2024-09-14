
    public class Eagle extends Bird {
        public Eagle(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " screeches.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Eagle Name: " + name + ", Age: " + age);
        }
    }

