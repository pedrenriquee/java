package Testechatpt;

/* Crie uma classe Fila<T> que simula uma fila (FIFO - First In, First Out).
Deve conter métodos para adicionar (adicionar(T item)) e remover (remover()) elementos.
Utilize uma LinkedList<T> para armazenar os elementos. */

import java.util.LinkedList;
import java.util.List;

public class Excer5Generics {
    public static class Fila<T>{
       public LinkedList<T> elementos = new LinkedList<>();

       public void adicionar(T item){
           elementos.add(item);
           System.out.println("foi adicionaodo a lista: "+ item);
       }

       public T remover(){
            return elementos.removeFirst();
       }
    }

    public static void main(String[] args) {
        Fila<String> nomes = new Fila<>();

        nomes.adicionar("pedro");
        System.out.println("O seguinte item foi removido: "+nomes.remover());
        nomes.remover();

    }
}
