import java.util.Scanner;

public class Leitura {
//    psvm atalho
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual é o ano de lançamento do filme?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite a sua avaliação do filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(anoDeLancamento);
        System.out.println(filme);
        System.out.println(avaliacao);
    }
}
