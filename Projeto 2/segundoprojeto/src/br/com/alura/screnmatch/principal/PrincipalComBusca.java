package br.com.alura.screnmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        String busca = "";

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        List<Titulo> titulos = new ArrayList<>();
        while(!busca.equalsIgnoreCase("sair")) {


            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();
//        o var já infere o tipo da variável, que no caso será uma string
            if (busca.equalsIgnoreCase("sair")){
                break;
            }
//        nessa api o t indica um texto e o i é o indice de busca
            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=536479ab";

//      ctrl + a + ctrl alt i identa o codigo
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
//    http response é a resposta que o http vai retornar
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


//        mvn é um site no qual podem ser feitas buscas por bibliotecas e apis
//        no caso vai ser usada a biblioteca gson que converte objetos em java em um formato json
                String json = response.body();
                System.out.println(json);



//        System.out.println("Título: " + meuTitulo.getNome()); como foi alterado para tostring, pode ser usado como meuTitulo
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido");
                System.out.println(meuTitulo);


                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço.");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente");
    }
}
