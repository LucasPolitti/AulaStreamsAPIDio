import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
          List<String> numerosAleatorios =
                  Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");


                  System.out.println(numerosAleatorios);


                  System.out.println("Imprima todos os elementos dessa lista de String: ");


                  //Reference method


                  numerosAleatorios.forEach(System.out::println);


                  //Todas as formas abaixo funcionaram para o mesmo procedimento


                 /*  numerosAleatorios.forEach(t -> System.out.println(t)); */


                  /*numerosAleatorios.stream().forEach(t -> System.out.println(t));*/


                    /*Foi feito dessa forma primeiro e em seguida com lambda. Os métodos tem a mesma função, um é interface funcional e o a cima com lambda 


                 /* numerosAleatorios.stream().forEach(new Consumer<String>() {

                    @Override
                    public void accept(String t) {
                    System.out.println(t);
                        
                    }
                    
                });*/

                System.out.println("Pegue os 5 primeiros mpumeros e coloque dentro de um Set: ");

                numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);;


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



                
























                    
                 



        
    }




}