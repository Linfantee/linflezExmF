package Dtos;

import java.time.LocalDate;

public class ClienteDto {

	long id;
	String nombre = "aaaa";
	String apellido = "aaaa";
	String DNI = "99999999O";
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public ClienteDto(long id, String nombre, String apellido, String dNI) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
	}
	

	
}
