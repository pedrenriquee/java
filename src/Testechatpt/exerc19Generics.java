package Testechatpt;
/* Crie uma classe genérica Par<A, B> que armazena dois objetos de tipos diferentes.
Adicione métodos getPrimeiro() e getSegundo().
No main(), crie uma instância de Par<String, Integer> e exiba os valores.  */

public class exerc19Generics {
    public static class Generica<A,B>{
        public A primeiro;
        public B segundo;

        public Generica(A primeiro, B segundo){
            this.primeiro = primeiro;
            this.segundo = segundo;
        }

        public A getPrimeiro(){
            return primeiro;
        }

        public B getSegundo(){
            return segundo;
        }
    }
    public static void main(String[] args) {
      Generica<String, Integer> obj = new Generica<>("pedro", 200);
      System.out.println(obj.getPrimeiro());
      System.out.println(obj.getSegundo());
    }
}
