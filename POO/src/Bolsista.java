//criando a classe Bolsista com herança de ALuno
public class Bolsista extends Aluno{
    
    //criando os construtores.
    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }
    //fazendo a sobreposição do método pagarMensalidade.
    public void pagarMensalidade(){
        System.out.println("Isento de mensalidade");
    }

}
