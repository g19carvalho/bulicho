package br.edu.iffarroupilha.bulicho.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * <p>
 * Classe principal do projeto, contempla tela inicial
 * <p>
 * @author Usuario
 *
 */

public class Bulicho extends JFrame{
	
	public Bulicho() {
		setTitle(":: Bulicho ::");
		setSize(640, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes();
		//muda a aparencia da aplicação java
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setVisible(true);
	
	}
	
	private void desenhaComponentes() {
		//cria a barra dos menus
		JMenuBar menu = new JMenuBar();
		
		//cria o menu cadastros
		JMenu cadastro = new JMenu("Cadastro");
		menu.add(cadastro);
		
		//cria subitens
		JMenuItem cliente = new JMenuItem("Clientes");
		JMenuItem produto = new JMenuItem("Produtos");
		JMenuItem venda = new JMenuItem("Vendas");
		
		//vincula ao menu cadastros
		cadastro.add(cliente);
		cadastro.add(produto);
		cadastro.add(venda);
		
		//vincula as ações aos itens
		cliente.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(Bulicho.this, "Clicou");
			}
		});
		
		produto.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(Bulicho.this, "Clicou");
			}
		});
	
		venda.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(Bulicho.this, "Clicou");
			}
		});
		
		//adiciona menu em tela
		setJMenuBar(menu);
		
	}

	public static void main(String[] args) {
		new Bulicho();
	}

}
