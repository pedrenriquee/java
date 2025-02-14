package Testechatpt;
/* Contar números pares em um array
Descrição:
Crie um método que receba um array de números inteiros e retorne a quantidade de números pares presentes no array.  */

public class Exerc2 {
    public static int ContarPares(int[] numeros){
        int somador = 0;
        for(int i =0; i<numeros.length;i++){
            if(numeros[i]%2==0){
                somador = somador + 1;
            }
        }
        return somador;
    }

    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4,5};
        int result = ContarPares(numeros);
        System.out.println(result);
    }
}
