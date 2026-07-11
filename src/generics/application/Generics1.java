package generics.application;

import generics.services.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generics1 {
    public static void generics(String[] Args) {

        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values do you want to input? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Input number #" + (i+1) + ": ");
            Integer num = sc.nextInt();
            ps.addValue(num);
        }

        ps.print();
        System.out.println("First value: " + ps.first());

        sc.close();
    }
}
