package listaprofessorwilson;
import java.util.Scanner;
public class exerc17 {
    public static void main(String[] args) {
        //desenvolva um algoritmo que classifique um numero inteiro fornecido pelo usuario como par ou impar
        Scanner inteiro = new Scanner(System.in);
       
        System.out.println("digite um numero inteiro");
        int numerointeiro = inteiro.nextInt();


        if (numerointeiro%2==0) {
            System.out.println("o numero é par");

        } else {

            System.out.println("o numero é impar");
        }
        inteiro.close();
    }
}
