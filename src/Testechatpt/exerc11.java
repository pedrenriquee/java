package Testechatpt;

/*Criar uma classe abstrata

Crie uma classe abstrata chamada Veiculo com um método abstrato mover().
Crie duas classes Carro e Bicicleta que herdam de Veiculo e implementam mover()
de formas diferentes.
No main(), crie instâncias dessas classes e chame mover().
*/
public class exerc11 {
    public static abstract class Veiculo{

        public abstract void mover();
        }

        public static class Carro extends Veiculo{

            @Override
            public void mover(){
                System.out.println("O carro está se movendo!");
            }
        }

        public static class Bicicleta extends Veiculo{

            @Override
            public void mover(){
                System.out.println("A bicicleta está se movendo!");
            }
        }
        public static void main(String[] args) {
            Veiculo carro = new Carro();
            carro.mover();

            Veiculo bicicleta = new Bicicleta();
            bicicleta.mover();
        }
    }
