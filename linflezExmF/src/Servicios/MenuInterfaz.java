package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;
/**
 *Interfaz del menú de la implementación.
 * LEIG--07/05/2024
 */
public interface MenuInterfaz {
	/*
	 * Método que muestra el menú principal.
	 * LEIG--07/05/2024
	 */
	public int menuPrincipal(Scanner sc) throws Exception;
	/*
	 * Método que muestra el menú de los empleados.
	 * LEIG--07/05/2024
	 */
	public int menuEmpleados(Scanner sc) throws Exception;
	/*
	 * Método que muestra el menú de los clientes.
	 * LEIG--07/05/2024
	 */
	public int menuClientes(Scanner sc, List<ClienteDto> listaCliente) throws Exception;
	
	/*
	 * Método que muestra el menú de las citas a elegir.
	 * LEIG--07/05/2024
	 */
	public int menuCita(Scanner sc, List<ClienteDto> listaCliente)throws Exception;
}
