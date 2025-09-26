package aula98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// lista

public class main {
    /**
     * @param args
     */
    public static void main(final String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // adicionando elemento na lista
        /*
         * list.remove("Anna");
         * list.remove(1);
         */

        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("--------------------------------");
        // quando a lista não encontra o valor ele retorna negativo
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("--------------------------------");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        // String name = list.stream().filter(x -> x.charAt(0) ==
        // 'J').findFirst().orElse(null); encontra nulo
        System.out.println(name);
    }
}
