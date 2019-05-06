package tiendavirtual.tienda_completa_v12.org.pl.eshopping.dto;

/*** added by dCategoria
 */
public class Categoria {
	public Integer id;
	public String nombre = "";
	public String descripcion = "";
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) throws Exception {
		if(id != null && id > 0) {
			this.id = id;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre != null && nombre.length() >= 3) {
			this.nombre = nombre;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}