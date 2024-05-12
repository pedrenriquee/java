package listaprofessorwilson;
import java.util.Scanner;
public class exerc40 {
        public static void main(String[] args) {
            //OS exercicios a partir de 30 são sobre o uso: for, while e do.
            
            // Elabore um algoritmo que solicite ao usuário uma palavra e um número inteiro que indicará a quantidade de vezes que a palavra digitada será impressa na tela, um em cada linha.
            
            Scanner lerNumero = new Scanner(System.in);
            Scanner lerpalavra = new Scanner(System.in);

            System.out.println("digite que palavra será repetida: ");
            String palavra = lerpalavra.nextLine();
            System.out.println("digite quantas vezes será repetida");
            int numero = lerNumero.nextInt();
            
            
            for(int i=1;i<=numero;i++){
                System.out.println(palavra);
           
            }
            
            lerNumero.close();
            lerpalavra.close();
        }    
    }
