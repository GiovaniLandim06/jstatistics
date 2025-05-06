import java.util.Random;

import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {

    // Cara ou coroa - Probabilidade
    // 50% cara e 50% coroa
    // Variavel que receba a interação do jogo
    // Random
    // Switch
    // For, do while e While

    String[] espaçoAmostral = { "Cara", "Coroa" };

    System.out.println(espaçoAmostral[0]);
    System.out.println(espaçoAmostral[1]);

    Random random = new Random();

    // Contadores para verificar a distribuição
    int contCara = 0;
    int contCoroa = 0;

    String mensagem = "Espaço amostral: {Cara, Coroa} \n" + "Probabilidade de Cara: 50% \n"
        + "Probabilidade de Coroa: 50% \n" + "Deseja lançar a moeda?";

    // loop de lançamento

    while (true) {
      // interação com usuário
      int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando moedas", JOptionPane.YES_NO_OPTION);
      if(opcao != JOptionPane.YES_OPTION){

        //estatisticas
        String estaticas = "Jogo finalizado! \n Total de lançamentos: " + (contCara + contCoroa) + "\n Caras:" + contCara + "\nCoroas: " + contCoroa
        ,003;
        JOptionPane.showMessageDialog(null, estaticas, "Resultado Final" ,JOptionPane.INFORMATION_MESSAGE); 
        break;
      }
      int resultado = random.nextInt(2); // 0-cara 1-coroa
      if (resultado == 0) {
        contCara++;
      }else{
        contCoroa++;
      }
      String saida = "Resultado do lançamento: " + espaçoAmostral[resultado] + "\n(Indice gerado: " + resultado + ")";

      JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);

     

    }

  }
}
