package genericsSetMap.exercises.exercise2;

import java.util.*;

public class Exercise2 {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        List<String> course = Arrays.asList("A", "B", "C");

        Set<Integer> student = new HashSet<>();

        for(String s : course){
            System.out.print("How many students for course " + s + ": ");
            int qtStudents = sc.nextInt();
            for(int i = 0; i < qtStudents; i++){
                student.add(sc.nextInt());
            }
        }

        System.out.println("Total students: " + student.size());

        sc.close();
    }
}
