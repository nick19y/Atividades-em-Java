package br.com.alura.screnmatch.calculo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
//    polimorfismo é a capacidade de um objeto de assumir diferentes classes
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    alt enter faz a importação do pacote
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
