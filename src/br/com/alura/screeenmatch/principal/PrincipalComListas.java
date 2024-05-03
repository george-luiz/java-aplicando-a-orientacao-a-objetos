package br.com.alura.screeenmatch.principal;

import br.com.alura.screeenmatch.modelos.Filme;
import br.com.alura.screeenmatch.modelos.Serie;
import br.com.alura.screeenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //ForEach: para da variavel: Item, dentro da array: lista do tipo: Titulo
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            // verificando se o tipo: item é um tipo Filme ou Serie
            if (item instanceof Filme filme) {
                //Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificao());
            }
        }

        var buscaPorArtista = new ArrayList<String>();
        buscaPorArtista.add("Adam Sandle");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        // Fazer uma ordanação de uma lista por ordem alfabetica.
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        // Fazer uma ordenação por int pelos anos dos filmes(anoDeLancamento)
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}

