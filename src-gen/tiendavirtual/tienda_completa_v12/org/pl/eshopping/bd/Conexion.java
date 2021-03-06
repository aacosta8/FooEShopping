package tiendavirtual.tienda_completa_v12.org.pl.eshopping.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import tiendavirtual.tienda_completa_v12.org.pl.eshopping.general.Config;
/*** added by dConexionNueva
 */
public class Conexion {
	public Connection conn;
	public Conexion() {
	}
	public Connection getConexion() {
		conn();
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public void CerrarConexion() throws SQLException {
		conn.close();
	}
	public void conn() {
		String urlDatabase = Config.SERVIDOR;
		try {
			Class.forName("org.postgresql.Driver");
			setConn(DriverManager.getConnection(urlDatabase, Config.NOMBRE_USUARIO,
					Config.CONTRASENA_USUARIO));
		}
		catch(Exception e) {
			System.out.println("Ocurrio un error : " + e.getMessage());
		}
	}
}