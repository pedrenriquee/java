package introducao;
public class arrays {
    public static void main(String[] args) {
        //declarar um array

        int[] nomeDoArray =  {1,2,3,4};
        String[] disciplina = {"matematica"};

        // Também é possivel voce criar um arry assim, porem assim voce tem que instanciar depois
        String [] teste = new String[2];
        teste[1]= "pedro";

        System.out.println(nomeDoArray[1]);
        System.out.println(disciplina[0] + ": " + nomeDoArray[0]);

        


    }
}
