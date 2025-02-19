package Testechatpt;

/* Crie um Set<Integer> com vários números.
Como os Set não possuem ordenação definida,
converta para uma List<Integer> e ordene em ordem decrescente.*/

import java.util.*;

public class Exerc12Set {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(Set.of(78,5,65,7));

        List<Integer> result = new ArrayList<>(numeros);
        result.sort(Comparator.reverseOrder());

        System.out.println(result);
    }

}
