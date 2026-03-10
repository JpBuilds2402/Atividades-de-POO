package POO;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Cidade: " + cidade);
    }
    public void setCidade(String novacidade){
        this.cidade = novacidade;
    }
}
