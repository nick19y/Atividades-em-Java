import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o CEP do endereço desejado: ");
        var cep = leitura.nextLine();
        try{
            Endereco enderecoUtilizado = consultaCep.buscaEndereco(cep);
            System.out.println(enderecoUtilizado);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(enderecoUtilizado);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Operação finalizada");
        }
    }
}
