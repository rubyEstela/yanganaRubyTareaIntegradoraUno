package Ui;

import java.util.Scanner;

public class Menu {
	
	private static final int EXIT_OPCION = 21;
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
		menu +=     "14. EXPORTAR DATOS RESTAURANT\nE" ;
		menu +=     "15. EXPORTAR DATOS CLIENTE\n" ;
		menu +=     "16. EXPORTAR DATOS PRODUCTO\n";
		menu +=     "17. EXPORTAR DATOS PEDIDO\n" ;
		menu +=     "18.BUSCAR UN CLIENTE EFICIENTEMENTE\n" ;
		menu +=     "19. LISTAR EN PANTALLA RESTAURANTES\n" ;
		menu +=     "20.LISTAR EN PANTALLA CLIENTES\n" ;
		menu +=     "21.GUARDAR INFORMACION\n" ;
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
		    break;
		    
		case 11:
		    break;
		    
		case 12:
		    break;
		    
		case 13:
		    break;
		    
		case 14:
		    break;
		    
		case 15:
		    break;
		    
		case 16:
		    break;
		    
		case 17:
		    break;
		case 18:
		    break;
		    
		case 19:
		    break;
		    
		case 20:
		    break;
		    
		case 21:
		    break;
		    
		 default:
	         
	      break;
		    
	} 

}	

}

