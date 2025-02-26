package Testechatpt;

/* Crie um programa que recebe um array de strings e imprime esse array na ordem inversa. */

public class Exerc17Basicao {
    public static void main(String[] args) {
        String[] palavra = {"teste", "java"};

       for(int i = palavra.length-1; i>= 0; i--){
           System.out.println(palavra[i]);
       }
    }
}
