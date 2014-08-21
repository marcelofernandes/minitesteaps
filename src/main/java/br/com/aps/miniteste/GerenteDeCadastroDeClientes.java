package br.com.aps.miniteste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GerenteDeCadastroDeClientes{
	private List<Cliente> clientes;
	private HashMap <TipoLista, Lista> tipos;
	
	public GerenteDeCadastroDeClientes(){
		clientes = new ArrayList <Cliente>();
		tipos = new HashMap <TipoLista, Lista>();
		addTipo(TipoLista.ATIVOS, new ListaAtivos());
		addTipo(TipoLista.DEVEDORES, new ListaDevedores());
		addTipo(TipoLista.INATIVOS, new ListaInativos());
		addTipo(TipoLista.ORDENADA, new ListaOrdenada());
		clientes.addAll(ClienteDAO.getInstance().getLista());
	}
	
	private void addTipo(TipoLista tipo, Lista lista){
		tipos.put(tipo, lista);
	}
 
	public void cadastrarCliente(String nome, String cidade){
		Cliente c = new Cliente(nome, cidade);
		clientes .add(c);
	}
	
	public List<String> getLista(TipoLista tipo){
		return tipos.get(tipo).getLista(clientes);
	}
}
