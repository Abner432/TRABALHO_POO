//criando a Classe Turma.

import java.util.ArrayList;

public class Turma {
    //definição dos atributos.
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    
    //Gerando os construtores.
    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    //criando os métodos
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAlunos(Aluno aluno){
        alunos.remove(aluno);
    }
    public void listarAlunos(){
        for(Aluno aluno:alunos){
            System.out.println(aluno.getNome());
        }
    }

    //gerando os acessores.
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}
