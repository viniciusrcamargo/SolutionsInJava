package br.com.pos.PeNa.Estrada.Filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pos.PeNaEstrada.Controller.UsuarioController;



public class LoginFilter implements Filter{

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		UsuarioController usuarioController = (UsuarioController)((HttpServletRequest)request).getSession().getAttribute("usuarioController");
		
		
		if(usuarioController == null || !usuarioController.isLogado()) {
			String contextPath = ((HttpServletRequest)request).getContextPath();
		((HttpServletResponse)response).sendRedirect(contextPath + "/paginas/index.xhtml");
		}
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
