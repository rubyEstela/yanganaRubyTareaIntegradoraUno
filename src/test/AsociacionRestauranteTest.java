package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Restaurante;

class AsociacionRestauranteTest {
	Restaurante restau;
	 public void setUpScenary1() {
		 
	 }
	
	 public void setUpScenary2() {
			 restau=new Restaurante();
			 
		 }
	 

	@Test
	
	void testRestaurante() {
		setUpScenary1();
		String n= "1234";
		String nom=" pizzaAlPaso";
		String nomAdmi=" ruby";
		
		Restaurante r= new Restaurante(n,nom,nomAdmi);
		assertEquals(n, r.getNit());
		assertEquals(nom, r.getNombre());
		assertEquals(nomAdmi, r.getNombreAdministrador());
	
		
		}
	
	void testRestaurante2() {
		setUpScenary1();
		String n= "567";
		String nom=" dominos";
		String nomAdmi=" martha";
		
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
