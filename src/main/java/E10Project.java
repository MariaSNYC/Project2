import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E10Project {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Orange");
        listWithDuplicates.add("Banana");

        // Print the original list
        System.out.println("Original List: " + listWithDuplicates);

        // Convert the ArrayList to a Set to remove duplicates
        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

        // Print the list without duplicates
        System.out.println("List without duplicates: " + setWithoutDuplicates);
    }
}

