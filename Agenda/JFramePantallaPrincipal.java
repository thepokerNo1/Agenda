import javax.swing.*;
import java.awt.*;

public class JFramePantallaPrincipal extends JFrame
{
   JPanelPantallaPrincipal mostrar = new JPanelPantallaPrincipal();
   JPanel Background = new JPanel();
   public static JPanel Contenedor = new JPanel();
   
    public JFramePantallaPrincipal()
   { 
     initComponents();
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(700, 300);
      setTitle("Agenda");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      Background.add(mostrar, BorderLayout.NORTH);
      Background.add(Contenedor, BorderLayout.CENTER);
      setContentPane(Background);
      
      TablaDatos md = new TablaDatos();
        Contenedor.removeAll();
        Contenedor.add(md, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
         setVisible(true);
       
   }   
}