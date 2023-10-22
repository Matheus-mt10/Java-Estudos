package exercicios.ifElse.maior_menor;
import java.util.Scanner;

public class VerificarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Digite 3 números para verificação: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O número "+num1+" é maior que "+num2+" e "+num3);
        } else if(num2 > num1 && num2 > num3){
            System.out.println("O número "+num2+" é maior que "+num1+" e "+num3);
        }else{
            System.out.println("O número "+num3+" é maior que "+num1+" e "+num2);
        }

        sc.close();
    }
}