package br.com.alura.screeenmatch.principal;

import br.com.alura.screeenmatch.modelos.Filme;
import br.com.alura.screeenmatch.modelos.Serie;
import br.com.alura.screeenmatch.modelos.Titulo;

import java.util.ArrayList;

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

    }
}

