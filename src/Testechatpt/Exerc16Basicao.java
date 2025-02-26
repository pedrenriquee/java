package Testechatpt;

/* Crie um array de números inteiros. Use um for e um if para contar quantos números
são positivos e quantos são negativos. Depois, imprima esses valores. */


public class Exerc16Basicao {
    public static void main(String[] args) {
        int[] numeros = {4,-6,-7,3,-77,8,1,-23,566};
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        for(int result: numeros){
            if(result > 0) {
                contadorPositivo++;
            } else {
                contadorNegativo++;
            }
        }
        System.out.println("Quantidade de pares: "+contadorPositivo);
        System.out.println("Quantidade de impares: "+ contadorNegativo);
    }

}

