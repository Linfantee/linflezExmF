package Servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import Controladores.inicio;
import Dtos.ClienteDto;
/*
 * Clase que contiene la operativa de los métodos.
 * LEIG--07/05/2024
 */
public class OperativaImplemetacion implements OperativaInterfaz{
	MenuInterfaz mi = new MenuImplementacion();
	
	/*
	 * Método que genera un id automatico.
	 * LEIG--07/05/2024
	 */
	private long idAutomatico() throws Exception {
		
		int tamanio = inicio.listaCliente.size();
		long id;
		if(tamanio <=0) {
			id=1;
		}else {
			id = inicio.listaCliente.get(tamanio-1).getId() +1;
		}
		return id;
		
	}
	public int registroCliente(Scanner sc, List<ClienteDto> listaCliente)throws Exception {
		int registro = 0;

		long id = idAutomatico();
		System.out.println("Introduzca su nombre por favor.");
		String nombre = sc.next();
		System.out.println("Introduzca su apellido por favor.");
		String apellidos = sc.next();
		System.out.println("Introduzca su DNI por favor.");
		String dni = sc.next();
		LocalDate fechaInstante = LocalDate.now();
		ClienteDto cliente = new ClienteDto(id,dni,nombre,apellidos);
		inicio.listaCliente.add(cliente);
		System.out.println("Se ha guardado correctamente.");
		
	return registro;
		
	}
	
	
	public int solicitudCita(Scanner sc, List<ClienteDto> listaCliente)throws Exception {
       int cita = 0;
       System.out.println("Introduzca su DNI.");
       String dni = sc.next();
       System.out.println("Escoja la especialida la cual desea la cita.");
       
       
       boolean cerrarMenu = false;
		int opcion = 0;
       while(!cerrarMenu)


			opcion = mi.menuCita(sc, listaCliente);
       switch (opcion) {
		case 0:
			System.out.println("Volviendo al menú principal.");
			break;
		case 1:
			 System.out.println("01. Psicología");

			break;
		case 2:
			System.out.println("02. Traumatología");

			break;
		default:
			System.out.println("03. Fisioterapia");
			break;
		}
    	   System.out.println("01. Psicología");
    	   System.out.println("01. Traumatología");
    	   System.out.println("01. Fisioterapia");
    	   
      
      
      
       return cita;
		
		
		
		
		
		
	}
}
