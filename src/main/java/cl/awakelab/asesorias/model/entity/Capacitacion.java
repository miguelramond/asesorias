package cl.awakelab.asesorias.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="capacitacion")
public class Capacitacion {
	
	@Id
	@Column(name="id")
	private int id;
	private Integer rutcliente;
	private Integer dia;
	private Integer hora;
	private String lugar;
	private Integer duracion;
	private Integer qty;
	
	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rutcliente=" + rutcliente + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", duracion=" + duracion + ", qty=" + qty + "]";
	}
	
	public Capacitacion(int id, Integer rutcliente, Integer dia, Integer hora, String lugar, Integer duracion, Integer qty) {
		super();
		this.id = id;
		this.rutcliente = rutcliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.qty = qty;
	}
	
	public Capacitacion(Integer rutcliente, Integer dia, Integer hora, String lugar, Integer duracion, Integer qty) {
		super();
		this.rutcliente = rutcliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.qty = qty;
	}
	
	public Capacitacion() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getrutcliente() {
		return rutcliente;
	}

	public void setrutcliente(Integer rutcliente) {
		this.rutcliente = rutcliente;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	public String mostrarDetalle() {
		return "La capacitación será en " + lugar +  " a las " + hora + " del día "
				+ dia + ", y durará " + (duracion * 60) + " minutos";
	}

}
