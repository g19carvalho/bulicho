package br.edu.iffarroupilha.bulicho.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.iffarroupilha.bulicho.controle.ClienteControle;
import br.edu.iffarroupilha.bulicho.controle.ProdutoControle;
import br.edu.iffarroupilha.bulicho.modelo.Cliente;
import br.edu.iffarroupilha.bulicho.modelo.Produto;


/**
 * <p>
 * classe que representa a interface para produto.
 * </p>
 * @author Joseane Carvalho
 *
 */
public class FrmProduto  extends JFrame {

	public FrmProduto(Bolicho principal) {
		setTitle("Bolicho -> Produto");
		setSize(320,240);
		setLocationRelativeTo(principal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		// cria os componentes para a tela
		JLabel jblDescricao = new JLabel("Descricao:");
		JLabel jblPreco = new JLabel("Pre�o:");
		JTextField jtfDescricao = new JTextField(30);
		JTextField jtfPreco = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
			
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btnGravar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				ProdutoControle controle = new ProdutoControle();
				//pegar os dados da tela
				Produto p = new Produto();
				p.setDescricao(jtfDescricao.getText());
				//converte para um valor float
				float valor = controle.converteFlutuante(jtfPreco.getText());
				
				p.setPreco(valor);
				
				//valida os dados
				String erro = controle.validarProduto(p);
				if(erro == null){
					//nenhum erro criado
							
					//realiza a grava�ao
					controle.gravar(p);
					JOptionPane.showMessageDialog(null, "Gravado!");

				}else{
					JOptionPane.showMessageDialog(null, erro, "Valida��o", JOptionPane.WARNING_MESSAGE);

				}
			}
		});

		
		// adiciona em tela
		add(jblDescricao);
		add(jtfDescricao);
		add(jblPreco);
		add(jtfPreco);
		add(btnGravar);
		
	}
}