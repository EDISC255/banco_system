package control.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection coneccion;

    public Conexion(String host, String port, String user, String passwd) throws SQLException {
        this.coneccion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port, user, passwd);
    }

    public Connection getConeccion() {
        return coneccion;
    }

    public void cerrarConeccion() throws SQLException {
        this.coneccion.close();
    }
}
