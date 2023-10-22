package exercicios.ifElse.calculo_media;
import java.util.Scanner;


public class CalculandoMedia {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double nota1, nota2, media;
    System.out.println("\nDigite as notas parciais do aluno abaixo");
    System.out.println("\nNota 1: ");
    nota1 = sc.nextDouble();
    System.out.println("Nota 2: ");
    nota2= sc.nextDouble();
    media= (nota1+nota2)/2;

    

    if (media>=7) {
        System.out.println("O aluno foi aprovado!!!");
        System.out.println("Sua média foi: "+media+". Parabéns :)");
    } else if(media == 10){
        System.out.println("O aluno foi aprovado com Distinção");
        System.out.println("Sua média foi: "+media+". Parabéns pela honra.");
    }else{
        System.out.println("O aluno foi reprovado :( ");
         System.out.println("Sua média foi: "+media+". Nos vemos no próximo ano :( ");
    }
        
    sc.close();
 }   
}
