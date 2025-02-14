package Testechatpt;
/* Crie uma classe Divisao que tenha um método dividir(int a, int b), que retorna a divisão de a por b.
Se b for zero, lance uma ArithmeticException com a mensagem "Divisão por zero não permitida". */

public class Exerc37Exception {
    public static class Divisao{
        Divisao(){}

        public int dividir(int a , int b){
            if(b == 0){
                throw new ArithmeticException("divisãao por zero não permitida!");
            }

            return a/ b;
        }
    }

    public static void main(String[] args) {
        Divisao dividir = new Divisao();
        System.out.println(dividir.dividir(4,0));

    }
}
