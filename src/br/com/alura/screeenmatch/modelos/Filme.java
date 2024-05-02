package br.com.alura.screeenmatch.modelos;

import br.com.alura.screeenmatch.calculos.Classificavel;

// Extends palavra reservada do Java para que aplica herança a um classe.
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;
    }
}



