package listaprofessorwilson;
import java.util.Scanner;
public class exerc21 {
    public static void main(String[] args) {
        //Elabore um algoritmo que leia o nome e o peso de duas pessoas e imprima o nome da pessoa mais pesada
        Scanner primeiraPessoa = new Scanner(System.in);
        Scanner segundaPessoa = new Scanner(System.in);
        Scanner primeiroPeso = new Scanner(System.in);
        Scanner segundoPeso = new Scanner(System.in);

        System.out.println("digite o nome da primeira pessoa: ");
        String pessoa1 = primeiraPessoa.nextLine();
        System.out.println("digite o seu peso: ");
        float peso1 = primeiroPeso.nextFloat();
        
        
        System.out.println("digite o nome da segunda pessoa: ");
        String pessoa2 = segundaPessoa.nextLine();
        System.out.println("digite o seu peso: ");
        float peso2 = segundoPeso.nextFloat();


        if(peso1 > peso2){

            System.out.println("a/o "+pessoa1+" pesa mais!");

        } else {

            System.out.println("a/o"+pessoa2+ " pesa mais!");
        }

        primeiraPessoa.close();
        segundaPessoa.close();
        primeiroPeso.close();
        segundoPeso.close();
    }
}
