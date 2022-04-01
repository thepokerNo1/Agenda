import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PanelBorrar extends JPanel implements ActionListener
{
  private JButton btnBorrar;
  private JTextField txtNombre, txtApellidos, txtTelefono, txtCorreoe;
  private JRadioButton tec, trabajo;
  static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();

  
  MPersona mpa = new MPersona();
  
  public PanelBorrar()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(30);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(30);
    txtApellidos.setEditable(false);
    add(lblApellidos);
    add(txtApellidos);

    JLabel lblTelefono = new JLabel("Numero de Celular: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    txtTelefono.setEditable(false);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblCorreoe = new JLabel("Correo: ", JLabel.RIGHT);
    txtCorreoe = new JTextField(30);
    txtCorreoe.setEditable(false);
    add(lblCorreoe);
    add(txtCorreoe);
    
    JLabel lblTipo = new JLabel("ELIGE EL TIPO: ", JLabel.CENTER);
     JLabel lblTipo2 = new JLabel("", JLabel.CENTER);
    add(lblTipo);
    add(lblTipo2);

   
    
    
    btnBorrar = new JButton("Borrar");
    btnBorrar.addActionListener(this);
    
    add(btnBorrar);
  }
  
  public void actionPerformed(ActionEvent e)
  {
     if(e.getSource()==btnBorrar){
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
            mpa.borrar(txtNombre.getText());
            JOptionPane.showMessageDialog(null, "Los datos se boraron correctamente",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);

          }else{
          JOptionPane.showMessageDialog(null, "No se encontraron datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
          }
        }

     }
      
  }
}