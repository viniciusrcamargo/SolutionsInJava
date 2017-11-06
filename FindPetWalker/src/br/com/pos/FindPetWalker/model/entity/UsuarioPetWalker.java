package br.com.pos.FindPetWalker.model.entity;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "usuario", schema="findpetwalker")
public class UsuarioPetWalker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Usuario;
	private String nome;
	private String usuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_Cadastro;
	private String sexo;
	private String endereco;
	private String celular;
	
	public Integer getId_Usuario() {
		return id_Usuario;
	}
	public void setId_Usuario(Integer id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_Cadastro() {
		return data_Cadastro;
	}
	public void setData_Cadastro(Date data_Cadastro) {
		this.data_Cadastro = data_Cadastro;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
}
