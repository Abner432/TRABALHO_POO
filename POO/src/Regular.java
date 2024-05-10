//craindo a classe Regular com herança de Aluno.
public class Regular extends Aluno{
    //Criando os construtores.
    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }
    //fazendo a sobreposição do método pagarMensalidade.
    public void pagarMensalidade(){
        System.out.println("Pagar mensalidade total");
    }
}
