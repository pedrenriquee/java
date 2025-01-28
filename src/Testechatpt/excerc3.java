package Testechatpt;

public class excerc3 {

    public static class Calculadora{
        private float numero1;
        private float numero2;

        Calculadora(float numero1, float numero2){
            this.numero1 = numero1;
            this.numero2 = numero2;
        }
        public float Somar(){
            float soma = numero1 + numero2;
            System.out.println("a soma dos numeros e:"+soma);
            return soma;
        }
        public float Subtrair(){
            float subtrair = numero1 - numero2;
            System.out.println("a subtracao dos numeros e:"+subtrair);
            return subtrair;
        }
    }
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(2,4);
        calculadora.Somar();
        calculadora.Subtrair();
    }
}

