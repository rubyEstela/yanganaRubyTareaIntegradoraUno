package Ui;

import java.io.IOException;
import java.util.Scanner;

import model.AsociacionRestaurante;
import model.Restaurante;

public class Menu {
	private final static String PATH_RESTAURANTE = "data/restaurante.csv";
	private static final int EXIT_OPCION = 18;;
	private Scanner sc;
	
	public Menu(){
		
		 sc= new Scanner(System.in);
	}
	
	public void starMenu() {
		String menu=getMenuText();
		int opcion;
		do {
		System.out.println(menu);
		opcion=leerOpcion();
		ejecutarOperacion(opcion);
		}while(opcion!=EXIT_OPCION);
		
	}
	
	private String getMenuText() {
		
		
		String menu="=====================================================\n";
		menu +=     "               RESTAURANTES\n";
		menu +=     "=====================================================\n";
		menu +=     "1.REGISTRAR RESTAURANTES\n" ;
		menu +=     "2.REGISTRAR  CLIENTES\n" ;
		menu +=     "3.REGISTRAR PRODUCTOS\n" ;
		menu +=     "4.REGISTRAR PEDIDOS\n" ;
		menu +=     "5.ACTUALIZAR DATOS RESTAURANTES\n" ;
		menu +=     "6.ACTUALIZAR DATOS CLIENTES\n" ;
		menu +=     "7.ACTUALIZAR DATOS PRODUCTO\n" ;
		menu +=     "8 ACTUALIZAR DATOS PEDIDOS\n" ;
		menu +=     "9.CAMBIAR EL ESTADO DE UN PEDIDO\n" ;
		menu +=     "10. IMPORTAR DATOS RESTAURANT\nE" ;
		menu +=     "11. IMPORTAR DATOS CLIENTE\n" ;
		menu +=     "12. IMPORTAR DATOS PRODUCTO\n";
		menu +=     "13. IMPORTAR DATOS PEDIDO\n" ;
		menu +=     "14. EXPORTAR ORDENES\n" ;
		menu +=     "15.BUSCAR UN CLIENTE EFICIENTEMENTE\n" ;
		menu +=     "16. LISTAR EN PANTALLA RESTAURANTES\n" ;
		menu +=     "17.LISTAR EN PANTALLA CLIENTES\n" ;
		menu +=     "18.GUARDAR INFORMACION\n " ;
		menu +=     "POR FAVOR INGRESE LA OPCION\n" ;
				
		
		return menu;
	}
	private int leerOpcion() {
		int op;;
		op=Integer.parseInt(sc.nextLine());
		return op;
	}
	
	private void ejecutarOperacion(int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("*************REGISTRAR RESTAURANTE****************");
			System.out.println("Digite Nit:");
			String nit=sc.nextLine();
			
			System.out.println("Digite Nombre:");
			String nombre=sc.nextLine();
			
			System.out.println("Digite Nombre del Administrador:");
			String nombreAdm=sc.nextLine();
			System.out.println("RESTAURANTE GUARDADO EXITOSAMENTE");
			AsociacionRestaurante objeto3 = null;
			try {
				objeto3 = new AsociacionRestaurante();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				objeto3.addRestaurante(nit, nombre, nombreAdm);
				//objeto3.listarRestaurante();
								
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
	    break;
	    
		
		case 2:
		    break;
		    
		case 3:   
		    break;
		    
		case 4:
		    break;
		    
		case 5:
		    break;
		    
		case 6:
		    break;
		    
		case 7:
		    break;
		    
		case 8:
		    break;
		    
		case 9:
		    break;
		    
		case 10:
			
			System.out.println("Importando datos Restaurante ...");
			
			AsociacionRestaurante objeto = null;
			try {
				objeto = new AsociacionRestaurante();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				objeto.importarRestaurante(PATH_RESTAURANTE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
			
		    break;
		    
		case 11:
		    break;
		    
		case 12:
		    break;
		    
		case 13:
			
			System.out.println("Importar Archivo");
			System.out.println("Coloque la ruta del archico:");
			String leer=sc.nextLine();
			Restaurante rest=new Restaurante();
			try {
				rest.importarPedido(leer);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rest.mostrarPedido();
		    break;
		    
		case 14:
		    break;
		    
		case 15:
		    break;
		    
		case 16:
			System.out.println("*************LISTA RESTAURANTE ORDENADO POR NIT**************");
		
			AsociacionRestaurante objeto2 = null;
			try {
				objeto2 = new AsociacionRestaurante();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		objeto2.listarRestaurante();
		System.out.println("*************LISTA RESTAURANTE ORDENADO ALFABETICO ASCENDENTE**************");
		objeto2.listarRestauranteAscendente();
		
			
		    break;
		    
		case 17:
		    break;
		    
		case 18:
		    break;
		    
		
		 default:
	         
	      break;
		    
	} 

}	

}

