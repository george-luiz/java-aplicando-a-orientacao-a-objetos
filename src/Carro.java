public class Carro {
    String modelo;
    String cor;
    int anoLancamento;

    void exibirFicaTenica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Cor: " + cor);
    }

    void calcularIdadeCarro(int anoAtual) {
        int anoDoCarro;
        anoDoCarro = anoAtual - anoLancamento;
        System.out.println("O carro tem: " + anoDoCarro + " anos");
    }
}
