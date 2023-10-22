package exercicios.ifElse.positivo_negativo;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificação: ");
        int numero = sc.nextInt();

        if (numero<0) {
            System.out.println("O número digitado foi "+numero +" portanto é negativo.");
        } else {
            System.out.println("O número digitado foi "+numero +" portanto é Positivo.");
        }

        sc.close();

        
    }
}
