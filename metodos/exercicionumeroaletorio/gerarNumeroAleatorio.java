package metodos.exercicionumeroaletorio;
import java.util.Random;

public class gerarNumeroAleatorio {
    
    Random random = new Random();
    int numero = random.nextInt(100);

    public void NumeroRandomico(){
    }
    System.out.println("O Número gerado de forma aleatória é: "+gerarNumeroAleatorio.numero);


}
