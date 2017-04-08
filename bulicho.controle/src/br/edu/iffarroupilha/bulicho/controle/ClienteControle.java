package br.edu.iffarroupilha.bulicho.controle;

import br.edu.iffarroupilha.bulicho.modelo.Cliente;

/**
*<p>
*Classe de logica para a entidade cliente
*</p>
**/
public class ClienteControle extends AControle{
	/**
	 * <p>
	 * Valida se os dados do cliente estão corretos
	 * </p>
	 * 
	 * */
	public String validarCliente(Cliente cli){
		if(cli != null){
			if(cli.getCpf() == 0){
				return "Informe CPF!";
			}else if(cli.getNome() == null || cli.getNome().isEmpty()){
				return "Por favor, informe um nome:";
			}
						
		}else{
			return "Dados do cliente não informado";
		}
		
		return null;
	}
	


}