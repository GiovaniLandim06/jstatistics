import javax.swing.JOptionPane;

import entities.Cliente;
import entities.Jardim;
import entities.Servico;

public class App {
  public static void main(String[] args) throws Exception {

    String nomeCliente = JOptionPane.showInputDialog(null, "Qual o seu nome?");
    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos você tem?"));
    String cpf = JOptionPane.showInputDialog(null, "Qual seu CPF?");

    Cliente cliente = new Cliente(nomeCliente, idade, cpf);
    JOptionPane.showMessageDialog(null, cliente.exibir(), "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);

    int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a largura do seu jardim?"));
    int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o comprimento do seu jardim?"));

    Jardim jardim = new Jardim(largura, comprimento);

    JOptionPane.showMessageDialog(null, "A área do seu Jardim é: " + jardim.calcularArea(), "Sistema de Jardins",
        JOptionPane.INFORMATION_MESSAGE);

    String nomeServico = JOptionPane.showInputDialog(null, "Qual o nome do serviço?");
    int precoServico = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do Serviço? "));

    Servico servico = new Servico(nomeServico, precoServico);
    int opcaoFiliado = JOptionPane.showConfirmDialog(null, "Você possui filiação com nossa empresa?",
        "Sistema de Jardins", JOptionPane.YES_NO_OPTION);

    if(opcaoFiliado == JOptionPane.YES_OPTION){
      int precoOriginal = servico.getPreco();
      servico.aplicarDesconto();
      int precoDesconto = servico.getPreco();
      String mensagem = "Você é filiado a nossa empresa \nPor isso recebeu um desconto de 20% \nPreço original: " + precoOriginal + "\nPreço com desconto: " + precoDesconto;
      JOptionPane.showMessageDialog(null,mensagem, "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
    }else{
      JOptionPane.showMessageDialog(null,"Você não é filiado a nossa empresa \nPreço final: " + servico.getPreco(), "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);

    }

  }
}
