package Testechatpt;

/* Faça um programa onde uma thread muda o valor de um boolean running para false após 3 segundos,
e outra thread fica rodando enquanto running for verdadeiro.
Use volatile para garantir que a mudança seja visível. */

public class Exerc21JMM {
    public static class Teste{
       private volatile boolean running = true;

        public boolean isRunning() {
            return running;
        }
        public boolean stopRunnig(){
            return running = false;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Teste t = new Teste();
        Thread t1 = new Thread(()->{
            while (t.isRunning()){
                System.out.println("running");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()-> {
            while (t.isRunning()){
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                t.stopRunnig();
                System.out.println("Stopped");
                break;
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }


}
