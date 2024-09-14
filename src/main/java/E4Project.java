
//Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and backward. For example, "madam" is a palindrome.
public class E4Project {
    public static void main(String[] args) {
        String p="madam";
        StringBuilder sb=new StringBuilder("madam");
        if ((p.equals(sb.reverse().toString()))){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }

    }
}
