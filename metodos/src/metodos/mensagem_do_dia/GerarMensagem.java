package metodos.mensagem_do_dia;
import java.time.LocalDate;


public class GerarMensagem {
    
    String mensagem;
    String diaSemana;

    public void Segunda(){
        LocalDate seg = LocalDate.of(2023, 10, 23);
        diaSemana = "(Segunda-feira : "+seg+")";
        mensagem = " \"O sucesso é a soma de pequenos esforços repetidos dia após dia.\"- Robert Collier ";
        System.out.println(mensagem + diaSemana);
    }

    public void Terca(){
        LocalDate ter = LocalDate.of(2023, 10, 24);
        diaSemana = "(Terça-feira : "+ter+")";
        mensagem = " \"Acredite em si mesmo e tudo é possível.\" - Chantal Sutherland ";
        System.out.println(mensagem + diaSemana);
    }

    public void Quarta(){

        LocalDate qua = LocalDate.of(2023, 10, 25);
        diaSemana = "(Quarta-Feira : "+qua+")";
        mensagem = " \"A única maneira de fazer um ótimo trabalho é amar o que você faz.\" - Steve Jobs ";
        System.out.println(mensagem + diaSemana);

    }

    public void Quinta(){
        LocalDate qui = LocalDate.of(2023, 10, 26);
        diaSemana = "(Quinta-Feira : "+qui+")";
        mensagem = " \"O maior prazer na vida é fazer o que as pessoas dizem que você não é capaz de fazer.\" - Walter Bagehot ";
        System.out.println(mensagem + diaSemana);

        
    }

    public void Sexta(){
        LocalDate sex = LocalDate.of(2023, 10, 27);
        diaSemana = "(Sexta-Feira : "+sex+")";
        mensagem = " \"O sucesso é a melhor vingança.\" - Frank Sinatra ";
        System.out.println(mensagem + diaSemana);
    }

    public void Sabado(){

        LocalDate sab = LocalDate.of(2023, 10, 28);
        diaSemana = "(Sábado : "+sab+")";
        mensagem = " \"A motivação nos leva à ação, e a ação traz resultados.\" - Zig Ziglar";
        System.out.println(mensagem + diaSemana);
        
    }

    public void Domingo(){

        
        LocalDate dom = LocalDate.of(2023, 10, 29);
        diaSemana = "(Domingo : "+dom+")";
        mensagem = "\"Não importa o quão devagar você vá, desde que você não pare.\" - Confúcio";
        System.out.println(mensagem + diaSemana);
        
    }
}
