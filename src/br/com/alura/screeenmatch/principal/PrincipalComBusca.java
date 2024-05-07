package br.com.alura.screeenmatch.principal;

import br.com.alura.screeenmatch.exception.ErroDeConversaoDeAnoException;
import br.com.alura.screeenmatch.modelos.Titulo;
import br.com.alura.screeenmatch.modelos.TitulosOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca?");
        var busca = leitura.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=eadaaab7";

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

//        Gson gson = new Gson();
            // para deixar Maisculo a primeira letra do Record a classe para referencia.
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
//        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TitulosOmdb meuTituloOmdb = gson.fromJson(json, TitulosOmdb.class);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Filme: " + meuTituloOmdb);
            System.out.println("Meu Titulo: " + meuTitulo);

        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro.");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifica o endereço.");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente!");
    }
}
