import java.util.LinkedHashMap;
import java.util.Map;

//Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character. For example, in the string "abracadabra", the first non-repeating character is 'c'.
public class E9Project {
    public static void main(String[] args) {
        String str="abracadabra";
        char result=E9Project(str);

        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    public static char E9Project(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return 0; // Return 0 if no non-repeating character is found
    }
    }




