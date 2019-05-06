package tiendavirtual.tienda_completa_v12.org.pl.eshopping.fop;

import java.util.ArrayList;
import java.util.List;
import tiendavirtual.tienda_completa_v12.org.pl.eshopping.dto.Categoria;
import tiendavirtual.tienda_completa_v12.org.pl.eshopping.dto.CategoriaDAO;
/*** added by dAdminCategorias* modified by dAgregarCategoria* modified by
dModificarCategoria* modified by dEliminarCategoria* modified by
dListarCategorias
 */
public class AdminCategoria {
	CategoriaDAO catDAO = new CategoriaDAO();
	Categoria cat = new Categoria();
	/*** added by dAgregarCategoria
	 */
	public void agregar(String n, String d) throws Exception {
		Categoria c = new Categoria();
		c.setNombre(n);
		c.setDescripcion(d);
		catDAO.agregar(c);
	}
	/*** added by dModificarCategoria
	 */
	public void modificar(Integer id, String n, String d) throws Exception {
		Categoria c = new Categoria();
		c.setId(id);
		c.setNombre(n);
		c.setDescripcion(d);
		catDAO.modificar(c);
	}
	/*** added by dEliminarCategoria
	 */
	public void eliminar(Integer id) throws Exception {
		Categoria c = new Categoria();
		c.setId(id);
		catDAO.eliminar(c);
	}
	/*** added by dListarCategorias
	 */
	public List<Categoria> listar(String n, String d) throws Exception {
		return catDAO.listar();
	}
}