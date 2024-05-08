package poo;

public class Carro {
    int potencia;
    int velocidade;
    String nome;
    Carro(int potencia) {
      this.potencia = potencia; 
      velocidade= 0; 
        
    }

    void acelerar(){

        velocidade += potencia;
    }

    void frear(){

        velocidade *= 0.5;
    }
    

    int getvelocidade(){

        return velocidade;
    }

    void imprimir(){
        System.out.println("o carro "+nome+" está a velocidade: "+getvelocidade()+"km/h");
    }
}
