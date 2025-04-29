import java.util.Scanner; 
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        //Aplicando logica de programação (Aristoteles e George Bollean)

       // Scanner sc = new Scanner(System.in);

        //Exercicio-1: Crie um algoritmo para o JStatistics que leia a opção desejada
        //"Qual o conjunto de dados utilizado: 1-Populacional 2-Amostral"

        int opcao;
        JOptionPane.showMessageDialog(null, "O Jogo da Estatistica: JStatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o Jogo? \n Escolha a Estratégia: \n 1-Populacional \n 2-Amostral"));
        JOptionPane.showMessageDialog(null,"Você escolheu: " + opcao , "JStatistics", JOptionPane.INFORMATION_MESSAGE);
       

       
        
        
    

        String opcaoVariavel = JOptionPane.showInputDialog(null, "Que tipo de variável você deseja cadastrar: \n 1-Quantitativa \n 2-Qualitativa");
        int opVariavel = Integer.parseInt(opcaoVariavel);
                JOptionPane.showMessageDialog(null,"Sua escolha foi: " + opVariavel , "JStatistics", JOptionPane.INFORMATION_MESSAGE);



       


        
    }
}
