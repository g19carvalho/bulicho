package br.edu.iffarroupilha.bolicho.visao.web;

import java.util.List;
import br.edu.iffarroupilha.bulicho.controle.*;
import br.edu.iffarroupilha.bulicho.modelo.*;
import br.com.caelum.vraptor.Result;


import br.com.caelum.vraptor.Resource;

@Resource
public class ClienteController {
	
	private ClienteControle controle;
	private Result result;
	
	public ClienteController(ClienteControle controle, Result result){
		this.controle = controle;
		this.result = result;
		
	}
	
	public void listar(){
		List itens = controle.buscarTodos(Cliente.class);
		result.include("clientes", itens);
	}
	
	//carrega a visao para adicionar item
	public void cadastrar(){
		
		
	}
	
	public void gravar(Cliente cliente){
				
		controle.gravar(cliente);
		
	}

}
