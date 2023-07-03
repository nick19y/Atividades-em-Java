public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.5;

//        Média calculada
        double media = (9.7 + 5.3 + 7.8)/3;
        System.out.println(media);

        String sinopse;

        sinopse = """
                Filme de aventura
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
//        casting explicito
        classificacao = (int) (media/2);
        System.out.println(classificacao);

//        casting implicito
//        int x = 10;
//        double y = x;
    }
}