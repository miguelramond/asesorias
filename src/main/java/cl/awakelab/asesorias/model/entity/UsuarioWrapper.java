package cl.awakelab.asesorias.model.entity;

/* Clase de tipo wrapper para ser usado en controlador de creacion 
 * de usuario, que contendrá getters de la superclase 'usuario' y 
 * sus clases hijas para poder pasar al modelo durante POST para 
 * luego ingresar a DB */
public class UsuarioWrapper {
	
	private Usuario usuario;
	private Cliente cliente;
	private Administrativo administrativo;
	private Profesional profesional;
	
	public UsuarioWrapper(Usuario usuario, Cliente cliente, Administrativo administrativo, Profesional profesional) {
		super();
		this.usuario = usuario;
		this.cliente = cliente;
		this.administrativo = administrativo;
		this.profesional = profesional;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Administrativo getAdministrativo() {
		return administrativo;
	}
	public void setAdministrativo(Administrativo administrativo) {
		this.administrativo = administrativo;
	}
	public Profesional getProfesional() {
		return profesional;
	}
	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}
	
	

}
