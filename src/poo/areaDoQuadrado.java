package poo;
//ficar como exercicio fazer o codigo com os atributos privados 
class dimensao{
public int base;
public int altura;

public int area(){

    return base * altura;

}


}


public class areaDoQuadrado {
    public static void main(String[] args) {
        
        //criar classe que faça a area do quadrado formula:base x altura.

        dimensao quadrado = new dimensao();

        quadrado.base = 2;
        quadrado.altura= 5;
        int teste = quadrado.area();
        System.out.println(teste);

    }
}
