package listaprofessorwilson;
import java.util.Scanner;
public class exerc41 {
        public static void main(String[] args) {
            //OS exercicios a partir de 30 são sobre o uso: for, while e do.
            
            // Elabore um algoritmo que leia um número de entrada que indicará a quantidade de números a serem lidos. Em seguida, leia n números (conforme o valor informado anteriormente) e imprima a soma e a média aritmética dos números informados
            
            Scanner lerNumero = new Scanner(System.in);
            
            System.out.println("digite a quantidade de numeros a serem lidos: ");
            int numero = lerNumero.nextInt();
            
            int soma = 0;
            float media = 0;
            for(int i=1;i<=numero;i++){
                soma +=i;
            }
            media = soma/numero;

            System.out.println("a soma dos numeros: "+soma);
            System.out.println("a media dos numeros: "+media);
            lerNumero.close();
        }    
    }
