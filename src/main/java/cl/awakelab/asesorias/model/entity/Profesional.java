package cl.awakelab.asesorias.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "idusuario")
public class Profesional extends Usuario {

	private String titulo;
	private String ingreso;
	
	/* @Id
	@Column(name="idusuario") 
	private int idusuario = getIdusuario(); */

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", ingreso=" + ingreso + ", getIdusuario()=" + getIdusuario()
				+ ", getNombre()=" + getNombre() + ", getUname()=" + getUname() + ", getFecha_nac()=" + getFecha_nac()
				+ ", getRun()=" + getRun() + ", getTipousuario()=" + getTipousuario() + "]";
	}

	public Profesional(String nombre, String uname, String psw, String fecha_nac, Integer run, Integer tipousuario, String titulo, String ingreso) {
		super(nombre, uname, psw, fecha_nac, run, tipousuario);
		this.titulo = titulo;
		this.ingreso = ingreso;
	}

	public Profesional() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIngreso() {
		return ingreso;
	}

	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

	// Override metodo analizarUsuario para incluir datos de clase hija
	public void analizarUsuario() {
		super.toString();
		this.toString();
	}

}

