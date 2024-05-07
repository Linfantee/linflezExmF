package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;

/*
 * Clase donde se desarolla el menú.
 * LEIG--07/05/2024
 */
public class MenuImplementacion implements MenuInterfaz {


	public int menuPrincipal(Scanner sc)throws Exception{

		int eleccion;
		System.out.println("Menú Principal");
		System.out.println("0. Cerrar menú.");
		System.out.println("1. Entrar en empleados.");
		System.out.println("2. Entrar en clientes.");
		eleccion = sc.nextInt();
		return eleccion;
	}

	public int menuEmpleados(Scanner sc)throws Exception {

		int eleccion;
		System.out.println("Menú Empleados");
		System.out.println("0. Cerrar menú.");
		System.out.println("1. Validar nuevo cliente.");
		System.out.println("2. Imprimir cita.");
		eleccion = sc.nextInt();
		return eleccion;
	}
	
	public int menuClientes(Scanner sc, List<ClienteDto> listaCliente)throws Exception {

		int eleccion;
		System.out.println("Menú Clientes");
		System.out.println("0. Cerrar menú.");
		System.out.println("1. Registo de clientes.");
		System.out.println("2. Solicitud de cita médica.");
		eleccion = sc.nextInt();
		return eleccion;
	}
	
	public int menuCita(Scanner sc, List<ClienteDto> listaCliente)throws Exception {

		int eleccion;
		System.out.println("Menú Cita");
		System.out.println("0. Cerrar menú.");
		System.out.println("01. 01. Psicología.");
		System.out.println("02. Traumatología.");
		System.out.println("03. Fisioterapia.");
		eleccion = sc.nextInt();
		return eleccion;
	}
}
