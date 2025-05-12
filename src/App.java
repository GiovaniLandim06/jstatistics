import javax.swing.JOptionPane;

public class App {
  
  public static void main(String[] args) throws Exception {
  
    String nomeCliente = JOptionPane.showInputDialog(null, "Qual o seu nome?");
    String cpf = JOptionPane.showInputDialog(null, "Qual seu CPF?");
    
    int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a largura do seu jardim?"));
    int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o comprimento do seu jardim?"));

    String dadosUsuarios = "Seu nome é: " + nomeCliente + "\nSeu CPF é: " + cpf +  "\nA área do seu jardim é: " + calcularArea(largura, comprimento); 
    JOptionPane.showMessageDialog(null, dadosUsuarios, "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);

    int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros deseja armazenar no array?"));

    int[] vetor = new int[n];

    for (int i = 0; i < vetor.length; i++) {
     int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor que deseja armazenar na posição " + i));
     vetor[i] = valor;
    }

    JOptionPane.showMessageDialog(null, "A media dos valores do seu array é: " + calcularMedia(vetor), "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
  
  }

  public static int calcularArea(int largura, int comprimento){
    return largura * comprimento;
  }

  public static int calcularMedia(int[] array){
    int soma = 0;
    for (int i : array) {
      soma += i;
    }

    return soma / array.length;

  }
}
