package Testechatpt;
/*Crie uma List<Integer> e adicione números, incluindo duplicatas.
Use um Set<Integer> para remover os números repetidos.
Exiba a lista antes e depois da remoção das duplicatas.*/


import java.util.*;

public class exerc26List {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(6);
        lista.add(5);
        lista.add(1);

        System.out.println("lista com numero repetido"+lista);

        Set<Integer> conjunto = new HashSet<>(lista);
        System.out.println("set sem numero repetido"+conjunto);

        List<Integer> resposta = new ArrayList<>(conjunto);

        System.out.println(resposta);
    }
}
