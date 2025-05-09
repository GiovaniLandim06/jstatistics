import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
  
    String nomeCliente = JOptionPane.showInputDialog(null, "Qual o seu nome?");
    String cpf = JOptionPane.showInputDialog(null, "Qual seu CPF?");
    
    int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a largura do seu jardim?"));
    int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o comprimento do seu jardim?"));

    JOptionPane.showMessageDialog(null, nomeCliente, cpf, comprimento);
 
  }

  public int calcularArea(int largura, int comprimento){
    return largura * comprimento;
  }

}
