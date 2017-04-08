package br.edu.iffarroupilha.bulicho.modelo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffarroupilha.bulicho.modelo.Cliente;
import br.edu.iffarroupilha.bulicho.modelo.Produto;

public class HibernateDAO {
	
	private static SessionFactory fabrica;
	
	static{
		Configuration cfg = new Configuration();
		//depois adicionar as demais entidades apos ter feito o mapeamento
		cfg.addAnnotatedClass(Cliente.class);
		cfg.configure();
		
		cfg.addAnnotatedClass(Produto.class);
		cfg.configure();
		
		//forma mais facil de criar uma fabrica
		fabrica = cfg.buildSessionFactory();
	}
	
	public static Session getSessao(){
		return fabrica.openSession();
	}

}
