package Testechatpt;
/* Crie uma interface Trabalhavel com um método executarTarefa().
Depois, crie uma classe abstrata Funcionario com atributos nome e salario,
e um método abstrato calcularBonus().
Crie duas classes Gerente e Programador que estendem Funcionario e implementam Trabalhavel.
No main(), instancie um Gerente e um Programador, e teste seus métodos.  */

public class exerc18Abstrata {
    public interface trabalhavel{
        public void excecutarTarefas();
    }
    public static abstract class Funcionario implements  trabalhavel{

        Funcionario(String nome, Double salario){
            this.nome = nome;
            this.salario = salario;
        }
        public String nome;
        public double salario;

        public abstract double calcularBonus();
    }

    public static class Gerente extends Funcionario{
        public double bonus;

        Gerente(String nome, double salario, double bonus){
            super(nome, salario);
            this.bonus = bonus;
        }

        @Override
        public void excecutarTarefas() {
            System.out.println("O gerente controla a equipe!");
        }

        @Override
        public double calcularBonus() {
            return salario + bonus;
        }
    }

    public static class Programador extends Funcionario{
        public double bonus;

        Programador(String nome, double salario, double bonus){
            super(nome, salario);
            this.bonus = bonus;
        }

        @Override
        public void excecutarTarefas() {
            System.out.println("O programdor constroi o codigo!");
        }

        @Override
        public double calcularBonus() {
            return salario + bonus;
        }
    }

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("thiago", 1500, 200);
        gerente.excecutarTarefas();
        System.out.println(gerente.calcularBonus());

        Funcionario programador = new Programador("pedro", 1000, 300);
        programador.excecutarTarefas();
        System.out.println(programador.calcularBonus());
    }
}
