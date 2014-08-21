package br.com.aps.miniteste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada implements Lista {

	public List<String> getLista(List<Cliente> clientes) {
		
		
		List <String> lista = new ArrayList<String>();
		for(Cliente c: clientes){
				lista.add(c.getNome());
		}
		Collections.sort(lista);
		return lista;
	}

}
