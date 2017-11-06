package br.com.pos.FindPetWalker.model.DAO;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.pos.FindPetWalker.model.entity.UsuarioPetWalker;
import br.com.pos.FindPetWalker.utils.Conexao;


public class UsuarioPetWalkerDao {
	
	Conexao conexao = new Conexao();
	
	public UsuarioPetWalker validarUsuario(String login, String senha) {
		UsuarioPetWalker usuario = null;
		
		EntityManager em = conexao.getConexao();
		
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.usuario = :usuarioRecebido and u.senha = :senhaRecebida");
		query.setParameter("usuarioRecebido", login);
		query.setParameter("senhaRecebida", senha);
		
		try {
			usuario = (UsuarioPetWalker) query.getSingleResult();
		}catch(NoResultException e) {
			usuario = null;
		}
		
		em.getTransaction().commit();
		return usuario;
		}
	
	public UsuarioPetWalker cadastrarNovoUsuario(UsuarioPetWalker novoUsuario){

		EntityManager em = conexao.getConexao();

		em.getTransaction().begin();    

		em.persist(novoUsuario);

		em.getTransaction().commit();

		return novoUsuario;
	}
	
	public String validarUsuario(UsuarioPetWalker novoUsuario) {
		EntityManager em = conexao.getConexao();
		String usuario= null;
		
		em.getTransaction().begin();    
	    
		Query query = em.createQuery("SELECT u.usuario FROM Usuario u WHERE u.usuario = :usuario");
		query.setParameter("usuario", novoUsuario.getUsuario()); 
		
		try{
		  usuario = (String) query.getSingleResult();
		}catch (NoResultException e) {
		  usuario = null;
		}
				
		em.getTransaction().commit();
		
		return usuario;
		
	}
	
	public UsuarioPetWalker salvarUsuario(UsuarioPetWalker usuario){
		
		EntityManager em = conexao.getConexao();

		em.getTransaction().begin();    
	    
		em.merge(usuario);
				
		em.getTransaction().commit();
		
		return usuario;
	}
}
