package entities;

public class Servico {
    private String nomeServico;
    private int preco;


    public Servico(String nomeServico, int preco) {
        this.nomeServico = nomeServico;
        this.preco = preco;
    }
    
    public String getNomeServico() {
        return nomeServico;
    }
    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(){
        preco -= preco * 0.20;
    }
    
}
