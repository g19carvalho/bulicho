package br.edu.iffarroupilha.bolicho.visao.web;

import java.util.List;


import br.com.caelum.vraptor.Resource;

@Resource
public class ClienteControle {
	
	private ClienteControle controle;
	
	public ClienteContole(ClienteControle controle, Result result){
		this.controle = controle;
		this.result = result;
		
	}
	
	public void listar(){
		List itens = controle.buscarTodos(Cliente.class);
		result.include("clientes", itens);
	}
	
	public void gravar(){
		ClienteControle controle = new ClienteControle();
		
		//objeto temporario
		Cliente c = new Cliente();
		c.setNome("Jose");
		c.setCpf(123);
		
		controle.gravar(c);
		
	}

}
