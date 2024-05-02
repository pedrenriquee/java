package listaprofessorwilson;
import java.util.Scanner;
public class exerc14 {
    public static void main(String[] args) {
        //Elabore um algoritmo que leia um número inteiro e imprima uma das mensagens: é múltiplo de 3, ou, não é múltiplo de 3
        System.out.println("digite um numero: ");
        Scanner lerNumero = new Scanner(System.in);
        int numero = lerNumero.nextInt();

        if (numero%3==0){

            System.out.println(numero+" é multiplo de 3");
        } else{

            System.out.println(numero+"não é multiplo de 3");
        }

        lerNumero.close();
    
    }
}
