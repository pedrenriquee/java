package listaprofessorwilson;
import java.util.Scanner;
import java.text.DecimalFormat;
public class exerc5 {
    public static void main(String[] args) {
       //escrever um numero float e apresentar formatado x.xx
       
        Scanner lerNum1 = new Scanner (System.in);
       
        System.out.println("digite um numero: ");
        float numero1 = lerNum1.nextFloat();
        
        DecimalFormat vlrf = new DecimalFormat("#.##");
        String recebe = vlrf.format(numero1);

        
        System.out.println("voce informou o numero: "+ vlrf.format(numero1));
        lerNum1.close();

        //codigo não apresenta resultado esperado

    }


}
