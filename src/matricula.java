public class Matricula {
    private int id;
    private Aluno aluno;
    private Turma turma;

    public Matricula(int id, Aluno aluno, Turma turma) {
        this.id = id;
        this.aluno = aluno;
        this.turma = turma;
    }

    public Aluno getAluno() { return aluno; }
    public Turma getTurma() { return turma; }
}
