package punto_de_venta;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public String bd = "PuntoDeVenta";
    public String host = "la-guadalupana.chmhdwsd417m.us-west-2.rds.amazonaws.com";
    public String port = "1433";
    public String user = "pvadmin";
    public String pass = "ingsoftware2";
    public String url = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + bd + ";user=" + user + ";password=" + pass;

    public Connection conexion() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url);
            if (cn.isValid(10000)) {
                System.out.println("conectado");
            } else {
                System.out.println("ERRROR EN LA CONEXION");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
}
