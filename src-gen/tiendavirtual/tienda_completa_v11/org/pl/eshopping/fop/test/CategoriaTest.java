package tiendavirtual.tienda_completa_v11.org.pl.eshopping.fop.test;

import tiendavirtual.tienda_completa_v11.org.pl.eshopping.dto.Categoria;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*** added by dCategoriaTest* modified by dTestearIdCategoria* modified by
dTestearIdCategoria* modified by dTestearNombreCategoria* modified by
dTestearNombreCategoria* modified by dTestearNombreCategoria* modified by
dTestearNombreCategoria
 */
public class CategoriaTest {
	public CategoriaTest() {
	}
	@BeforeClass
	public static void setUpClass() {
	}
	@AfterClass
	public static void tearDownClass() {
	}
	@Before
	public void setUp() {
	}
	@After
	public void tearDown() {
	}
	/*** added by dTestearIdCategoria
	 */
	@Test(expected = IllegalArgumentException.class)
	public void SetId_NegativeNumberAsParam_ExceptionThrown() throws Exception {
		System.out.println("setId");
		Integer id = - 1;
		Categoria instance = new Categoria();
		instance.setId(id);
	}
	/*** added by dTestearIdCategoria
	 */
	@Test(expected = IllegalArgumentException.class)
	public void SetId_NullNumberAsParam_ExceptionThrown() throws Exception {
		System.out.println("setId");
		Integer id = null;
		Categoria instance = new Categoria();
		instance.setId(id);
	}
	/*** added by dTestearNombreCategoria
	 */
	@Test(expected = IllegalArgumentException.class)
	public void SetNombre_EmptyStringAsParam_ExceptionThrown() throws Exception {
		System.out.println("setNombre");
		String nombre = "";
		Categoria instance = new Categoria();
		instance.setNombre(nombre);
	}
	/*** added by dTestearNombreCategoria
	 */
	@Test(expected = IllegalArgumentException.class)
	public void SetNombre_NullStringAsParam_ExceptionThrown() throws Exception {
		System.out.println("setNombre");
		String nombre = null;
		Categoria instance = new Categoria();
		instance.setNombre(nombre);
	}
	/*** added by dTestearNombreCategoria
	 */
	@Test(expected = IllegalArgumentException.class)
	public void SetNombre_StringWithLessThan3LetterAsParam_ExceptionThrown()
	throws Exception {
		System.out.println("setNombre");
		String nombre = "Al";
		Categoria instance = new Categoria();
		instance.setNombre(nombre);
	}
	/*** added by dTestearNombreCategoria
	 */
	@Test
	public void GetNombre_NewInstanceOfCategory_EmptyName() {
		System.out.println("getNombre");
		Categoria instance = new Categoria();
		String nombre = instance.getNombre();
		assertSame("", nombre);
	}
}