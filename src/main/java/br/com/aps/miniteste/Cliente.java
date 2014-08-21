package br.com.aps.miniteste;

public class Cliente {

	private String nome;
	private String cidade;
	private boolean ativo;
	private boolean devedor;
	
	public Cliente(String nome, String cidade){
		this.nome = nome;
		this.cidade = cidade;
		this.ativo = false;
		this.devedor = false;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public boolean isDevedor() {
		return devedor;
	}
	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}
	
	
}
