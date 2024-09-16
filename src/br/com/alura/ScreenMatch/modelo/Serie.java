package br.com.alura.ScreenMatch.modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;


    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporasa) {
        this.episodiosPorTemporada = episodiosPorTemporasa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorTemporada) {
        this.minutosPorEpisodio = minutosPorTemporada;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
