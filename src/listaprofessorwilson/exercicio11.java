package listaprofessorwilson;
import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        //ler um numero e mostra-los na saida, e o dobro desse numero

        System.out.println("digite um numero: ");
        Scanner lernumero = new Scanner(System.in);

        float numero = lernumero.nextFloat();


        System.out.println("numero --> "+numero+"\no dobro de numero--> "+numero*2);




    }
}
