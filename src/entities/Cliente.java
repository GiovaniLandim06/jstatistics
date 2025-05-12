package entities;

public class Cliente {

    private String nome;
    private int idade;
    private String cpf;


    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
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
    public String getcpf() {
        return cpf;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String exibir(){
        return "Seu nome é: " + getNome() + "\nVocê tem " + getIdade() + " anos \nSeu CPF é: " + getcpf();
    }
    
}
