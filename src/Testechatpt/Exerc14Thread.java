package Testechatpt;

/* Crie uma classe MinhaThread que implemente a interface Runnable. No método run(), imprima "Executando thread!".
Depois, crie uma instância dessa classe e a execute em uma nova thread. */


public class Exerc14Thread {
    public static  class MinhaThread implements Runnable{
        public void run(){
            System.out.println("Executando thread!");
        }

    }
    public static void main(String[] args) {
        MinhaThread teste = new MinhaThread();
        Thread thread = new Thread(teste);
        thread.start();
    }

}
