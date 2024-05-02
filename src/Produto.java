public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double valorPercentual) {
        double valorDesconto = preco * (valorPercentual / 100);
        preco -= valorDesconto;
        System.out.println("Parabens recebeu um desconto de " + valorDesconto +  "% o produto irá sair por R$ " + preco);
    }
}
