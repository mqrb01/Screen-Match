import br.com.alura.ScreenMatch.calculo.Recomendacao;
import br.com.alura.ScreenMatch.modelo.Episodio;
import br.com.alura.ScreenMatch.modelo.Filme;
import br.com.alura.ScreenMatch.modelo.Serie;
import br.com.alura.ScreenMatch.calculo.Calculadora;

public class Main{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.mediaNota());
        System.out.println(meuFilme.getTotalAvaliacoes());

        Serie series = new Serie();
        series.setNome("Riverdale");
        series.setAnoDeLancamento(2018);
        series.setTemporadas(10);
        series.setEpisodiosPorTemporada(10);
        series.setMinutosPorEpisodio(25);
        series.exibeFichaTecnica();

        Calculadora calculadora = new Calculadora();
        calculadora.incluiTitulo(meuFilme);
        calculadora.incluiTitulo(series);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(series);
        episodio.setNome("Piloto");
        episodio.setTotalVizualizacoes(50);
        recomendacao.filtra(episodio);
    }
}
