package metodos.exercicionumeroaletorio;
import java.util.Random;

public class NumeroAleatorio {

    Random random = new Random();
    int numero;
    
    public void numeroA(){
        numero = random.nextInt(100);
        System.out.println("Número aleatório: "+numero);
    }
    
}
