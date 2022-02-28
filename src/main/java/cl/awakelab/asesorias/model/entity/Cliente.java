package cl.awakelab.asesorias.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "idusuario")
public class Cliente extends Usuario {
	
	private String apellido;
	private Integer tlf;
	private String AFP;
	private Integer salud;
	private String direccion;
	private String comuna;
	private Integer edad;
	
	/* @Id
	@Column(name="idusuario")
	private int idusuario = getIdusuario(); */
	
	@Override
	public String toString() {
		return "Cliente [apellido=" + apellido + ", tlf=" + tlf + ", AFP=" + AFP + ", salud=" + salud + ", direccion="
				+ direccion + ", comuna=" + comuna + ", edad=" + edad + ", getIdusuario()=" + getIdusuario()
				+ ", getNombre()=" + getNombre() + ", getUname()=" + getUname() + ", getFecha_nac()=" + getFecha_nac()
				+ ", getRun()=" + getRun() + ", getTipousuario()=" + getTipousuario() + "]";
	}

	/* Implementación de nuevo método constructor que incluye atributos 
	padres en args */
	public Cliente(String nombre, String uname, String fecha_nac, Integer run, Integer tipousuario, String apellido, Integer tlf, String AFP, Integer salud,
			String direccion, String comuna, Integer edad) {
		super(nombre, uname, fecha_nac, run, tipousuario);
		this.apellido = apellido;
		this.tlf = tlf;
		this.AFP = AFP;
		this.salud = salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Cliente(String nombre, String uname, String psw,  String fecha_nac, Integer run, Integer tipousuario,
			String apellido, Integer tlf, String AFP, Integer salud, String direccion, String comuna, Integer edad) {
		super(nombre, uname, psw, fecha_nac, run, tipousuario);
		this.apellido = apellido;
		this.tlf = tlf;
		this.AFP = AFP;
		this.salud = salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Cliente() {
		super();
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getTlf() {
		return tlf;
	}

	public void setTlf(Integer tlf) {
		this.tlf = tlf;
	}

	public String getAFP() {
		return AFP;
	}

	public void setAFP(String aFP) {
		AFP = aFP;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public String obtenerNombre() {
		return "NOMBRE Y APELLIDOS: " + super.getNombre() + " " + this.apellido;
	}
	
	public String obtenerSistemaSalud() {
		String isapre = String.valueOf(this.salud);
		
		if (isapre.equals("1")) {
			return "SISTEMA DE SALUD ES: FONASA"; 
		}
		
		else if (isapre.equals("2")) {
			return "SISTEMA DE SALUD ES: ISAPRE"; 
		}
		
		else {
			return "NO SE REGISTRA NI FONASA NI ISAPRE";
		}
		
	}
	
	// Override metodo analizarUsuario para incluir datos de clase hija
	public void analizarUsuario() {
		super.toString();
		this.toString();
	}
	
}
