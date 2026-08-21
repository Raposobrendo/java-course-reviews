package functionalProgrammingLambda.comparator.application;

import functionalProgrammingLambda.comparator.entities.Product;

import java.util.*;

public class ComparatorLambda {
    public static void main(String[] Args){

        List<Product> list= new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        /*Collections.sort(list);
        OR
        list.sort(new MyComparator());
        OR
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        list.sort(comp);
        OR
        Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort(comp);
        OR
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        OR
        */

        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));
        List<Integer> numbers= Arrays.asList(4, 5, 3, 1, 2);
        numbers.sort(Comparator.comparing(n -> n));

        for(Product p : list){
            System.out.println(p);
        }

        for(Integer i : numbers){
            System.out.println(i);
        }
    }
}
