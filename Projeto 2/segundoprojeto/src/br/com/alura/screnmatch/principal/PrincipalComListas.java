package br.com.alura.screnmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        var homemAranha = new Filme("Homem-Aranha", 2022);
        homemAranha.avalia(6);
        Serie lost = new Serie("Lost", 2000);

//        a variável declarada abaixo é uma variável de referência, pois eça não cria um novo objeto, e sim uma nova referência a ele
        Filme f1 = homemAranha;


//        alt enter importa a classe
        List<Titulo> lista = new LinkedList<>();
        lista.add(homemAranha);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
//        esse é o foreach do java
//        para cada variavel do tipo item da lista, faça
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao()>2){
                System.out.println("Classificação: "+ filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Margot Robbie");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Brad Pitt");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação alfabética");
        System.out.println(buscaPorArtista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
