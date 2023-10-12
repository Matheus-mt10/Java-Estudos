package edu.estudos_dio;
import java.util.Scanner;

public class lendo_dados_do_usuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite o seu nome:");
        nome=sc.next();
        System.err.println("Seja bem vindo(a) " +nome);
        sc.close();

        
    }
}
