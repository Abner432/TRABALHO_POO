public class App {
    public static void main(String[] args) throws Exception {
        //Instanciando os objetos Disciplina.
        Disciplina disciplina1 = new Disciplina("1","Geometria",1);
        Disciplina disciplina2 = new Disciplina("2","Fisica",1);
        Disciplina disciplina3 = new Disciplina("3","Calculo",1);
        //Instanciando os objetos Aluno.
        Aluno aluno1 = new Bolsista("123.456.789-11", "Joao", 19, "123");
        Aluno aluno2 = new Regular("123.456.789-12", "Jose", 20, "231");
        Aluno aluno3 = new Regular("123.456.789-13", "Maria", 23, "321");
        //Instanciando o objeto Professor.
        Professor professor = new Professor("123.456.789-14", "Carlos", 34, "Matemática");
        //Instanciando os objetos visitantes.
        Visitante visitante1 = new Visitante("123.456.789-15", "Joana", 25);
        Visitante visitante2 = new Visitante("123.456.789-16", "Lucio", 27);
        //Instanciando turmas
        Turma turma1 = new Turma("T1", disciplina1, professor);
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        Turma turma2 = new Turma("T2", disciplina2, professor);
        turma2.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno3);
        Turma turma3 = new Turma("T3", disciplina3, professor);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);
        //Imprimindo as informações das turmas.
        System.out.println("Turma 1:");
        System.out.println("Codigo: " + turma1.getCodigo());
        System.out.println("Disciplina: " + turma1.getDisciplina().getNome());
        System.out.println("Professor: " + turma1.getProfessor().getNome());
        System.out.println("Alunos matriculados:");
        turma1.listarAlunos();
        System.out.println();

        System.out.println("Turma 2:");
        System.out.println("Codigo: " + turma2.getCodigo());
        System.out.println("Disciplina: " + turma2.getDisciplina().getNome());
        System.out.println("Professor: " + turma2.getProfessor().getNome());
        System.out.println("Alunos matriculados:");
        turma2.listarAlunos();
        System.out.println();

        System.out.println("Turma 3:");
        System.out.println("Codigo: " + turma3.getCodigo());
        System.out.println("Disciplina: " + turma3.getDisciplina().getNome());
        System.out.println("Professor: " + turma3.getProfessor().getNome());
        System.out.println("Alunos matriculados:");
        turma3.listarAlunos();
    }
}
