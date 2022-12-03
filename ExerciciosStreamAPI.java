import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import javax.sql.rowset.Predicate;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println(numerosAleatorios);

        System.out.println("Imprima todos os elementos dessa lista de String: ");

        // Reference method

        numerosAleatorios.forEach(System.out::println);

        // Todas as formas abaixo funcionaram para o mesmo procedimento

        /* numerosAleatorios.forEach(t -> System.out.println(t)); */

        /* numerosAleatorios.stream().forEach(t -> System.out.println(t)); */

        /*
         * Foi feito dessa forma primeiro e em seguida com lambda. Os métodos tem a
         * mesma função, um é interface funcional e o a cima com lambda
         * 
         * 
         * /* numerosAleatorios.stream().forEach(new Consumer<String>() {
         * 
         * @Override
         * public void accept(String t) {
         * System.out.println(t);
         * 
         * }
         * 
         * });
         */

        System.out.println("Pegue os 5 primeiros mpumeros e coloque dentro de um Set: ");

        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        ;

        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());

        System.out.println(collectSet);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros");

        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println(numerosAleatorios);

        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*
         * System.out.
         * println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
         * 
         * numerosAleatorios.stream()
         * .map(Integer::parseInt)
         * .filter(new Predicate<Integer>() {
         * 
         * @Override
         * public boolean test(Integer integer) {
         * if (i %2 == 0 && i > 2) return true;
         * return false;
         * 
         * }
         * 
         * 
         * 
         * });
         */

       /* System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2); */

        System.out.println("Mostre a média dos números: ");


        numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);


        //Forma antiga de se fazer sem reference method e lambda


        System.out.println("Remova os valores impares: ");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        /*numerosAleatoriosInteger.removeIf(new java.util.function.Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                if (integer % 2 !=0) return true;
                return false;
            }
            
        });

        System.out.println(numerosAleatoriosInteger);*/


        //Feito com lambda

        System.out.println("Remova os valores impares: ");


        numerosAleatoriosInteger.removeIf( integer -> (integer % 2 !=0));

        System.out.println(numerosAleatoriosInteger);


       







                
     

    }

}