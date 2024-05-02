public class Alunos {
    private String nome;
    private int notas1;
    private int notas2;
    private int notas3;

    public String getNome() {
        return nome;
    }

    public int getNotas1() {
        return notas1;
    }

    public int getNotas2() {
        return notas2;
    }

    public int getNotas3() {
        return notas3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas1(int notas1) {
        this.notas1 = notas1;
    }

    public void setNotas2(int notas2) {
        this.notas2 = notas2;
    }

    public void setNotas3(int notas3) {
        this.notas3 = notas3;
    }

    public void calcularMedia() {
        double mediaNotas = (notas1 + notas2 + notas3) / 3;
        System.out.println("A média da notas do aluno é " + mediaNotas);
    }
}
