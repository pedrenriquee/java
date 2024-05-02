package listaprofessorwilson;
import java.util.Scanner;
import java.text.DecimalFormat;
public class exerc7 {
    public static void main(String[] args) {
        //escrever dois numeros um inteiro e um float e formatar: x e y.yy
        Scanner lerNumint = new Scanner(System.in);
        Scanner lerNumfloat = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int numeroint = lerNumint.nextInt();

        
        System.out.println("digite um numero real: ");
        float numerofloat = lerNumfloat.nextFloat();
        DecimalFormat vlrf = new DecimalFormat("#.##");
        String recebe = vlrf.format(numerofloat);

        System.out.println("voce informou os numeros "+numeroint+" e "+recebe);


        lerNumfloat.close();
        lerNumint.close();

    }
}
