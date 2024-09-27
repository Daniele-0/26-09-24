import java.awt.FlowLayout; // saida das camadas estao fluindo na tela, do primeiro para o ultimo, saida das camadas do modo flow que é o modulo fluxo
import java.awt.event.ActionListener; // importando os acionadores de eventos "Actions" responsaveis por clicar nos botões e exibir as outras telas
import java.awt.event.ActionEvent; // evento vai trazer a ação depois de clicar, trazer informação
import javax.swing.JFrame; // responsavel por toda aerea que ira aparecer
import javax.swing.JButton; // importando o botao
import javax.swing.Icon; // estrutura
import javax.swing.ImageIcon; // carregar a imagem
import javax.swing.JOptionPane; // é a msg que vai aparecer quando clicar nos botões

public class ButtonFrame extends JFrame // declaração da classe buttonframe, extends é a herança, e jframe recebe a herança (toda a estrutura que o botão recebe)
 { // inicia o bloco de codigos da classe butonframe
   private final JButton plainJButton; // declaração de variavel de tipo jbutton
   private final JButton fancyJButton; 

   
   public ButtonFrame() // construtor tem o mesmo nome da classe que tem o mesmo nome do arquivo
   {
      super("Testing Buttons"); // definidor do titulo (testing buttons)
      setLayout(new FlowLayout()); // definir o layout que é a saida das camadas, e vai enviar um novo objeto, um novo layout

      plainJButton = new JButton("Plain Button");  // esta atruindo um novo botão
      add(plainJButton); // ai adc o plainbutton no jframe

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif")); // o bug é do tipo icon, estamos declarando a variavel, o tipo dela, eai o getclass vai coletar a classe imageicon e vai invocar o getresource que é o recurso que é a imagem, ele vai coletar a imagem (bug1vai pegar)
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif")); // estamos enviando o capturador de classe que vai coletar um recurso que é a imagem bug2 
      fancyJButton = new JButton("Fancy Button", bug1); 
      fancyJButton.setRolloverIcon(bug2); // declarar a mesma variavel invocando o metodo setrollevericon (rolar por cima) com o mouse, eai ele troca o bug1 pelo bug2
      add(fancyJButton); // depois de adc o metodo a cima, ai ele vai add o fancujbutton, rendinizando ele no quadrinho

      
      ButtonHandler handler = new ButtonHandler(); // handler é o manipulador o executador, ele vai executar manual, que é uma classe privativa que vai construir logo a baixo
      fancyJButton.addActionListener(handler); // escutador de ação, mas estamos monstrando que ele vai executar o obj handler, que esta na addactionlistener
      plainJButton.addActionListener(handler);
   }

   
   private class ButtonHandler implements ActionListener // buttonhandler implementou a actionlistener dentro de uma classe 
   {
      
      @Override // sobescrito, que esta injetando a linha de codigo dentro do metodo que ja existe 
      public void actionPerformed(ActionEvent event) // precisa ser declarado como o event, que é o parametro, o evento da ação e o escutador da ação
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format( // exibição de dialogo de msg showmessagedialog, o joptionpane só vai se exibir se ele for declarado
            "You pressed: %s", event.getActionCommand())); // vai executar o comando da ação
      } // fechamento da classe buttonhandler
   } 
} 

