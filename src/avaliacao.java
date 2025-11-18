public class Avaliacao {
    private int id;
    private Turma turma;
    private String titulo;
    private double peso;

    public Avaliacao(int id, Turma turma, String titulo, double peso) {
        this.id = id;
        this.turma = turma;
        this.titulo = titulo;
        this.peso = peso;
    }
}
