package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import model.Producto;
import model.Restaurante;

 public class RestauranteTest {
	 Restaurante restau;
	 public void setUpScenary1() {
		 
	 }
 public void setUpScenary3() {
		 
	 }
	
	 public void setUpScenary2() {
			 restau=new Restaurante();
			 
		 }
	 

	@Test
	
	void testRestaurante() {
		setUpScenary1();
		String n= "12345";
		String nom=" hamburguesas";
		String nomAdmi=" walter";
		
		Restaurante r= new Restaurante(n,nom,nomAdmi);
		assertEquals(n, r.getNit());
		assertEquals(nom, r.getNombre());
		assertEquals(nomAdmi, r.getNombreAdministrador());
	
		
		}
	
	@Test
	
	void testRestaurante2() {
		setUpScenary1();
		String n= "899";
		String nom="frijolesVerdes";
		String nomAdmi=" Diego";
		
		Restaurante r= new Restaurante(n,nom,nomAdmi);
		assertEquals(n, r.getNit());
		assertEquals(nom, r.getNombre());
		assertEquals(nomAdmi, r.getNombreAdministrador());
	
		
		}
	
	/**
	 * crear un nuevo contacto vacio
	 */
	
	
	
	
@Test
	
	void testAsociacionRestaurante() {
		setUpScenary2();
		
		Restaurante rs= new Restaurante();
		
		assertNotNull(rs.getClients());
		assertEquals(0,rs.getClients().size(),"");
		
		
		}
	
	
	
	
		
	
	
	
	
	
	
	
	
	

}
