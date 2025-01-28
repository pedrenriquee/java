package NewList;

import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o valor do dolar atualmente: ");
        float dolar = scanner.nextFloat();

        System.out.println("quantidade de dolar: ");
        float real = scanner.nextFloat();

        float conversao = dolar * real;
        System.out.println("o valor de reais:"+conversao);


    }
}
