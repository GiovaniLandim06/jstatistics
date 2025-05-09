import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {

    JOptionPane.showMessageDialog(null, "Alô, Jardim!", "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
    int areaJardim = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a aréa do seu jardim?(Em metros)"));


    if (areaJardim <= 30) {
      JOptionPane.showMessageDialog(null, "Seu Jardim é pequeno", "Sistema de Jardins",
          JOptionPane.INFORMATION_MESSAGE);
    } else if (areaJardim > 30 && areaJardim <= 50) {
      JOptionPane.showMessageDialog(null, "Seu Jardim é medio", "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null, "Seu Jardim é grande", "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
    }

    String msgServicos = "Qual serviço você deseja? \n1-Jardinagem - R$400,00 \n2-Adubação - R$300,00 \n3-Fertilização - R$350,00";
    int servicos = Integer.parseInt(JOptionPane.showInputDialog(null, msgServicos));

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
        JOptionPane.showMessageDialog(null, "FERTILIZAÇÃO \nVamos fertilizar todas as suas plantas \n2 Dias de Serviço", "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
       break;

      default:
      JOptionPane.showMessageDialog(null, "ERRO \nServiço incorreto", "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);
        break;
    }
  }
}
