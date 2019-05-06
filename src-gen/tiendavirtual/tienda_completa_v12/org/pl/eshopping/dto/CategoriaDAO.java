package tiendavirtual.tienda_completa_v12.org.pl.eshopping.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tiendavirtual.tienda_completa_v12.org.pl.eshopping.bd.Conexion;
/*** added by dCategoriaDAO* modified by dAgregarCategoria* modified by
dModificarCategoria* modified by dEliminarCategoria* modified by
dListarCategorias
 */
public class CategoriaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	Conexion conexion = null;
	/*** added by dAgregarCategoria
	 */
	public void agregar(Categoria c) {
		try {
			conn = Conexion.getConexion();
			String query = "INSERT INTO categoria (nombre, descripcion) values (?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getDescripcion());
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
	}
	/*** added by dModificarCategoria
	 */
	public void modificar(Categoria c) {
		try {
			conn = Conexion.getConexion();
			String query = "UPDATE categoria set nombre=?, descripcion=? WHERE id=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getDescripcion());
			ps.setString(3, c.getId().toString());
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
	}
	/*** added by dEliminarCategoria
	 */
	public void eliminar(Categoria c) {
		try {
			conn = Conexion.getConexion();
			String query = "DELETE FROM categoria WHERE id=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, c.getId().toString());
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
	}
	/*** added by dListarCategorias
	 */
	public List<Categoria> listar() {
		List<Categoria> resultado = new ArrayList<Categoria>();
		try {
			conn = Conexion.getConexion();
			String query = "SELECT id, nombre, descripcion FROM categoria";
			ps = conn.prepareStatement(query);
			ResultSet registros = ps.executeQuery();
			while(registros.next()) {
				Categoria c = new Categoria();
				c.setId(registros.getInt(1));
				c.setNombre(registros.getString(2));
				c.setDescripcion(registros.getString(3));
				resultado.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
		return resultado;
	}
}