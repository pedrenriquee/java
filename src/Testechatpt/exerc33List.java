package Testechatpt;

/* Crie uma List<String> com nomes de pessoas.
Agrupe esses nomes em um Map<Integer, List<String>>,
onde a chave é o tamanho do nome e o valor é a lista de nomes com aquele tamanho.
Exiba o resultado. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exerc33List {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("pedro");
        nomes.add("henrique");

        Map<Integer, List<String>> tamanho = new HashMap<>();

        for (String nome : nomes) {
            int tamanhos = nome.length();

            tamanho.putIfAbsent(tamanhos, new ArrayList<>());
            tamanho.get(tamanhos).add(nome);
        }

        for(Map.Entry<Integer, List<String>> entry: tamanho.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
