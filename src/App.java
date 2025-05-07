import java.util.Random;

import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {

    Random random = new Random();
    int[] dado = { 1, 2, 3, 4, 5, 6 };

    String mensagem = "Vamos jogar dados?";
    int somaDados = 0;
    int contLancamentos = 0;

    while (true) {
      int option = JOptionPane.showConfirmDialog(null, mensagem, "Jogo de Dados", JOptionPane.YES_NO_OPTION);
      int resultado = random.nextInt(6);


      if(option == JOptionPane.YES_OPTION){
      String resultadoLancamento = "O número do dado foi: " + dado[resultado];
      somaDados += dado[resultado];
      contLancamentos++;
      JOptionPane.showMessageDialog(null, resultadoLancamento, "Resultado", JOptionPane.INFORMATION_MESSAGE);
      }else  {
        String media =String.format("%.1f", (double) somaDados / contLancamentos);
         String mensagemFinal = "O total de lançamentos foi: " + contLancamentos + "\nA soma dos números lançados foi: " + somaDados + "\nA media dos lançamentos foi: " + media; 
        JOptionPane.showMessageDialog(null,mensagemFinal, "Resultado final do Jogo", JOptionPane.INFORMATION_MESSAGE);
        break;
      }
    }
  }

}
