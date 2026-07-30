package genericsSetMap.hashCodeAndEquals.application;

import genericsSetMap.hashCodeAndEquals.entities.Client;

public class hashCodeEquals1 {
    public static void main(String[] Args){

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "mariapink@gmail.com");
        Client c3 = new Client("John Cena", "johncena@gmail.com");
        Client c4 = new Client("John Cena", "johncena@gmail.com");

        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        String s4 = new String("Test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println("---------------------------------");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c4));
        System.out.println(c3 == c4);
        System.out.println("---------------------------------");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s4));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }
}
