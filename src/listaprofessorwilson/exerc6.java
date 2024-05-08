package listaprofessorwilson;
import java.util.Scanner;
public class exerc6 {
    public static void main(String[] args) {
        //transformar de celsius para fahrenheit
        
        Scanner temp = new Scanner(System.in);
        System.out.println("qual a temperatura em celsius: ");
        float celsius = temp.nextFloat();
        float temperatura = celsius * 1.8f + 32;

        System.out.println("a temperatura é:" +temperatura);

        temp.close();

    }
}
