package Testechatpt;

/* Crie uma thread que conte de 1 a 10, imprimindo os números com um intervalo de 1 segundo (Thread.sleep(1000)).
A thread principal (main) deve continuar executando enquanto a contagem acontece. */

public class Exerc15Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for(int i=1; i<=10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("thread interrompida");
                }
            }
             });
        t1.start();
}}
