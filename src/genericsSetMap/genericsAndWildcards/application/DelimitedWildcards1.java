package genericsSetMap.genericsAndWildcards.application;

import genericsSetMap.genericsAndWildcards.entities.Circle;
import genericsSetMap.genericsAndWildcards.entities.Rectangle;
import genericsSetMap.genericsAndWildcards.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class DelimitedWildcards1 {
    public static void delimitedWildcards(){

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(3.0, 2.0));
        shapeList.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(shapeList));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
