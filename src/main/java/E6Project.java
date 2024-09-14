//Create a method to count how many vowels are present in a string “documentation”
public class E6Project {
    public static void main(String[] args) {
        String d="documentation";
        int sum=0;
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i)=='a'||d.charAt(i)=='e'||d.charAt(i)=='i'||d.charAt(i)=='o'||d.charAt(i)=='u'){
                sum++;

            }

        }
        System.out.println("Number of vowels: " + sum);

    }
}
