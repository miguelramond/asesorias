package cl.awakelab.asesorias.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.asesorias.model.entity.Administrativo;
import cl.awakelab.asesorias.model.entity.Cliente;
import cl.awakelab.asesorias.model.entity.Profesional;
import cl.awakelab.asesorias.model.entity.Usuario;
import cl.awakelab.asesorias.model.entity.UsuarioWrapper;
import cl.awakelab.asesorias.model.service.UsuarioService;

// Controlador para acceder al panel de creacion de usuarios
@Controller
public class CrearUsuarioController {
	
	@Autowired
	private UsuarioService us;
	
	/* Se inyecta instancia de PasswordEncoder para codificar con Bcrypt 
	 * contraseña ingresada en creacion de nuevo usuario */
	@Autowired
	PasswordEncoder pe;
	
	/* Se creacn instancias vacias de superclase 'usuario' y clases hijas para poder
	pasar al GET una instancia de tipo UsuarioWrapper, que contendrá getters de todas 
	las clases para poder poblar el formulario de creación */
	Usuario usuario = new Usuario();
	Cliente cliente = new Cliente();
	Administrativo administrativo = new Administrativo();
	Profesional profesional = new Profesional();
	
	// Metodo GET que llama a formulario en blanco
	@RequestMapping(value = "/crearusuario", method = RequestMethod.GET)
	public ModelAndView mostrarCrearUsuario() {
		
		return new ModelAndView("crearusuario", "usuariowrapper", new UsuarioWrapper(usuario, cliente, administrativo, profesional));
	}
	
	// Metodo POST para agregar un usuario nuevo a DB
	@RequestMapping(value = "/crearusuario", method = RequestMethod.POST)
	
	/* Se asigna de nuevo como modelo una instancia de UsuarioWrapper que 
	 * contiene los getters de todas las clases, y también se asigna un @RequestParam para 
	 * tomar el valor del boton radio presionado en el formulario */
    public ModelAndView submit(@ModelAttribute("usuariowrapper")UsuarioWrapper usuariowrapper, @RequestParam("tipousuario") String tipo,
    	      BindingResult result, ModelMap model) {
				
				/* Se encripta la contraseña ingresada como valor 
					simple en formulario */
				String psw = pe.encode(usuariowrapper.getUsuario().getPsw());
				
				/* Se ingresa la contraseña encriptada a la instancia 
					de usuario para pasar a DB */
				usuariowrapper.getUsuario().setPsw(psw);
				
				/* Se toma el resto de los atributos del 
					formulario y se ingresa la contraseña codificada al modelo */
    	        model.addAttribute("usuario.nombre", usuariowrapper.getUsuario().getNombre());
    	        model.addAttribute("usuario.uname", usuariowrapper.getUsuario().getUname());
    	        model.addAttribute("usuario.psw", psw);
    	        model.addAttribute("usuario.fecha_nac", usuariowrapper.getUsuario().getFecha_nac());
    	        model.addAttribute("usuario.run", usuariowrapper.getUsuario().getRun());
    	        
    	        /* Se inicia cadena de ifs para determinar el tipo de 
    	         * usuario que se está creando */
    	        if (tipo.equals("cliente")) {
    	        	
    	        	/* Se asigna via setter el tipo de usuario 
    	        	(Ya que el boton radio regresa un valor en String no puede asignarse directamente) */
    	        	usuariowrapper.getUsuario().setTipousuario(1);
    	        	// Se agrega el tipo de usuario al modelo para luego pasar al Service
    	        	model.addAttribute("usuario.tipousuario", usuariowrapper.getUsuario().getTipousuario());
    	        	
    				/* Se toma el resto de los atributos del formulario */
        	        model.addAttribute("cliente.apellido", usuariowrapper.getCliente().getApellido());
        	        model.addAttribute("cliente.tlf", usuariowrapper.getCliente().getTlf());
        	        model.addAttribute("cliente.AFP", usuariowrapper.getCliente().getAFP());
        	        model.addAttribute("cliente.salud", usuariowrapper.getCliente().getSalud());
        	        model.addAttribute("cliente.direccion", usuariowrapper.getCliente().getDireccion());
        	        model.addAttribute("cliente.comuna", usuariowrapper.getCliente().getComuna());
        	        model.addAttribute("cliente.edad", usuariowrapper.getCliente().getEdad());
        	        
        	        // Se inicializa servicio para crear nuevo usuario
        	        us.create(usuariowrapper.getUsuario(), usuariowrapper.getCliente(), 1);
        	 
        	     /* Debug
        	        System.out.println("**DEBUG**: " + usuariowrapper.getUsuario().toString() + usuariowrapper.getCliente().toString());
        	        */
        	        
				} else if (tipo.equals("administrativo")) {
    	        	/* Se asigna via setter el tipo de usuario 
    	        	(Ya que el boton radio regresa un valor en String no puede asignarse directamente) */
    	        	usuariowrapper.getUsuario().setTipousuario(2);
    	        	
    	        	// Se agrega el tipo de usuario al modelo para luego pasar al Service
    	        	model.addAttribute("usuario.tipousuario", usuariowrapper.getUsuario().getTipousuario());
    	        	
    	        	/* Se toma el resto de los atributos del formulario */
	    	        model.addAttribute("administrativo.area", usuariowrapper.getAdministrativo().getArea());
	    	        model.addAttribute("administrativo.exp", usuariowrapper.getAdministrativo().getExp());
	    	        
	    	        // Se inicializa servicio para crear nuevo usuario
	    	        us.create(usuariowrapper.getUsuario(), usuariowrapper.getAdministrativo(), 2);
	    	        
	    	     /* Debug
	    	        System.out.println("**DEBUG**: " + usuariowrapper.getUsuario().toString() + usuariowrapper.getAdministrativo().toString() );
	    	        */
	    	        
				} else if (tipo.equals("profesional")) {
    	        	/* Se asigna via setter el tipo de usuario 
    	        	(Ya que el boton radio regresa un valor en String no puede asignarse directamente) */
    	        	usuariowrapper.getUsuario().setTipousuario(3);
    	        	
    	        	// Se agrega el tipo de usuario al modelo para luego pasar al Service
    	        	model.addAttribute("usuario.tipousuario", usuariowrapper.getUsuario().getTipousuario());
					
    	        	/* Se toma el resto de los atributos del formulario */
	    	        model.addAttribute("profesional.titulo", usuariowrapper.getProfesional().getTitulo());
	    	        model.addAttribute("profesional.ingreso", usuariowrapper.getProfesional().getIngreso());
	    	        
	    	        // Se inicializa servicio para crear nuevo usuario
	    	        us.create(usuariowrapper.getUsuario(), usuariowrapper.getProfesional(), 3);
	    	        
	    	     /* Debug
	    	        System.out.println("**DEBUG**: " + usuariowrapper.getUsuario().toString() + usuariowrapper.getProfesional().toString());
	    	       */ 
				}
    	        
    	        return new ModelAndView("redirect:/listarusuario");
    	    } 

}
