public class Disciplina {
    private int id;
    private String nome;
    private int cargaHoraria;

    public Disciplina(int id, String nome, int cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Disciplina: " + nome;
    }
}
