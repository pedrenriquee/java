package codigoBanco;
/*// Estamos importando a biblioteca Scanner para ler dados informados pelo usuario
import java.util.Scanner;

// Estamos implementando a classe Conta, da qual vamos herdar Poupanca, etc...
class Conta {
  private
    float vlrSaldo; // Atributo privado para controlar o saldo das contas
  protected
    String txtNome; // Atributo protegido para gravar o nome do correntista
    String txtNumConta; // Atributo para manipular o numero da conta

// metodo publico usado para mostrar um menu de opcoes ao usuario
  public int impriMenu() {
    // estamos instanciando (declarando) o objeto "ler" da classe Scanner
    Scanner ler = new Scanner(System.in);
    // Estamos imprindo o menu na tela
    System.out.println("\n\n BEM VINDO AO NOSSO BANCO  \n");
    System.out.println("   1-Consultar Saldo");
    System.out.println("   2-Depositar");
    System.out.println("   3-Sacar");
    System.out.println("   4-Sair");
    System.out.print("\n Digite uma das opcoes acima: ");
    // Estamos retornado do tipo inteiro (nextInt) o valor informado pelo usuario
    return ler.nextInt();
  }

  // Metodo acessor para retornar fora da classe o valor do saldo que eh private...
  public float getSaldo() {
    // Bem aqui entraria toda a implementacao de seguranca, validacoes e etc
    return(vlrSaldo);
  }

  // Poderiamos disponibilizar tambem um metodo mutante para alterar o valor do saldo fora da classe
  // Mas, por seguranca, vamos deixar comentado esse metodo e assim, nao entrega-lo para o programa
  // Metodo mutante para alterar, fora da classe, o valor do saldo que eh private...
  //public void setSaldo(float NovoValor) {
    // Bem aqui entraria toda a implementacao de seguranca, validacoes, e etc
    // vlrSaldo = NovoValor;
  //}

  // Metodo publico para inicializar uma conta com os dados do cliente
  public void criarConta() {
    // System.in na linha a seguir significa o dispositivo de saída padrao do S.O.
    Scanner ler = new Scanner(System.in);
    System.out.printf("\n\n Bem Vindo ao nosso Banco \n");
    System.out.printf(" Informe o nome do Correntista: ");
    txtNome = ler.nextLine();
    System.out.printf(" Informe o numero da Conta: ");
    txtNumConta = ler.nextLine();
    System.out.printf(" Informe o valor inicial do saldo: ");
    vlrSaldo = ler.nextFloat();
  }

  // Metodo publico para consultar os dados da conta
  public void consultarSaldo(){
    System.out.println("\n Consulta de Saldo ");
    System.out.println(" Nome do Cliente: " + txtNome);
    System.out.println(" Numero da Conta: " + txtNumConta);
    System.out.println(" Valor do Saldo: " + vlrSaldo);
  }

  // Estamos implementando o metodo para depositar valores na conta
  public boolean depositarValor(float quanto) {
    if (quanto <= 0) { // Se o valor depositado for invalido, entao retornamos falso
      System.out.println(" \n Valor do deposito invalido!!!");
      return false;
    }
    else { // Se estiver tudo ok...
      vlrSaldo = vlrSaldo + quanto;
      System.out.println(" \n Valor depositado com Sucesso!!!");
      return (true);
    }
  }

  // Estamos implementando o metodo para sacar valores na conta
  public boolean sacarValor(float howMuch) {
    if (howMuch <= 0) { // Se o valor sacado for invalido, entao retornamos falso
      System.out.printf(" \n Valor do saque invalido!!!");
      System.out.printf(" \n");
      return (false);
    }
    else if (howMuch > vlrSaldo) { // Se o valor sacado for maior que o saldo em conta, entao retornamos falso
      System.out.print(" \n Saldo insuficiente para o saque!!!");
      System.out.print(" \n");
      return(false);
    }
    else { // Se estiver tudo ok...
      vlrSaldo = vlrSaldo - howMuch;
      System.out.println(" \n Valor sacado com Sucesso!!!");
      return true;
    }
  }

// Estamos implementando o metodo principal (main())
  public static void main(String[] args) {
    // estamos instanciando o objeto "ler" da classe Scanner
    Scanner ler = new Scanner(System.in);
    float valor;  // Declarando uma variável local p manipular o valor saldo
    int resposta; // Declarando uma variável local p solicitar a opcao usuario
    Conta minhaConta = null; // Instanciando o objeto "minhaConta" da classe Conta

    System.out.println("\n\n BEM VINDO AO NOSSO BANCO  \n");
    System.out.println("   1-Conta Corrente");
    System.out.println("   2-Conta Poupanca");
    System.out.println("   3-Conta Universitaria");
    System.out.println("   4-Sair");
    System.out.print("\n Digite uma das opcoes acima: ");
    resposta = ler.nextInt();
    if (resposta == 1) {
      minhaConta = new Conta();  // Estamos instanciando o objeto minhaConta da classe Conta
      minhaConta.criarConta(); // Estamos chamando o metodo criarConta da classe Conta
    }

    do {
      resposta = minhaConta.impriMenu();
      if (resposta == 1) {
        minhaConta.consultarSaldo();
      }  
      else if (resposta == 2) {
        System.out.printf(" Informe o valor a ser depositado: ");
        valor = ler.nextFloat();
        if (minhaConta.depositarValor(valor)==true)
          System.out.println(String.format(" Novo Saldo: %.2f", minhaConta.getSaldo()));
        else 
          System.out.println(String.format(" O Saldo continua: %.2f", minhaConta.getSaldo()));
      }  
      else if (resposta == 3) {
        System.out.printf(" Informe o valor do saque: ");
        if ( minhaConta.sacarValor(ler.nextFloat()) )
          System.out.println(String.format(" Novo Saldo: %.2f", minhaConta.getSaldo()));
        else 
          System.out.println(String.format(" O saldo continua: %.2f", minhaConta.getSaldo()));
      }  
      else {
        System.out.printf("\n Obrigado por usar o nosso banco!!! \n\n");
      }
    }  // Fechando o comando de repeticao "do"
   while (resposta < 4);
  } // Estamos fechando o metodo principal "main"
} // Estamos fechando a classe Conta

//Tarefa1!!!
// Implementar a classe Universitaria
// Tera as mesmas regras da poupanca, porem, com limite de dois saques por mes...

class Universitaria extends Poupanca{
 private
  int limiteSaqueMes = 2;
  int saqueFeito = 0;

  private boolean check(){
return saqueFeito < limiteSaqueMes;
}

public boolean sacarValor(float vlr){
if (check()) {
 if(super.sacarValor(vlr)) {
   saqueFeito++;
  return (true);
}
}
else
System.out.println("Limite de saques mensais EXCEDIDO!!");
return false;
}
}

//Tarefa2!!!
// Implementar a classe Salario
// Tera as mesmas regras da conta normal, porem, com limite de um unico deposito por mes... */



