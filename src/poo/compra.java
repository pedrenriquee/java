package poo;

public class compra {
    int valorTotal;
    int numeroParcelas;

    // a vista
    public compra (int valor ){
        valorTotal = valor;

    }

    //parcelado

    public compra (int quantParcelas, int valorParcela){

        numeroParcelas = quantParcelas;
        valorTotal = quantParcelas * valorParcela;
    }

    public int getvalorTotal(){
        return valorTotal;
    }

    public int getnumeroParcelas(){
        return numeroParcelas;
    }

    public int getvalorParcela(){

        return valorTotal/numeroParcelas;
    }

}
