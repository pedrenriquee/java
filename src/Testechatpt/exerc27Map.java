package Testechatpt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Crie um Map<String, String> que funcione como um dicionário de inglês.
Adicione pelo menos 5 palavras com suas traduções.
Permita que o usuário busque o significado de uma palavra informando a chave.*/
public class exerc27Map {

    public static void main(String[] args) {
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("hello", "ola");
        dicionario.put("good", "bom");
        dicionario.put("bad", "ruim");
        dicionario.put("day", "dia");
        dicionario.put("night", "noite");


        Scanner scanner = new Scanner(System.in);
        System.out.println("O dicionario de palavras! "+ dicionario.keySet());
        System.out.println("Escolha uma palavra em ingles: ");
        String palavra = scanner.nextLine();

        //Aqui o codigo armazena a palavra dada pelo usuario a um indixe do map
        String traducao = dicionario.get(palavra);

        if(palavra != null){
            System.out.println("A traducao da palavra: "+ traducao);
        } else{
            System.out.println("palavra não encontrada!");
        }

        scanner.close();
    }
}
