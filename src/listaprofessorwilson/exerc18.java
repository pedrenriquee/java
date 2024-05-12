package listaprofessorwilson;
import java.util.Scanner;
public class exerc18 {
    public static void main(String[] args) {
         //Elabore um algoritmo que leia dois números inteiros e realize a adição; caso o resultado seja maior que 10, imprima o quadrado do resultado, caso contrário, imprima a metade dele

         Scanner lerPrimeiro = new Scanner(System.in);
         Scanner lerSegundo = new Scanner(System.in);

         System.out.println("digite o primeiro numero: ");
         int primeiro = lerPrimeiro.nextInt();

         System.out.println("digite o segundo numero: ");
         int segundo = lerSegundo.nextInt();

         int resultado = primeiro + segundo;

         if (resultado>10){

            System.out.println("o quadrado da soma: "+resultado*resultado);
         } else {

            System.out.println("metade da soma: "+resultado/2);
         }


         lerPrimeiro.close();
         lerSegundo.close();
    }
}
