package br.com.alura.ScreenMatch.calculo;
import br.com.alura.ScreenMatch.modelo.Titulo;

public class Calculadora {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void incluiTitulo(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void incluiTitulo(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void incluiTitulo(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
