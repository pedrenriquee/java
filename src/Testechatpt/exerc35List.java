package Testechatpt;

/* Crie dois List<Integer> com números aleatórios.
Use um Set<Integer> para encontrar os números que aparecem em ambas as listas.
Exiba esses números. */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exerc35List {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> lista2 = new ArrayList<>(List.of(4,5,6,7,8));

        Set<Integer> result = new HashSet<>(lista1);
        Set<Integer> intersecao = new HashSet<>();

        for (int num: lista2){
            if(result.contains(num)){
               intersecao.add(num);
            }
        }
        System.out.println(intersecao);
    }

}
