//Count the Number of Words in a String: Write a function to count the number of words in a given string. Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.

public class E7Project {
    public static void main(String[] args) {
        String s="Hello,World!";

        String[]words=s.split("\\W+");
        int wordCount=words.length;
        System.out.println("Number of words: "+wordCount);
    }
}
