package br.com.alura.ScreenMatch.modelo;
import br.com.alura.ScreenMatch.calculo.Classificavel;


public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public double getClassificacao() {
        return mediaNota()/2;
    }
}
