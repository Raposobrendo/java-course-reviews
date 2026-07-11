package genericsSetMap;

import java.util.*;

public class Program {
    public static void main(String[] Args){
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Brendo");
        lista.add("Julia");

        // lista.add(10); // Erro

        String nome1 = lista.get(0);

        System.out.println(nome1);

        //--------------------------------------------------------------------------

        Set<String> nome2 = new LinkedHashSet<>();

        nome2.add("Brendo");
        nome2.add("Julia");
        nome2.add("Brendo");

        System.out.println(nome2);
        System.out.println(nome2.size());

        //--------------------------------------------------------------------------

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(1, "Brendo");
        pessoas.put(2, "Julia");
        pessoas.put(3, "Nicolas");
        pessoas.put(4, "Luna");

        System.out.println(pessoas.get(3));

        for (Integer key : pessoas.keySet()){
            System.out.println(key + " - " + pessoas.get(key));
        }

        for (Map.Entry<Integer, String> entrada : pessoas.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
