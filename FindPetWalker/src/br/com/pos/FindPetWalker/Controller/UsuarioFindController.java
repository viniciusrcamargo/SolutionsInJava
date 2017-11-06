package br.com.pos.FindPetWalker.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pos.FindPetWalker.model.DAO.UsuarioPetWalkerDao;
import br.com.pos.FindPetWalker.model.entity.UsuarioPetWalker;



@ManagedBean
@SessionScoped 
public class UsuarioFindController {

	UsuarioPetWalkerDao usuarioDao = new UsuarioPetWalkerDao();
	
	private String  login;
	private String  senha;
	
	private UsuarioPetWalker usuario=null;
	private boolean logado;
	
	private UsuarioPetWalker novoUsuario= new UsuarioPetWalker();
	
	public String entrar() {
    	
    	usuario = usuarioDao.validarUsuario(getLogin(), getSenha());
    	
    	if(usuario != null){
    		logado=true;
    		return "usuarioLogado/index.xhtml?faces-redirect=true";
    	}
    	FacesMessage msg = new FacesMessage("Usuario ou senha incorretos.!", "INFO MSG");
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return "";
    }

	public String sair() {
    	logado = false;
         
        FacesMessage msg = new FacesMessage("Sessão encerrada!", "INFO MSG");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
        return "index.xhtml?faces-redirect=true";
    }
	
	public void salvarUsuario(){
		   
	       usuarioDao.salvarUsuario(getUsuario());
	    	
		   FacesMessage msg = new FacesMessage("Dados atualizados com sucesso!", "INFO MSG");
	       msg.setSeverity(FacesMessage.SEVERITY_INFO);
	       FacesContext.getCurrentInstance().addMessage(null, msg);
	        
	   }
	
	 public String cadastrarNovoUsuario(){
	    	
	    	if(validarUsuario()){
		    	usuarioDao.cadastrarNovoUsuario(getNovoUsuario());
		    	setNovoUsuario(new UsuarioPetWalker());
		    	return "index.xhtml?faces-redirect=true";
	    	}
	    	else{
	    		return "";
	    	}
	    }
	 
	 public boolean validarUsuario(){

	    	String validacao; 
	    	validacao = usuarioDao.validarUsuario(getNovoUsuario());
	    	
	    	if(validacao!=null){
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


	public UsuarioPetWalker getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuarioPetWalker usuario) {
		this.usuario = usuario;
	}


	public boolean isLogado() {
		return logado;
	}


	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public UsuarioPetWalker getNovoUsuario() {
		return novoUsuario;
	}

	public void setNovoUsuario(UsuarioPetWalker novoUsuario) {
		this.novoUsuario = novoUsuario;
	}
	
}
