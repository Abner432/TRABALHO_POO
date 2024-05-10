//criação da classe Pessoa.
public class Pessoa {
    //difinição dos atributos.
    private String cpf;
    private String nome;
    private int idade;

    //criando os construtores
    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    //Criando o método
    public void fazerAniversario(){
        
    }

    //Gerando os acessores
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        //criando retorno
        return "Pessoa{"+
                "CPF='"+cpf+ '\'' +
                ", Nome="+nome+
                ", Idade="+idade+
                '}';
    }
}
