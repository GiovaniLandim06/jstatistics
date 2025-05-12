import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    
    int numAreas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas aréas deseja armazenar?"));
    int[] areas = new int[numAreas];

    for (int i = 0; i < areas.length; i++) {
      int area = Integer
          .parseInt(JOptionPane.showInputDialog(null, "Qual a area em metros quadrados do Jardim #" + (i + 1)));
      areas[i] = area;
        }

        String exibirAreas = "";

     for (int i = 0; i < areas.length; i++) {
        exibirAreas += "\nArea do Jardim #" + (i + 1) + " : " + areas[i];
     }
     JOptionPane.showMessageDialog(null, exibirAreas, "Sistema de Jardins", JOptionPane.INFORMATION_MESSAGE);

  
  }
}
