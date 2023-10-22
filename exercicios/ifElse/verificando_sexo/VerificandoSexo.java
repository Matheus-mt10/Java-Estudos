package exercicios.ifElse.verificando_sexo;
import java.util.Scanner;


public class VerificandoSexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Figite a inicial do seu sexo: ");
        String    sexo = sc.nextLine();

        switch (sexo) {
            case "M":
                System.out.println("M - Masculino");
                break;
            case "F":
                System.out.println("F - Feminino");
                break;
            default:System.out.println("Sexo inválido");
                break;
        }

        sc.close();
        
    }
}
