package listaprofessorwilson;
import java.util.Scanner;
public class exerc12 {
    public static void main(String[] args) {
          //verificar se o valor informado pelo usuario é maior que 10 ou não.

        System.out.println("digite um numero: ");
        Scanner lerNum = new Scanner(System.in);
        float numero = lerNum.nextFloat();

       if(numero>10){
            
            System.out.println(numero+" é maior que 10");

       } else {

            System.out.println(numero+" é menor que 10");

       }


        lerNum.close();

        }
    }

