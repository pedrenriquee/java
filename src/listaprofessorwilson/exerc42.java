package listaprofessorwilson;
import java.util.Scanner;
public class exerc42 {
        public static void main(String[] args) {
            //OS exercicios a partir de 30 são sobre o uso: for, while e do.
            
            // Elabore um algoritmo que leia um número de entrada que indicará a quantidade de registros a serem lidos (N). Em seguida algoritmo deve solicitar o nome e idade de N pessoas e ao final apresentar o nome da pessoa mais velha.
            
            Scanner lerNumero = new Scanner(System.in);
            Scanner lernome = new Scanner(System.in);
            Scanner leridade = new Scanner(System.in); 
            System.out.println("digite a quantidade de registros: ");
            int numero = lerNumero.nextInt();
            int maiorIdade = 0;
            String nomeMaisVelho = "";
            
            for(int i=1;i<=numero;i++){
                System.out.println("digite seu nome: ");
                String nome = lernome.nextLine();
    
                System.out.println("digite sua idade: ");
                int idade = leridade.nextInt();

                //para apenas um caso:
                if (i == 1){
                    maiorIdade = idade;
                    nomeMaisVelho = nome;
                // para multiplos casos:

                } else if(idade > maiorIdade) {
                    maiorIdade = idade;
                    nomeMaisVelho = nome;

                }
            }
            
            System.out.println("O nome do mais velho é: "+nomeMaisVelho);
            System.out.println("A idade do mais velho: "+maiorIdade);
            lerNumero.close();
        }    
    }
