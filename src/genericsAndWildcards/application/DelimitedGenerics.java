package genericsAndWildcards.application;

import genericsAndWildcards.entities.Product;
import genericsAndWildcards.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DelimitedGenerics {
    public static void delimitedGenerics(String[] Args) {

        List<Product> prod = new ArrayList<>();

        String path = "C:\\temp\\in2.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                prod.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(prod);
            System.out.println("Max: " + x);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
