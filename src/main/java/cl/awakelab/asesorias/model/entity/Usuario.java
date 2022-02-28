package cl.awakelab.asesorias.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario{
	
	@Id
	private int idusuario;
	private String nombre;
	private String uname;
	private String psw;
	private String fecha_nac;
	private Integer run;
	/* Se define columna de tipousuario para poder 
	usar en busqueda de un usuarios segun su tipo */
	@Column(name="tipousuario")
	private Integer tipousuario;
	
	
	public Usuario(int idusuario, String nombre, String uname, String fecha_nac, Integer run, Integer tipousuario) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.uname = uname;
		this.fecha_nac = fecha_nac;
		this.run = run;
		this.tipousuario = tipousuario;
	}

	public Usuario(String nombre, String uname, String fecha_nac, Integer run , Integer tipousuario) {
		super();
		this.nombre = nombre;
		this.uname = uname;
		this.fecha_nac = fecha_nac;
		this.run = run;
		this.tipousuario = tipousuario;
	}	
	
	public Usuario(String nombre, String uname, String psw, String fecha_nac, Integer run, Integer tipousuario) {
		super();
		this.nombre = nombre;
		this.uname = uname;
		this.psw = psw;
		this.fecha_nac = fecha_nac;
		this.run = run;
		this.tipousuario = tipousuario;
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nombre=" + nombre + ", uname=" + uname + ", psw=" + psw
				+ ", fecha_nac=" + fecha_nac + ", run=" + run + ", tipousuario=" + tipousuario + "]";
	}

	public Usuario() {
		super();
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
	}

	public Integer getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(Integer tipousuario) {
		this.tipousuario = tipousuario;
	}

	public String mostrarEdad() {
		
		String anio = "";
		
		for (Integer i = 0; i < 4; i++) {
			anio = anio + fecha_nac.charAt(6 + i);
		}
		
		Integer edad = 2022 - Integer.parseInt(anio);		
		
		return "El usuario tiene " + edad + " años";
	}
	
}
