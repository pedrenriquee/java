package listaprofessorwilson;
import java.util.Scanner;
public class exerc39 {
        public static void main(String[] args) {
            //OS exercicios a partir de 30 são sobre o uso: for, while e do.
            
            // Elabore um algoritmo que solicite ao usuário um número inteiro que indicará a quantidade de vezes que o texto "Hello World!" será impresso na tela, um em cada linha
            
            Scanner lerNumero = new Scanner(System.in);

            System.out.println("digite quantas vezes hello world será repetido: ");
            int numero = lerNumero.nextInt();
            
            
            for(int i=1;i<=numero;i++){
                System.out.println("hello world!");
            }
            lerNumero.close();
        }    
    }
