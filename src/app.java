public class App {
    public static void main(String[] args) {

        Professor p1 = new Professor(1, "Carlos Alberto", "carlos@uni.com");
        Disciplina d1 = new Disciplina(1, "Programação Orientada a Objetos", 80);
        Turma t1 = new Turma(1, d1, p1, "Seg e Qua - 19h");

        Aluno a1 = new Aluno(1, "Yanick Reis", "yanick@uni.com");
        Matricula m1 = new Matricula(1, a1, t1);

        Avaliacao av1 = new Avaliacao(1, t1, "Prova 1", 2.0);
        Nota n1 = new Nota(1, av1, a1, 8.5);

        System.out.println("Sistema Acadêmico GHFlusão iniciado.");
        System.out.println(a1);
        System.out.println(t1);
    }
}
