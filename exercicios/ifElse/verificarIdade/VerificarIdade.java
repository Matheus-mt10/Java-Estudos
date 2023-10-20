package exercicios.ifElse.verificarIdade;
import java.util.Scanner;


public class VerificarIdade {
    public static void main(String[] args) {


        int idade=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade:"); 
        idade = sc.nextInt();

        if (idade >=18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }



    }
}
