package Testechatpt;

/* Crie uma classe ContaBancaria com os atributos saldo (double) e titular (String).
No setter de titular, lance uma exceção se o nome for nulo ou vazio.
No método sacar(double valor), lance uma IllegalArgumentException se o valor for negativo ou maior que o saldo. */

public class Exerc36Exception {
    public static class ContaBancaria{
        private String titular;
        private double saldo;

        public ContaBancaria(String titular, double saldo) {
            if(titular == null || titular.isEmpty()){
                throw new IllegalArgumentException("Titular não aceita nulo ou vazio!");
            } else {
            this.titular = titular;}
            this.saldo = saldo;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void sacar(double valor){
            if(valor < 0 || valor > saldo){
                throw new IllegalArgumentException("Transação impossivel!");
            } else{
            saldo = saldo - valor; }
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("pedro",1000);
        System.out.println(conta.getSaldo());
    }
}
