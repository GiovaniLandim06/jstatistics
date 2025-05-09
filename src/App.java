import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
  
    JOptionPane.showMessageDialog(null, "Alô, Jardim!", "Sistema de Serviços para Jardim", JOptionPane.INFORMATION_MESSAGE);

    String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
    String endereco =JOptionPane.showInputDialog(null, "Qual é o seu Endereço?");
    int largura =Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a largura do seu Jardim?"));
    int comprimento =Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o comprimento do seu Jardim?"));

    Cliente cliente = new Cliente(nome, endereco, largura, comprimento);

    String mensagem = "Seu nome é: " + cliente.getNome() + "\nVocê mora no endereço: " + cliente.getEndereco() + "\nE a aréa do seu jardim é: " + cliente.calcularArea();

    JOptionPane.showMessageDialog(null, mensagem, "Sistema de Serviços para Jardim", JOptionPane.INFORMATION_MESSAGE);


  }
}
