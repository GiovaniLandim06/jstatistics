import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    // Classe é um conjunto de objetos
    // Nosso objetivo nesse código é entender a diferença
    // Entre metodo com o tipo void e metodo com o Tipo String

    Mamifero m1 = new Mamifero();
    m1.setNomeCientifico("Bos Taurus");
    System.out.println("Nome cientifico: " + m1.getNomeCientifico());

    //Desafio: Crie mais dois objetos

    Mamifero m2 = new Mamifero();
    m2.setNomeCientifico("Macropus");
    System.out.println("Nome cientifico: " + m2.getNomeCientifico());

    Mamifero m3 = new Mamifero();
    m3.setNomeCientifico("Trichechus");
    System.out.println("Nome cientifico: " + m3.getNomeCientifico());

  }
}
