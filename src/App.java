import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    int servicos;
    int contServico = 0;
    do {
      String msgServicos = "Qual serviço você deseja? \n1-Jardinagem - R$400,00 \n2-Adubação - R$300,00 \n3-Fertilização - R$350,00 \n4-Sair";
      servicos = Integer.parseInt(JOptionPane.showInputDialog(null, msgServicos));
      switch (servicos) {
        case 1:
          JOptionPane.showMessageDialog(null,
              "JARDINAGEM \nVamos jardinar toda a sua aréa da forma que você desejar \n3 Dias de serviço",
              "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
          break;
        case 2:
          JOptionPane.showMessageDialog(null,
              "ADUBAÇÃO \nVamos levar nosso melhor adubo para ajudar suas plantas a se desenvolverem da melhor forma \n1 Dia de serviço",
              "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
          break;
        case 3:
          JOptionPane.showMessageDialog(null,
              "FERTILIZAÇÃO \nVamos fertilizar todas as suas plantas \n2 Dias de Serviço", "Sistema de Jardins",
              JOptionPane.INFORMATION_MESSAGE);
          break;

      }

      contServico++;

    } while (servicos != 4);

    int numJardins = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos jardins você tem?"));
    int[] areasJardins = new int[numJardins];
    int somaAreas = 0;

    for (int i = 0; i < numJardins; i++) {
      int area = Integer
          .parseInt(JOptionPane.showInputDialog(null, "Qual a area em metros quadrados do Jardim #" + (i + 1)));
      areasJardins[i] = area;
      somaAreas += areasJardins[i];
    }

    int mediaAreas = somaAreas / areasJardins.length;
    int jardinsGrandes = 0;
    for (int i = 0; i < areasJardins.length; i++) {
      if (areasJardins[i] > 100) {
        jardinsGrandes++;
      }
    }

    String mensagem = "Você contratou " + (contServico - 1) + " serviços \nVocê tem " + areasJardins.length + " jardins \nA quantidade de jardins com area maior que 100 metros quadrados: " + jardinsGrandes + "\nA media das areas dos seus jardins é: " + mediaAreas;
    JOptionPane.showMessageDialog(null, mensagem, "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);

  }
}
