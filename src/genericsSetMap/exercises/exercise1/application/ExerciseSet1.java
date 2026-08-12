package genericsSetMap.exercises.exercise1.application;

import genericsSetMap.exercises.exercise1.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExerciseSet1 {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        // String path = sc.nextLine();
        String path = "C:\\temp\\in3.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                //LocalDateTime moment = LocalDateTime.from(Instant.parse(fields[1]));
                Instant instant = Instant.parse(fields[1]);
                LocalDateTime moment = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
