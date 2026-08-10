package genericsSetMap.set.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetStatement1 {
    public static void main(String[] Args){

        // Set<String> set = new HashSet<>(); Faster, unordered
        // Set<String> set = new TreeSet<>(); Slower, ordered by crescent
        Set<String> set = new LinkedHashSet<>(); // faster than Treeset, ordered by inserted order

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.remove("Tablet");

        System.out.println(set.contains("Notebook"));

        set.removeIf(x -> x.length() >= 3);

        for(String p : set){
            System.out.println(p);
        }
    }
}
