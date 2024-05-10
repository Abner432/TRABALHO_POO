//criando a classe Professor com herança de Pessoa
public class Professor extends Pessoa{
    //criando os atributos.
    private String centro;
    //criando os construtores.
    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro=centro;
    }
    //criando os acessores.
    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
    //criando o método.
    public void darAula(){
        System.out.println("Professor "+this.getNome()+" esta dando aula.");
    }
}
