package metodos;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Você aumentou o volume em 1 ponto: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Você aumentou o volume em 1 ponto: " + smartTv.volume);


    } 
}
