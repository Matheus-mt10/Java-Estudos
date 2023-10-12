package edu.estudos_dio;

public class variaveis {
    public static void main(String[] args) {
        
    /*https://glysns.gitbook.io/java-basico/sintaxe/variaveis
     * 
     * Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.
     No Java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.
     Já as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.
     Por convenção, Constantes são sempre escritas em CAIXA ALTA.
     * 
     */

        int numero = 5;
        numero++;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

    }
}
