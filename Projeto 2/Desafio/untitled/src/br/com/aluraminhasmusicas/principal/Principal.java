package br.com.aluraminhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica.Musica;
import br.com.alura.minhasmusicas.modelos.Musica.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Forever");
        minhamusica.setArtista("Kiss");
        for(int i = 0; i<100; i++){
            minhamusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Thiaguinho");
        for(int i = 0; i < 500; i++){
            meuPodcast.reproduz();
        }
        for(int i = 0; i < 500; i++){
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhamusica);
    }
}
