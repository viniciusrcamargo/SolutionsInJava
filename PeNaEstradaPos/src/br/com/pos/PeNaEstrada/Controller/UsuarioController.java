package br.com.pos.PeNaEstrada.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pos.PeNaEstrada.model.DAO.UsuarioDao;
import br.com.pos.PeNaEstrada.model.entity.Usuario;
import sun.security.action.GetLongAction;

@ManagedBean
@SessionScoped
public class UsuarioController {
	
	private UsuarioDao daoUsuario = new UsuarioDao();
	
	//página de login
	private String login;
	private String senha;
	
	//filtro login
	private Usuario usuario=null;
	private boolean logado;
	
	//Cadastro
	private Usuario novoUsuario = new Usuario();
	
	public String entrar() {
		usuario = daoUsuario.validarUsuario(getLogin(), getSenha());
		
		if(usuario != null) {
			logado = true;
			return "mochila/index.xhtml?faces-redirect-true";
		}
		FacesMessage msg = new FacesMessage("Usuario ou senha incorretos.|", "INFO MSG");
		msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return"";
	}
	
	
	public String cadastrarNovoUsuario() {
		if(validarUsuario()) {
			daoUsuario.cadastrarNovoUsuario(getNovoUsuario());
			setNovoUsuario(new Usuario());
			return "index.xhtml?faces-redirect-true";
		}else {
			return "";
		}
	}

	public boolean validarUsuario() {
		String validacao;
		validacao = daoUsuario.validarUsuario(getNovoUsuario());
		
		if(validacao!=null) {
			FacesMessage msg = new FacesMessage("Usuário não disponível", "");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return false;
		}
		return true;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public Usuario getNovoUsuario() {
		return novoUsuario;
	}

	public void setNovoUsuario(Usuario novoUsuario) {
		this.novoUsuario = novoUsuario;
	}

	public UsuarioDao getDaoUsuario() {
		return daoUsuario;
	}

	public void setDaoUsuario(UsuarioDao daoUsuario) {
		this.daoUsuario = daoUsuario;
	}
}
