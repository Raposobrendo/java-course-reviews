package genericsAndWildcards.application;

import genericsAndWildcards.entities.Circle;
import genericsAndWildcards.entities.Rectangle;
import genericsAndWildcards.entities.Shape;

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
