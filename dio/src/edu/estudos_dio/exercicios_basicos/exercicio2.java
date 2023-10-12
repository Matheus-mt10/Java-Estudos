package edu.estudos_dio.exercicios_basicos;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    /* Crie um programa que solicite ao usuário um número e, em seguida, verifique se o número é par ou ímpar.
    */

    Scanner sc = new Scanner(System.in);
    int numero;
    System.out.println("Digite um número para verificar se o mesmo é par ou ímpar:");
    numero = sc.nextInt();
    numero = numero%2;
    String result1 = numero==0 ? "Par" : "Ímpar";
    System.out.println(result1);
    sc.close();

   


    



    }
}
