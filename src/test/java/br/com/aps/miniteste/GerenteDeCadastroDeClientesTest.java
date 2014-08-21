package br.com.aps.miniteste;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.*;

public class GerenteDeCadastroDeClientesTest{
	private GerenteDeCadastroDeClientes gerente;
	private List<String> lista;
	
	@Before
	public void inicializa(){
    	gerente = new GerenteDeCadastroDeClientes();
    	gerente.cadastrarCliente("José", "Mamanguape");
    	lista = new ArrayList<String>();
	}
	
    @Test
    public void testaListaOrdenada(){
    	lista.addAll(gerente.getLista(TipoLista.ORDENADA));
    	assertEquals(lista.get(0), "José");
    	assertEquals(lista.get(1), "João");
    	assertEquals(lista.get(2), "Lucas");
    	assertEquals(lista.get(3), "Marcos");
    	assertEquals(lista.get(4), "Maria");
    }
    
    @Test
    public void testaListaDosAtivos(){
    	lista.addAll(gerente.getLista(TipoLista.ATIVOS));
    	assertEquals(lista.get(0), "Lucas");
    	assertEquals(lista.get(1), "Marcos");
    }
    
    @Test
    public void testaListaDosInativos(){
    	lista.addAll(gerente.getLista(TipoLista.INATIVOS));
    	assertEquals(lista.get(0), "João");
    	assertEquals(lista.get(1), "Maria");
    	assertEquals(lista.get(2), "José");
    }
    
    @Test
    public void testaListaDosDevedores(){
    	lista.addAll(gerente.getLista(TipoLista.DEVEDORES));
    	assertEquals(lista.get(0), "Marcos");
    }
}
