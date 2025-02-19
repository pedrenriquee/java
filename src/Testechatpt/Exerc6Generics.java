package Testechatpt;

/* Modifique a classe Numeros<T> para aceitar apenas tipos numéricos (Integer, Double, Float, etc.)
.Adicione um método somar(T outroNumero) que retorna a soma dos dois números. */

public class Exerc6Generics {
    public static class Numero<T extends Number>{

        public double soma(T valor1, T valor2){
            return valor1.doubleValue() + valor2.doubleValue();
        }
    }

    public static void main(String[] args) {
        Numero<Integer> numeros = new Numero<>();
        System.out.println(numeros.soma(3,6));
    }
}
