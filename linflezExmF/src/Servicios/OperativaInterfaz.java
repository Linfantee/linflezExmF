package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;
/*
 * Interfaz de la operativa de la implementación.
 * LEIG--07/05/2024
 */
public interface OperativaInterfaz {

	/*
	 * Método que regista un cliente.
	 * LEIG--07/05/2024
	 */
	public int registroCliente(Scanner sc, List<ClienteDto> listaCliente)throws Exception;
	
	/*
	 * Método que solicita una cita y la guarda.
	 * LEIG--07/05/2024
	 */
	public int solicitudCita(Scanner sc, List<ClienteDto> listaCliente)throws Exception;
}
