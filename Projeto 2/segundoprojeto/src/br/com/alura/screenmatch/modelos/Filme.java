package br.com.alura.screenmatch.modelos;

import br.com.alura.screnmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;


//    método construtor, podem ser passados mais parametros nele
//    só criar um método quando tiver certeza da necessidade do uso do método

//    como na classe mãe tem 2 parametros, aqui terá que ter tb
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
//    implements é usado para interface

    public String getDiretor() {
        return diretor;
    }


    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
//        casting abaixo
        return (int)getMedia()/2;
//        colocando o mouse sobre a classe o método da interface já pode ser implementado
//        aqui fica a implementação
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento()+ ")";
    }
}
