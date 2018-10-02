
package peluqueria;
public class Principal {
    public static void main(String[] args) {
        //Invocar al constructor de la clase Bd
        new BdP("peluqueria");
        //Crear un objeto de la clase View
        inicio vista  = new inicio();
        //Crear un objeto de la clase Controller
      vista.setVisible(true);
 
    }
}