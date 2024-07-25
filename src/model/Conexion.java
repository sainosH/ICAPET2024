package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Fecha: Martes 16 de Julio del 2024
 * @author Sainos
 * @Descripción: Creación de la clase conecxión para la base de datos.
 */
public class Conexion {

    private static Connection conexion;
    private static final String URL = "jdbc:mysql://localhost:3306/incapet";
    private static final String USUARIO = "root";
    private static final String CLAVE = "root";

    public static Connection establecerconexion() {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("Se conectó a la BD");
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos: " + e.getMessage());
                conexion = null;
            }
        }
        return conexion;
    }

    public static void cerrarconexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                conexion = null;
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
