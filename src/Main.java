//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
import java.util.*;

import static java.util.Comparator.naturalOrder;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students1 = new HashMap<>();
        students1.put("Maria", 19);
        students1.put("Andrea", 26);
        students1.put("Anna", 29);
        students1.put("Sara", 33);

        System.out.println(students1.values());

        Collection<Integer> values = students1.values();
        ArrayList<Integer> studentsValue = new ArrayList<>(values);

        studentsValue.sort(naturalOrder());

        System.out.println("List of students: " + studentsValue);
    }
}