package br.com.pos.PeNaEstrada.model.DAO;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.pos.PeNaEstrada.model.entity.Usuario;
import br.com.pos.PeNaEstrada.utils.*;

public class UsuarioDao {

	Conexao conexao = new Conexao();
	
	public Usuario validarUsuario(String login, String senha) {
	Usuario usuario = null;
	
	EntityManager em = conexao.getConexao();
	
	
	em.getTransaction().begin();
	
	Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.usuario = :usuarioRecebido and u.senha = :senhaRecebida");
	query.setParameter("usuarioRecebido", login);
	query.setParameter("senhaRecebida", senha);
	
	try {
		usuario = (Usuario) query.getSingleResult();
	}catch(NoResultException e) {
		usuario = null;
	}
	
	em.getTransaction().commit();
	return usuario;
	}
	
	public Usuario cadastrarNovoUsuario(Usuario novoUsuario) {
		
		EntityManager em = conexao.getConexao();
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		return novoUsuario;
	}
	
	public String validarUsuario(Usuario novoUsuario) {
		EntityManager em = conexao.getConexao();
		String usuario = null;
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("SELECT u.usuario FROM Usuario u WHERE u.usuario = :usuario");
		query.setParameter("usuario", novoUsuario.getUsuario());
		
		try {
			usuario =(String) query.getSingleResult();
		}catch(NoResultException e){
			usuario = null;
		}
		
		em.getTransaction().commit();
		em.close();
		return usuario;
	}
	
	
}
