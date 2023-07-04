package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    //    shift f6 funciona como um ctrl d no vscode
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
//    public static é aquilo que uma função faz, nesse objeto são definidos os seus atributos acima


//    o construtor pode ser criado com o alt insert
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length()>4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public void exibeFichaTcnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamnto: " + anoDeLancamento);
        System.out.println("Duracão em minutos: " + duracaoEmMinutos);
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
//    alt insert e setters define os sets da classe

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
//        String já funciona com o compareTo para fazer a ordenação alfabética
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome= " + nome +
                ", anoDeLancamento = " + anoDeLancamento + "," +
                "duração " + duracaoEmMinutos+ ")";
    }
}
