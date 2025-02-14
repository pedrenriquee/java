package Testechatpt;
/*Peça ao usuário para inserir uma frase.
Use um Map<Character, Integer> para contar quantas vezes cada caractere aparece.
Exiba os caracteres e suas contagens.  */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class excer34Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma frase");
        String frase = scanner.nextLine();

        Map<Character, Integer> conta = new HashMap<>();

        for (char c : frase.toCharArray()){
            conta.put(c, conta.getOrDefault(c,0)+1);
        }
       for (Map.Entry<Character, Integer>imprime: conta.entrySet()){
           System.out.println(imprime.getKey()+ ":"+ imprime.getValue());
       }
    }
}
