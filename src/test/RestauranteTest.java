package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import model.Producto;
import model.Restaurante;

 public class RestauranteTest {
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
		String nom=" ruby";
		String nomAdmi=" carlos";
		
		Restaurante r= new Restaurante(n,nom,nomAdmi);
		assertEquals(n, r.getNit());
		assertEquals(nom, r.getNombre());
		assertEquals(nomAdmi, r.getNombreAdministrador());
	
		
		}
	
	
	
		
	
	
	
	
	
	
	
	
	

}
