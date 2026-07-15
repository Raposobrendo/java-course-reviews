package genericsAndWildcards.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcards1 {
    public static void wildcard(){
        List<Integer> intList = new ArrayList<>();
        intList = Arrays.asList(5, 2, 10);
        printList(intList);

    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
