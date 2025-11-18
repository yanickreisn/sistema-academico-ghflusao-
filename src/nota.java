public class Nota {
    private int id;
    private Avaliacao avaliacao;
    private Aluno aluno;
    private double valor;

    public Nota(int id, Avaliacao avaliacao, Aluno aluno, double valor) {
        this.id = id;
        this.avaliacao = avaliacao;
        this.aluno = aluno;
        this.valor = valor;
    }
}
