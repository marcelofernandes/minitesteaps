package br.com.aps.miniteste;

import java.util.ArrayList;
import java.util.List;

public class ListaAtivos implements Lista {

	public List<String> getLista(List<Cliente> clientes) {
		List <String> lista = new ArrayList<String>();
		for(Cliente c: clientes){
			if(c.isAtivo()){
				lista.add(c.getNome());
			}
		}
		return lista;
	}

}
