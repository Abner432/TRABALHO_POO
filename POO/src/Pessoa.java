//criação da classe pessoa.
public class Pessoa {
    //difinição dos atributos.
    private String cpf;
    private String nome;
    private int idade;

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
}
