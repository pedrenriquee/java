package listaprofessorwilson;
import java.util.Scanner;
public class exerc8 {
    public static void main(String[] args) {
        // Escreva um programa que solicite ao usuário a primeira letra de seu nome e ao final apresente na tela a letra informada pelo usuário da seguinte forma: "Voce digitou w"
        Scanner ler = new Scanner(System.in);

        System.out.println("escreva a primeira letra do seu nome: ");
        String primeiraL = ler.nextLine();
   
        System.out.println("a primeira letra do seu nome é: "+primeiraL);

        ler.close();
   
    }
}
