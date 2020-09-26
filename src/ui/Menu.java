package Ui;

import java.io.IOException;
import java.util.Scanner;

import model.AsociacionRestaurante;
import model.Producto;
import model.Restaurante;

public class Menu {
	private final static String PATH_RESTAURANTE = "data/restaurante.csv";
	private final static String PATH_PEDIDO = "data/pedidos.csv";
	private final static String PATH_PRODUCTO = "data/productos.csv ";
	private final static String PATH_CLIENTE = "data/clientes.csv ";
	private static final int EXIT_OPCION = 19;;
	private Scanner sc;
	private AsociacionRestaurante objAsociacionRest;
	private Restaurante objRestaurante;

	public Menu() {

		sc = new Scanner(System.in);

		objAsociacionRest = new AsociacionRestaurante();
		objRestaurante = new Restaurante();

	}

	public void starMenu() {

		String menu = getMenuText();
		int opcion;
		do {
			System.out.println(menu);
			opcion = leerOpcion();
			ejecutarOperacion(opcion);
		} while (opcion != EXIT_OPCION);
	}

	private String getMenuText() {

		String menu = "=====================================================\n";
		menu += "               RESTAURANTES\n";
		menu += "=====================================================\n";
		menu += "1. IMPORTAR DATOS RESTAURANT\n";
		menu += "2. IMPORTAR DATOS CLIENTE\n";
		menu += "3. IMPORTAR DATOS PEDIDO\n";
		menu += "4. IMPORTAR DATOS PRODUCTO\n";
		menu += "5. REGISTRAR RESTAURANTES\n";
		menu += "6. REGISTRAR  CLIENTES\n";
		menu += "7. REGISTRAR PRODUCTOS\n";
		menu += "8  REGISTRAR PEDIDOS\n";
		menu += "9. LISTAR EN PANTALLA RESTAURANTES\n";
		menu += "10. LISTAR EN PANTALLA CLIENTES\n";
		menu += "11. ACTUALIZAR DATOS RESTAURANTES\n";
		menu += "12. ACTUALIZAR DATOS CLIENTES\n";
		menu += "13. ACTUALIZAR DATOS PRODUCTO\n";
		menu += "14. ACTUALIZAR DATOS PEDIDOS\n";
		menu += "15. CAMBIAR EL ESTADO DE UN PEDIDO\n";
		menu += "16. EXPORTAR ORDENES\n";
		menu += "17. BUSCAR UN CLIENTE EFICIENTEMENTE\n";
		menu += "POR FAVOR INGRESE LA OPCION\n";

		return menu;
	}

	private int leerOpcion() {

		int op;
		op = Integer.parseInt(sc.nextLine());

		return op;
	}

	private void ejecutarOperacion(int opcion) {

		switch (opcion) {

		case 1:
			System.out.println("********************IMPORTAR ARCHIVO RESTAURANTE********************");
			try {
				objAsociacionRest.importarRestaurante(PATH_RESTAURANTE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Se importó el archivo restaurante.cvs exitosamente");

			System.out.println("*********************************************************************");

			break;

		case 2:

			System.out.println("********************IMPORTAR ARCHIVO CLIENTE********************");
			try {
				objRestaurante.importarCliente(PATH_CLIENTE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Se importó el archivo cliente.cvs exitosamente");

			System.out.println("*****************************************************************");

			break;

		case 3:
			System.out.println("********************IMPORTAR ARCHIVO PEDIDO********************");
			try {
				objRestaurante.importarPedido(PATH_PEDIDO);
				objRestaurante.listarPedido();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Se importó el archivo pedidos.cvs exitosamente");

			System.out.println("*******************************************************************");

			break;

		case 4:

			System.out.println("********************IMPORTAR ARCHIVO PRODUCTO********************");
			try {
				objRestaurante.importarProducto(PATH_PRODUCTO);
				objRestaurante.listarProducto();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("Se importó el archivo productos.cvs exitosamente");

			System.out.println("*******************************************************************");
			break;

		case 5:

			String entradaRes = "s";

			while (entradaRes.equals("s")) {
				System.out.println("*************REGISTRAR RESTAURANTE****************");
				System.out.println("Digite Nit:");
				String nit = sc.nextLine();

				System.out.println("Digite Nombre:");
				String nombre = sc.nextLine();

				System.out.println("Digite Nombre del Administrador:");
				String nombreAdm = sc.nextLine();

				try {
					objAsociacionRest.addRestaurante(nit, nombre, nombreAdm);
					System.out.println("Desea Registrar otro restaurante? (s) (n): ");
					entradaRes = sc.nextLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;

		case 6:
			
			String entradaClient = "s";

			while (entradaClient.equals("s")) {
				System.out.println("*************REGISTRAR CLIENTES****************");
				System.out.println("digite numero identificacion");
				String identificacion = sc.nextLine();

				System.out.println("Digite nombre:");
				String nombre = sc.nextLine();

				System.out.println("Digite apellido:");
				String apellido= sc.nextLine();
				
				System.out.println("Digite direccion:");
				String direccion= sc.nextLine();

				System.out.println("Digite tipoIdentificacion:");
				String tipoidentificacion= sc.nextLine();

				System.out.println("Digite telefono:");
				String telefono= sc.nextLine();


				try {
				objRestaurante.registrarCliente(identificacion, nombre, apellido, direccion, tipoidentificacion, telefono);
					System.out.println("Desea Registrar otro Cliente? (s) (n): ");
					entradaClient = sc.nextLine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;

		case 7:
			break;

		case 8:
			break;

		case 9:
			System.out.println("*****************LISTAR EN PANTALLA RESTAURANTES ASCENDENTE*************");
			objAsociacionRest.listarRestauranteAscendente();
			System.out.println("*************************************************************************");
			break;

		case 10:

			System.out
					.println("*****************LISTAR EN PANTALLA CLIENTES CON EL TELEFONO DESCENDENTEE*************");
			objRestaurante.mostrarListaCliente();

			System.out
					.println("***************************************************************************************");

			break;

		case 11:
			
			//pedir por escaner los datos nit,nombres,nito
			//objAsociacionRest.actualizarDatosRest(nit, nombre, nit2, nombreAdministrador);
			
			//listarRestaurante
			

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

		default:

			break;

		}

	}

}
