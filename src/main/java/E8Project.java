import java.util.ArrayList;
import java.util.List;

//You have a list of strings and you want to keep only those that start with “A” and you want to return them in lower case".
public class E8Project {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Avocado");
        strings.add("Apricot");
        strings.add("Orange");

        List<String> filteredStrings = new ArrayList<>();
        for (String str : strings){
            if (str.startsWith("A")) {
                filteredStrings.add(str.toLowerCase());
            }
        }
        System.out.println(filteredStrings);
    }
}
