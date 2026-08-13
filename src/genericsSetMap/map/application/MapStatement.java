package genericsSetMap.map.application;

import java.util.Map;
import java.util.TreeMap;

public class MapStatement {
    public static void main(String[] args){

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "998745632");
        cookies.put("username", "João");

        cookies.remove("email");

        System.out.println("Cookies contains 'phone' key? " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
