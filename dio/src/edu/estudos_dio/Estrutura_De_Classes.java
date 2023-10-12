package edu.estudos_dio;
public class Estrutura_De_Classes {
    
public static void main (String [] args){

    String primeiroNome = "Matheus";
    String segundoNome = "Santana";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println("\nOlá seja bem vindo(a)s\n");
    System.out.println(nomeCompleto);
    
}

public static String nomeCompleto ( String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome+"\n");

}

}
