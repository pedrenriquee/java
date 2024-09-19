package CursoYtb;

//Expressões lambda são usadas para fornecer uma implementação concisa de uma interface funcional
//uma interface que contém apenas um método abstrato.

public class expressoesLamba {

    interface fatorial {

        boolean teste(int a, int b);
    }

    public static void main(String[] args) {
           fatorial fator = (a, b) -> (b % a) == 0;

           if(fator.teste(10, 2)){
               System.out.println("10 é fatorial de 2");

           } else {System.out.println("10 não é fatorial de 2");}
    }

}
