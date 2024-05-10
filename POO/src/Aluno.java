/// criando a classe Aluno com herença de pessoa
public class Aluno extends Pessoa{
    //criando o atributo de aluno.
    private String matricula;
    //criando os construtores.
    public Aluno(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula=matricula;
    }
    //criando os acessores.
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //ciando o método de aluno.
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga por: "+this.getNome());
    }
}
