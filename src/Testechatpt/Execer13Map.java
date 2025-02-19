package Testechatpt;

/*Dado um List<String> retorne um Map<String, Integer> contando a ocorrencia de uma palavra  */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Execer13Map {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("pedro","pedro", "henrique"));

        Map<String, Integer> result = new HashMap<>();

        for (String palavra : palavras){
            result.put(palavra, result.getOrDefault(palavra, 0) +1 );

        }
        System.out.println(result);
    }
}
