import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PanelModificar extends JPanel implements ActionListener
{
  private JButton btnBuscar,btnModificar;
  private JTextField txtNombre, txtApellidos, txtTelefono, txtCorreoe;
  private JRadioButton tec, trabajo;
  static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();

  
  MPersona mpa = new MPersona();
  
  public PanelModificar()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(30);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(30);
    
    add(lblApellidos);
    add(txtApellidos);

    JLabel lblTelefono = new JLabel("Numero de Celular: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblCorreoe = new JLabel("Correo: ", JLabel.RIGHT);
    txtCorreoe = new JTextField(30);
    
    add(lblCorreoe);
    add(txtCorreoe);
    
    JLabel lblTipo = new JLabel("ELIGE EL TIPO: ", JLabel.CENTER);
     JLabel lblTipo2 = new JLabel("", JLabel.CENTER);
    add(lblTipo);
    add(lblTipo2);

    ButtonGroup gpoBotones = new ButtonGroup();
    tec = new JRadioButton("TecNM/CdGuzman", true);
    trabajo = new JRadioButton("Trabajo");
    gpoBotones.add(tec);
    gpoBotones.add(trabajo);
    
    add(tec);
    add(trabajo);

    
    
    btnBuscar = new JButton("Buscar");
    btnBuscar.addActionListener(this);
    btnModificar = new JButton("Modificar");
    btnModificar.addActionListener(this);
    
    add(btnBuscar);
    add(btnModificar);
  }
  
  public void actionPerformed(ActionEvent e)
  {
     if(e.getSource()==btnBuscar){
       if(txtNombre.getText()==null || txtNombre.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        }else
        {
          Persona ban = mpa.buscar(txtNombre.getText());
          if(ban != null){
            txtNombre.setText(ban.getNombre());
            txtTelefono.setText(ban.getTelefono());
            txtApellidos.setText(ban.getApellidos());
            txtCorreoe.setText(ban.getCorreoe());
            if(ban.getTipo().compareTo("TecNM") == 0){
               tec = new JRadioButton("TecNM/CdGuzman", true);
               trabajo = new JRadioButton("Trabajo");
            }else{
               tec = new JRadioButton("TecNM/CdGuzman");
               trabajo = new JRadioButton("Trabajo",  true);
            }
          }else{
          JOptionPane.showMessageDialog(null, "No se encontraron datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
          }
        }
     }
     String tipo = "TecNM";
     if (trabajo.isSelected())
        tipo = "Trabajo";
     if(e.getSource()==btnModificar){
       if(txtNombre.getText()==null || txtNombre.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        }
       else
        if(txtTelefono.getText()==null || txtTelefono.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes capturar su telefono",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
        }
        else
        {
          mpa.Modificar(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(),
          txtCorreoe.getText(), tipo);
          JOptionPane.showMessageDialog(null, "Se guardaran los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);
            txtApellidos.setText(null);
            txtTelefono.setText(null);
            txtCorreoe.setText(null);
            txtNombre.requestFocus();
        }

     }
      
  }
}