package br.edu.iffarroupilha.bulicho.controle;

import br.edu.iffarroupilha.bulicho.modelo.Produto;

/**
*<p>
*Classe que concentra as logica ligadas para a entidade produto
*</p>
**/
public class ProdutoControle extends AControle{
	/**
	 * <p>
	 * Valida se os dados do produto estão corretos
	 * </p>
	 * 
	 * */
	public String validarProduto(Produto prod){
		if(prod != null){
			if(prod.getPreco() == 0){
				return "Informe Preço!";
			}else if(prod.getDescricao() == null || prod.getDescricao().isEmpty()){
				return "Por favor, informe Descrição:";
			}
						
		}else{
			return "Dados do produto não informado";
		}
		
		return null;
	}
	


}