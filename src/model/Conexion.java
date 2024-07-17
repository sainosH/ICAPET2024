package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @Fecha: Martes 16 de Julio del 2024
 * @author Sainos
 * @Descripción: Creación de la clase conecxión para la base de datos.
 */
public class Conexion {

    private Connection conexion;

    public Connection establecerconexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/incapet";
            String usuario = "root";
            String clave = "root";

            conexion = DriverManager.getConnection(url, usuario, clave);
            JOptionPane.showMessageDialog(null, "Se conecto a la BD");
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No conecto a la BD" + e.toString());
            return null;
        }
    }

    public void cerrarconexion() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
