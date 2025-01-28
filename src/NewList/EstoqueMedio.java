package NewList;

import java.util.Scanner;

public class EstoqueMedio {
    /*************************************************************************
     *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
     *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
     *
     *************************************************************************/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade minina no estoque: ");
        float quantidadeMinima = scanner.nextFloat();

        System.out.println("Qual a quantidade maxima no estoque: ");
        float quantidadeMaxima = scanner.nextFloat();

        float estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.println("o estoque medio é:"+estoqueMedio);

        scanner.close();
    }

}
