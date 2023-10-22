package exercicios.ifElse.volgal_consoante;
import java.util.Scanner;



public class VogalConsoante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();

        switch (letra) {
            case "A":
                System.out.println("Letra digitada: "+letra+". Portanto é Vogal.");
                break;
            case "E":
                System.out.println("Letra digitada: "+letra+". Portanto é Vogal.");
                break;
            case "I":
                System.out.println("Letra digitada: "+letra+". Portanto é Vogal.");
                break;
            case "O":
                System.out.println("Letra digitada: "+letra+". Portanto é Vogal.");
                break;
            case "U":
                System.out.println("Letra digitada: "+letra+". Portanto é Vogal.");
                break;
            default:
                System.out.println("A letra digitada: "+letra+". Portanto é uma consoante ou símbolo.");
                break;
        }

        sc.close();



    }
}
