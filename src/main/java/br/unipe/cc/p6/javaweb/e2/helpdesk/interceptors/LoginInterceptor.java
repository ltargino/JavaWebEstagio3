package br.unipe.cc.p6.javaweb.e2.helpdesk.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
	@Override 
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller) throws Exception {
		
       //HttpSession session = request.getSession();
		//String url = request.getRequestURI(); 
		//Usuario usuario = (Usuario)session.getAttribute("usuario_autenticado");
       
		//if (url.equals("/HelpDesk/")) return true;
       
		//if (usuario != null) { 
    	  
		//if (usuario instanceof UsuarioAdm) return true;
	        
		//if (usuario instanceof UsuarioCliente) {
		//if (url.contains("/HelpDesk/ticket"))
		//return true;
		//}
	        
		//if (usuario instanceof UsuarioTecnico) {
		//if (url.contains("/HelpDesk/ticket") ||
		//url.contains("/HelpDesk/departamento"))
		//return true;
		//}		       
    	   
		//}
       
       response.sendRedirect("/");

       return false;
	} 
}
