package cl.awakelab.asesorias.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/* Controlador para acceder al panel de login. 
 * Se mapea también logout y página de error */
@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView mostrarLogin() {
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView errorLogin() {
		
		return new ModelAndView("login", "error", "true");
	}
	
	@RequestMapping(value = "/logout")
	public ModelAndView logout() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if (auth != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		
		return new ModelAndView("redirect:/inicio?logout");
	}

}
