import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 3 - Switch e Loops");

        // O switch é uma estrutura de seleção multipla
        // Um if mais organizado

        // Para resolver listas ou constantes

        // int op = Integer.parseInt(JOptionPane.showInputDialog(
        // "Digite a opção: \n 1 - Estatica Descritiva \n 2 - Probabilidade \n 3-Modelos
        // Probabilísticos \n 4 - Sair"));
        /*
         * if(op != 4){
         * switch (op) {
         * case 1:
         * JOptionPane.showMessageDialog(null, "Estatica Descritiva");
         * break;
         * case 2:
         * JOptionPane.showMessageDialog(null, "Probabilidade");
         * break;
         * case 3:
         * JOptionPane.showMessageDialog(null, "Modelos Probabilisticos");
         * break;
         * default:
         * JOptionPane.showMessageDialog(null, "Opção Invalida!");
         * break;
         * }
         * }else{
         * JOptionPane.showMessageDialog(null, "Encerrando Sistema");
         * };,
         * 
         */

        /*
         * int contador = 1;
         * while (contador <= 5) {
         * contador++;
         * JOptionPane.showMessageDialog(null, "Viva o SENAI");
         * }
         * 
         * int i = 1;
         * 
         * while (i <= 5) {
         * System.out.println(i);
         * i++;
         * }
         * 
         * for (int cont = 1; cont <= 10; cont++) {
         * System.out.println(cont);
         * }
         * 
         * String sair;
         * do {
         * 
         * sair = JOptionPane.showInputDialog(null, "Sair: S ou N");
         * 
         * } while (sair.equalsIgnoreCase("N"));
         */


         

         String opcao2;
         do{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1 - Estatica Descritiva \n 2 - Probabilidade \n 3-Modelos Probabilísticos"));
          switch (opcao) {
            case 1:
            JOptionPane.showMessageDialog(null, "Estatica Descritiva");
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "Probabilidade");
            break;
            case 3:
            JOptionPane.showMessageDialog(null, "Modelos Probabilisticos");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Opção Invalida!");
            break;

         }

         opcao2 =  JOptionPane.showInputDialog("Você deseja continuar? \n sim ou não");
        }while(opcao2.equalsIgnoreCase("sim"));
        
    }
}
