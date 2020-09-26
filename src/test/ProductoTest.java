package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Producto;
import model.Restaurante;

class ProductoTest {
	
	public void setUpScenary1() {
		 
	 }
	
		 public void setUpScenary2() {
			 
		 }
	

		 @Test
			void testaddProducto() {
				setUpScenary1();
				String nom= "hamburguesa";
				String  codigo=" hamburguesa 001";
				String descrip=" hamburguesa doble carne";
				String costo="20000";
				String nitRest="12345";
				
				
				
				Producto r= new Producto(nom,codigo,descrip, costo, nitRest);
				assertEquals(nom, r.getNombre());
				assertEquals(codigo, r.getCodigo());
				assertEquals(descrip, r.getDescripcion());
				
				
			
				
			}
		 
		 @Test
			void testaddProducto2() {
				setUpScenary1();
				String nom= "papasFrancesa";
				String  codigo=" papasFrancesa 001";
				String descrip=" papaFrancesaSinSal";
				String costo="2000";
				String nitRest="1234567";
				
				
				
				Producto r= new Producto(nom,codigo,descrip, costo, nitRest);
				assertEquals(nom, r.getNombre());
				assertEquals(codigo, r.getCodigo());
				assertEquals(descrip, r.getDescripcion());
				
				
			
				
			}
		 

}