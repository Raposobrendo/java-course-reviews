package genericsSetMap.exercises.exerciseMap.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        String path = "C:\\temp\\in4.txt";
        Map<String, Integer> candidates = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);
                candidates.put(name, candidates.getOrDefault(name, 0) + votes);

                line = br.readLine();
            }

            for(String key : candidates.keySet()){
                System.out.println(key + ": " + candidates.get(key));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
