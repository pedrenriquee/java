package Testechatpt;

/* Dada uma lista de nomes, ordene-a em ordem alfabética usando Comparator e lambdas. */

import java.util.ArrayList;
import java.util.List;

public class Exerc9Lambda {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("pedro", "henrique"));

        nomes.sort((A, B)-> A.compareTo(B));

        System.out.println(nomes);
    }
}
