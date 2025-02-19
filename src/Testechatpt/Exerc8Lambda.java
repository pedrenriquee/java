package Testechatpt;

/*Crie uma Function<String, Integer> que receba uma string e retorne o número de caracteres dela. */

import java.util.function.Function;

public  class Exerc8Lambda {

    public static void main(String[] args) {
        Function<String, Integer> funcao = s -> s.length();

        System.out.println(funcao.apply("pedro"));
    }
}
