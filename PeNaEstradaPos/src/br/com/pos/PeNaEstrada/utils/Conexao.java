package br.com.pos.PeNaEstrada.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	//classe para criar conexão com banco de dados
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("peNaEstrada");
	
	
	public EntityManager getConexao() {
		return factory.createEntityManager();
	}
}
