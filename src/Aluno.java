public class Aluno {
    int portugues;
    int matematica;
    int ciencias;
    int educacaoFisica;
    int artes;

    void exibirInformacoes() {
        System.out.println("Notas:");
        System.out.println("Português: " + portugues);
        System.out.println("Matematica: " + matematica);
        System.out.println("Ciencias: " + ciencias);
        System.out.println("Educação Fisica: " + educacaoFisica);
        System.out.println("Artes: " + artes);
    }

    void mediaNotas() {
        int totalNotas;
        totalNotas = (portugues + matematica + ciencias + educacaoFisica + artes) / 5;
        System.out.println("A média das notas é: " + totalNotas);
    }
}


