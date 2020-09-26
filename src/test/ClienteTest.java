package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Cliente;
import model.Restaurante;

class ClienteTest {
	
	public void setUpScenary1() {
		
	}
	public void setUpScenary2() {
		
	}

	@Test
	
		
		void testCliente() {
			setUpScenary1();
			String numeroIdentificacion="1151937";
			String nombre="leonor";
			String apellido="yangana";
			String direccion="calimio";
			String tipoIdentificacion="cedula";
			String telefono="3245678";
			
			
			Cliente r= new Cliente(numeroIdentificacion,nombre,apellido,direccion,tipoIdentificacion,telefono);
			assertEquals(numeroIdentificacion, r.getNumeroidentificacion());
			assertEquals(nombre, r.getNombre());
			assertEquals(apellido, r.getApellido());
			assertEquals(direccion, r.getDireccion());
			assertEquals(tipoIdentificacion, r.getTipoIdentificacion());
			assertEquals(telefono, r.getTelefono());
			
			
			
			
			
			
			}
@Test
	
	void testClientesVacio() {
		setUpScenary2();
		
		Cliente cl= new Cliente();
		
		assertNotNull(cl.getPedido());
		assertEquals(0,cl.getPedido().size(),"");
		
		
		}
		
		
	}


