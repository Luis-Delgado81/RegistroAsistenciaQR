package registroasistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/registro_asistencia";
    private static final String USUARIO = "root"; // Cambia si tienes otro usuario
    private static final String CONTRASENA = ""; // Agrega la contraseña si la tienes en XAMPP

    public static void main(String[] args) {

        System.out.println("🔥 Iniciando prueba de conexión...");
        Connection conexion = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
                System.out.println("✅ Conexión exitosa a la base de datos.");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("❌ Error en la conexión: " + e.getMessage());
                }
    }
}
