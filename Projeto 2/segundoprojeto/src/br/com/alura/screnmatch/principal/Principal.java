package br.com.alura.screnmatch.principal;

import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screnmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screnmatch.calculo.FiltroRecomendacao;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
//        ctrl alt i identa o código no intellij

        meuFilme.exibeFichaTcnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie("Lost", 2000);
        lost.setEpisodiosPorTemporada(10);
        lost.setTemporadas(10);
        lost.exibeFichaTcnica();
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

//        o var já faz uma inferência do tipo do filme, ou seja, já define como variavel do tipo Filme
//        Filme homemAranha = new Filme();


        var homemAranha = new Filme("Homem-Aranha", 2022);
        homemAranha.setDuracaoEmMinutos(500);
        homemAranha.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(homemAranha);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
//        System.out.println(listaDeFilmes); endereço
        System.out.println("toString filme " + listaDeFilmes.get(0).toString());

    }
}