package Testechatpt;

/* Crie uma interface Trabalho com um método executarTarefa().
Crie classes Programador e Designer que implementam essa interface.
No main(), instancie objetos das duas classes e chame executarTarefa().  */


public class exerc10 {
    public interface Trabalho{
        void ExecutarTarefas();
    }
   public static class Programador implements Trabalho{
        @Override
        public void ExecutarTarefas(){
            System.out.println("Programa sistema!");
        }
   }
   public static class Designer implements Trabalho{
        @Override
        public void ExecutarTarefas(){
            System.out.println("Faz o designer");
        }

   }
   public static void main(String[] args) {
        Programador programador = new Programador();
        programador.ExecutarTarefas();

        Designer designer = new Designer();
        designer.ExecutarTarefas();
    }

}
