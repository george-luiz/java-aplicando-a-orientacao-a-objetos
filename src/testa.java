public class testa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "George";
        pessoa1.idade = 28;
        pessoa1.exibiMensagem();

        Calculadora novaCaculadora = new Calculadora();
        novaCaculadora.calcular(5);

        Carro Corsa = new Carro();
        Corsa.modelo = "Corsa Hatch";
        Corsa.cor = "Preto";
        Corsa.anoLancamento = 2009;
        Corsa.exibirFicaTenica();
        Corsa.calcularIdadeCarro(2024);

        Aluno Heloisa = new Aluno();
        Heloisa.artes = 10;
        Heloisa.portugues = 10;
        Heloisa.educacaoFisica = 10;
        Heloisa.ciencias = 10;
        Heloisa.matematica = 10;
        Heloisa.exibirInformacoes();
        Heloisa.mediaNotas();
    }
}
