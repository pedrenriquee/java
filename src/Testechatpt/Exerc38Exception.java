package Testechatpt;

/* Crie uma interface Pagamento com um método processarPagamento(double valor).
Crie as classes CartaoCredito e Pix, que implementam a interface.
No método processarPagamento de ambas as classes,
lance uma IllegalArgumentException se o valor for negativo.
No CartaoCredito, se o valor for maior que R$ 5.000,
lance uma UnsupportedOperationException dizendo que o pagamento excede o limite permitido. */

public class Exerc38Exception {
    public  interface Pagamento{
      void processoPagamento(double valor);
    }
    public static class CartaoCredito implements Pagamento{
        @Override
        public void processoPagamento(double valor) {
           if(valor < 0){
               throw new IllegalArgumentException("Valor não pode ser menor que zero");
           } else if(valor > 5000){
               throw new UnsupportedOperationException("Pagamento excede o limite permitido");
           }
           System.out.println("Pagamento Realizado!");
        }
    }
    public static class Pix implements Pagamento{
        @Override
        public void processoPagamento(double valor) {
            if(valor < 0){
                throw new IllegalArgumentException("Valor não pode ser menor que zero");
            }
            System.out.println("Pagamento Realizado!");
        }
    }

    public static void main(String[] args) {
        CartaoCredito pag1 = new CartaoCredito();
        pag1.processoPagamento(2000);

        Pix pag2 = new Pix();
        pag2.processoPagamento(3000);
    }
}
