package Testechatpt;
/*1. Encontrar o maior número em um array
Descrição:
Crie um método que receba um array de números inteiros e retorne o maior valor presente no array.
Dica:
Use um loop for para percorrer o array e uma estrutura if para comparar os valores. */
public class Exerc1 {

    public static int Array (){

        int[] numeros = {0,1,2,3,4,5};
        int maior = numeros[0];
        for (int pecorre : numeros){
            if(pecorre>maior){
                maior = pecorre;
            }
        }return maior;


    }
    public static void main (String[] Args){
        int result = Array();
        System.out.println("o maior numero é: "+ result);
    }
}
