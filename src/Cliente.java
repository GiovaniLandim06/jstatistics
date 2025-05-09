public class Cliente {

    private String nome, endereco;
    private int largura, comprimento;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, int largura, int comprimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int calcularArea(){
        return largura * comprimento;
    }
}
