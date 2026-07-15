package genericsAndWildcards.services;

import java.util.List;

public class CalculationService<T> {

    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        T max = list.get(0);
        for(T value : list){
            if(value.compareTo(max) > 0){
                max = value;
            }
        }
        return max;
    }

}
