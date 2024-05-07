package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplemetacion;
import Servicios.OperativaInterfaz;

public class inicio {

	/*
	 * Clase principal de la aplicación.
	 * LEIG--07/05/2024
	 */

	public static List<ClienteDto> listaCliente = new ArrayList<ClienteDto>();

	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplemetacion();
		Scanner sc = new Scanner(System.in);

		boolean cerrarMenu = false;
		int opcion = 0;

		try {

			while (!cerrarMenu) {

				opcion = mi.menuPrincipal(sc);

				switch (opcion) {
				case 0:
					System.out.println("Cerrando aplicación, gracias por su visita.");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("");
					System.out.println("Entrando en la versión empleados.");
					
					int opcion1;
					opcion1 = mi.menuEmpleados(sc);
					switch (opcion1) {
					case 0:
						System.out.println("Volviendo al menú principal.");
						break;
					case 1:
						System.out.println("A continuacion podras validar un nuevo cliente:");

						break;
					case 2:
						System.out.println("A continuacion podras imprimir las citas de un día:");

						break;
					default:
						System.out.println("La opción seleccionada no existe se le devolvera al menú principal.");
						break;
					}
				case 2:
					System.out.println("");
					System.out.println("Entrando en la versión cliente.");
					
					int opcion2;
					opcion2 = mi.menuClientes(sc, listaCliente);
					switch (opcion2) {
					case 0:
						System.out.println("Volviendo al menú principal.");
						break;
					case 1:
						System.out.println("A continuacion podras registrarte como nuevo cliente:");
						opcion2 = oi.registroCliente(sc, listaCliente);
						break;
					case 2:
						System.out.println("A continuacion podras solicitar una cita medica:");
						opcion2 = oi.solicitudCita(sc, listaCliente);
						break;
					default:
						System.out.println("La opción seleccionada no existe se le devolvera al menú principalS.");
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Oh vaya, parece que ha ocurrido un error estamos solucionandolo, vuelva en 15 min.");

		}
	}
}
