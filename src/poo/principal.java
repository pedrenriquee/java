package poo;

public class principal {
    public static void main(String[] args) {
        Carro c1 = new Carro(10);
        
        c1.nome = "corsel";
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();

        Carro c2 = new Carro(15);
        
        c2.nome = "bm";
        c2.acelerar();

       
        c1.imprimir();
        c2.imprimir();
    }
}
