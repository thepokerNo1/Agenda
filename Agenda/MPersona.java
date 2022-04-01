import java.util.*;

public class MPersona
{
  static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();
  private Persona objPersona;
  
  public MPersona()
  {}
  
  public void agregar(String nom, String ap, String tel, String correo, String tipo)
  {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setApellidos(ap);
    objPersona.setTelefono(tel);
    objPersona.setCorreoe(correo);
    objPersona.setTipo(tipo);
    Arrpersona.add(objPersona);//Agrega el objeto al arrayList
  }
  public void desplegar()
  {
     System.out.println("...PERSONAS EN LA AGENDA...");
     
     Iterator<Persona> itrPersona = Arrpersona.iterator();
     while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     System.out.println("Nombre: " + persona.getNombre());
     System.out.println("Telefono: " + persona.getTelefono());
     System.out.println("Tipo: " + persona.getTipo());
     }
   }
   
  public ArrayList Datos()
  {
     return Arrpersona;
  }
  
  public Persona buscar(String a)
  {
     System.out.println("...BUSCAR PERSONAS EN LA AGENDA...");
     
     Iterator<Persona> itrPersona = Arrpersona.iterator();
     while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     System.out.println("Nombre: " + persona.getNombre());
        if(a.compareTo(persona.getNombre()) ==0){
        return persona;
        }
     }
     return null;
   }
   
   public void borrar(String a)
  {
     System.out.println("...BORRAR PERSONAS EN LA AGENDA...");
     
     Iterator<Persona> itrPersona = Arrpersona.iterator();
      int cont = 0;
     while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     System.out.println("Nombre: " + persona.getNombre());
        if(a.compareTo(persona.getNombre()) ==0){
          Arrpersona.remove(cont);
        }
        cont++;
     }
   }
   public void Modificar(String nm,String ap, String tl, String cr, String tipo)
  {
     System.out.println("...MODIFICAR PERSONAS EN LA AGENDA...");
     int cont = 0;
     Iterator<Persona> itrPersona = Arrpersona.iterator();
      while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     System.out.println("Nombre: " + persona.getNombre());
        if(nm.compareTo(persona.getNombre()) ==0){
         Persona pr = new Persona();
         pr.setNombre(nm);
         pr.setApellidos(ap);
         pr.setTelefono(tl);
         pr.setCorreoe(cr); 
         pr.setTipo(tipo);
         Arrpersona.set(cont, pr);
        }
        cont++;
     }
   }
}