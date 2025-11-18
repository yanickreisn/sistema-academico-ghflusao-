public class Turma {
    private int id;
    private Disciplina disciplina;
    private Professor professor;
    private String horario;

    public Turma(int id, Disciplina disciplina, Professor professor, String horario) {
        this.id = id;
        this.disciplina = disciplina;
        this.professor = professor;
        this.horario = horario;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "Turma " + id + " - " + disciplina.getNome();
    }
}
