package Testechatpt;

/* Crie uma classe genérica Caixa<T> que armazena um único valor do tipo T.
Ela deve ter métodos para definir (setValor) e obter (getValor) o valor armazenado.
No main(), teste a classe com diferentes tipos, como Integer e String. */

public class Excer4Generics {
    public static class Caixa<T> {
        private T valor;

        public void setValor(T valor){
            this.valor  = valor;
        }

        public T getValor(){
            return valor;
        }
    }

    public static void main(String[] args) {
        Caixa<String> strings = new Caixa<>();
        Caixa<Integer> ints = new Caixa<>();
        strings.setValor("Pedro");
        ints.setValor(25);
        System.out.println(strings.getValor());
        System.out.println(ints.getValor());
    }
}

