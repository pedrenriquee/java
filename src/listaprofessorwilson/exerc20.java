package listaprofessorwilson;
import java.util.Scanner;

public class exerc20 {
    public static void main(String[] args) {
        //O sistema de avaliação de determinada disciplina é composto por três provas. A primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Considerando que a média para aprovação é 6.0, faça um algoritmo para calcular a média final de um aluno desta disciplina e dizer se o aluno foi aprovado ou não
        Scanner nota1 = new Scanner(System.in);
        Scanner nota2 = new Scanner(System.in);
        Scanner nota3 = new Scanner(System.in);

        System.out.println("a primeira nota: ");
        float n1 = nota1.nextFloat();

        System.out.println("a segunda nota: ");
        float n2 = nota2.nextFloat();

        System.out.println("a terceira nota: ");
        float n3 = nota3.nextFloat();

        n1 = n1 * 2;
        n2 = n2 * 3;
        n3 = n3 * 5;

        float media = (n1 + n2 + n3) /10;

        if (media>=6){

            System.out.println("o aluno possui media: "+media+" com isso: aluno aprovado");
        } else {

            System.out.println("o aluno possui media: "+media+" com isso: aluno reprovado");
        }

        nota1.close();
        nota2.close();
        nota3.close();

    }





}