import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelPantallaPrincipal extends JPanel implements ActionListener
{
  private JButton btnAlta, btnBuscar, btnEliminar, btnModificar, btnTablaDatos;
  
  
  public JPanelPantallaPrincipal()
  {
   btnAlta = new JButton("Alta");
   btnAlta.addActionListener(this);
   
   btnBuscar = new JButton("Buscar");
   btnBuscar.addActionListener(this);
   
   btnEliminar = new JButton("Eliminar");
   btnEliminar.addActionListener(this);
   
   btnModificar = new JButton("Modificar");
   btnModificar.addActionListener(this);
   
   btnTablaDatos = new JButton("TablaDatos");
   btnTablaDatos.addActionListener(this);
   
   add(btnAlta);
   add(btnBuscar);
   add(btnEliminar);
   add(btnModificar);
   add(btnTablaDatos);
  }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == btnAlta)
   {
     PanelDatos2022 mostrar = new PanelDatos2022();
        JFramePantallaPrincipal.Contenedor.removeAll();
        JFramePantallaPrincipal.Contenedor.add(mostrar, BorderLayout.CENTER);
        JFramePantallaPrincipal.Contenedor.revalidate();
        JFramePantallaPrincipal.Contenedor.repaint();
   }
   if(e.getSource() == btnBuscar)
   {
     PanelBuscar bus = new PanelBuscar();
        JFramePantallaPrincipal.Contenedor.removeAll();
        JFramePantallaPrincipal.Contenedor.add(bus, BorderLayout.CENTER);
        JFramePantallaPrincipal.Contenedor.revalidate();
        JFramePantallaPrincipal.Contenedor.repaint();
   }
   if(e.getSource() == btnEliminar)
   {
     PanelBorrar borrar = new PanelBorrar();
        JFramePantallaPrincipal.Contenedor.removeAll();
        JFramePantallaPrincipal.Contenedor.add(borrar, BorderLayout.CENTER);
        JFramePantallaPrincipal.Contenedor.revalidate();
        JFramePantallaPrincipal.Contenedor.repaint();
   }
   if(e.getSource() == btnModificar)
   {
     PanelModificar md = new PanelModificar();
      JFramePantallaPrincipal.Contenedor.removeAll();
      JFramePantallaPrincipal.Contenedor.add(md, BorderLayout.CENTER);
      JFramePantallaPrincipal.Contenedor.revalidate();
      JFramePantallaPrincipal.Contenedor.repaint();
   }
   if(e.getSource() == btnTablaDatos)
   {
      TablaDatos md = new TablaDatos();
      JFramePantallaPrincipal.Contenedor.removeAll();
      JFramePantallaPrincipal.Contenedor.add(md, BorderLayout.CENTER);
      JFramePantallaPrincipal.Contenedor.revalidate();
      JFramePantallaPrincipal.Contenedor.repaint();
   }
  }
 }