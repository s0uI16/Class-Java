
package peliculas.ui;

import peliculas.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
    
    public static void interfazUsuario(){
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPeliculass();
        Pelicula pelicula;
        
        CERRAR:
        while(true){
        
             String opcion = JOptionPane.showInputDialog(
                     null,
                     "1 - Insertar Pelicula \n"
                     + "2 - Listar Pelicula \n"
                     + "3 - Buscar Pelicula \n"
                     + "4  Salir \n",
                     "Ingrese una opción",
                     3
             );
             
             int opcionInt = 0;
             try{
                 opcionInt = Integer.parseInt(opcion);
             }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Las opciones tienen que ser numero\n" + e,
                        "ERROE",
                        JOptionPane.ERROR_MESSAGE
                );
             } catch(Exception e){
                JOptionPane.showMessageDialog(
                        null,
                        e,
                        "ERROE",
                        JOptionPane.ERROR_MESSAGE
                );
             }
 
             switch (opcionInt){
                 case 1:
                     String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                             "Ingrese el nombre de la Pelicula",
                             "Entrada",
                             3
                     );
                     
                     pelicula = new Pelicula(nombrePelicula);
                     peliculas.inertarPelicula(pelicula);
                     break;                    
                     
                 case 2:
                     peliculas.listarPelicula();
                     break;
                 case 3:
                     nombrePelicula = JOptionPane.showInputDialog(
                             null,
                             "Ingrese el nombre de la Pelicula",
                             "Ingrese",
                             3
                     );
                 case 4:
                      break CERRAR;
                 default:
                     JOptionPane.showMessageDialog(
                           null,
                             "Opcion INCORRECTA\n"
                             + "Vuelve a Ingresar una \n"
                             + "Opcion Correcta\n"
                             + "Las Opciones son 1 a 4",
                             "ERROR",
                             JOptionPane.ERROR_MESSAGE);
                     
             }
        }
    }
    
    
}
