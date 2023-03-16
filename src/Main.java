import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10,9,8,7,6,5,4,3,2,1));
        System.out.println("ArrayList : " + list);

        List<Integer> filterList =
                list.stream()
                        .filter(n -> n%2==0)
                        .toList();
        System.out.println("Filtered List(Even Element) : " + filterList);

        List<Integer> sortedList =
                list.stream()
                        .map(n -> n*2)
                        .sorted()
                        .toList();
        System.out.println("Sorted List : " + sortedList);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,2,3,4,5));
        list2.addAll(list);
        System.out.println("ArrayList 2 : " + list2);

//        Convert List To Set
        Set<Integer> set =
                list2.stream().
                        collect(Collectors.toSet());
        System.out.println("List to Set(Remove Duplicates) : " + set);
    }
}