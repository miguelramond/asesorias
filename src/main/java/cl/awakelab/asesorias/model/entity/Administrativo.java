package cl.awakelab.asesorias.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "idusuario")
public class Administrativo extends Usuario {
	
	private String area;
	private String exp;
	
	/* @Id
	@Column(name="idusuario")
	private int idusuario = getIdusuario(); */
	
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", exp=" + exp + ", getIdusuario()=" + getIdusuario() + ", getNombre()="
				+ getNombre() + ", getUname()=" + getUname() + ", getFecha_nac()=" + getFecha_nac() + ", getRun()="
				+ getRun() + ", getTipousuario()=" + getTipousuario() + "]";
	}

	public Administrativo(String nombre, String uname, String psw, String fecha_nac, Integer run, Integer tipousuario, String area, String exp) {
		super(nombre, uname, psw, fecha_nac, run, tipousuario);
		this.area = area;
		this.exp = exp;
	}

	public Administrativo() {

	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}
	
	// Override metodo analizarUsuario para incluir datos de clase hija
	public void analizarUsuario() {
		super.toString();
		this.toString();
	}

}
