package br.com.aps.miniteste;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	
	private static ClienteDAO instance = null;

	private ClienteDAO(){
	}
	
	public static ClienteDAO getInstance(){
		if(instance == null){
			instance = new ClienteDAO();
		}
		return instance;
	}

	public List<Cliente> getLista() {
		
		// Simulando acesso a BD
		List<Cliente> lista= new ArrayList<Cliente>();
		
		Cliente c;
		
		c = new Cliente("Lucas","Rio Tinto");
		c.setAtivo(true);
		c.setDevedor(false);
		lista.add(c);
		
		c = new Cliente("Marcos","Rio Tinto");
		c.setAtivo(true);
		c.setDevedor(true);
		lista.add(c);
		
		c = new Cliente("João","Mamanguape");
		c.setAtivo(false);
		c.setDevedor(false);
		lista.add(c);
		
		c = new Cliente("Maria","Rio Tinto");
		c.setAtivo(false);
		c.setDevedor(false);
		lista.add(c);
		
		return lista;
	}
}
