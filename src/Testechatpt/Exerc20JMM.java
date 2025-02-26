package Testechatpt;

/* Crie uma classe Counter onde uma thread incrementa uma variável count de 0 a 10.
Use volatile para garantir que outra thread sempre veja o valor atualizado e imprima a contagem. */


public class Exerc20JMM {
    public static class Counter{
        private volatile int count = 0;

        public void  incrementa(){
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(()->{
            for(int i = 0; i<=10;i++){
                c.incrementa();
            }
        });

        Thread t2 = new Thread(()->{
            System.out.println(c.getCount());
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
