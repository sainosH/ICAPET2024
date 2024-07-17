
package icapet.memorandum;

import model.Conexion;

/**
 * @Fecha: Martes 16 de Julio del 2024
 * @author Vite & Sainos
 * @Descripción: Creación de la clase ICAPETMemorandum para llamar la conexión a la base de datos.
 */
public class ICAPETMemorandum {

    
    public static void main(String[] args) {
        Conexion conn = new Conexion();
        conn.establecerconexion();
        System.out.println("hola");
    }
    
}
