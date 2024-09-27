// Importando módulo JFrame, do método swing da biblioteca javax
import javax.swing.JFrame;

public class ButtonTest 
// iniciando o bloco de codigos ButtonTest
{
   public static void main(String[] args)
   // Inicio do bloco de codigos do método principal
   { 
      // Declaração da variavel ButonFrame e definindo a váriavel cujo valor ira ser um novo obj BottonFrame
      ButtonFrame buttonFrame = new ButtonFrame(); 
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechamento padrão
      buttonFrame.setSize(275, 110); // defindo tamanho e altura
      buttonFrame.setVisible(true); // dando o play e mostrando a tela
   } 
} 


