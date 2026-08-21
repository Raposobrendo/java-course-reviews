package functionalProgrammingLambda.predicate.application;

import functionalProgrammingLambda.predicate.entities.Product;
import functionalProgrammingLambda.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] Args){

        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Tv", 900.0));
        prod.add(new Product("Mouse", 50.0));
        prod.add(new Product("Tablet", 350.50));
        prod.add(new Product("HD Case", 80.90));

        // prod.removeIf(p -> p.getPrice() >= 100.0);
        // prod.removeIf(new ProductPredicate());
        // prod.removeIf(Product::staticProductPredicate);
        // prod.removeIf(Product::nonStaticProductPredicate);

        /* Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        prod.removeIf(pred); */

        prod.removeIf(p -> p.getPrice() >= 100.0);

        for(Product p : prod){
            System.out.println(p);
        }


        

    }
}
