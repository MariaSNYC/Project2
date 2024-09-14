import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain the same characters in a different order. For example, "listen" and "silent" are anagrams.
public class E5Project {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

          char [] aChars=a.toCharArray();
          char[] bChars=b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        // Step 3: Compare the sorted arrays
        if (Arrays.equals(aChars, bChars)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }


        }

