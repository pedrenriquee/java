package Testechatpt;

/* Dada uma lista de números inteiros, use Stream e Predicate para retornar apenas os números maiores que 10. */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exerc7Lamba {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1,24,3,46,5));

       List<Integer> teste =lista.stream().filter(s -> s > 10).collect(Collectors.toList());

        System.out.println(teste);


    }
}
