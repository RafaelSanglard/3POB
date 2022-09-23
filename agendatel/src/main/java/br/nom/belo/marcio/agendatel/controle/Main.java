package br.nom.belo.marcio.agendatel.controle;
import br.nom.belo.marcio.agendatel.factory.ConnectionFactory;
import br.nom.belo.marcio.agendatel.factory.ContatoDAO;
import br.nom.belo.marcio.agendatel.modelo.Contato;

import java.sql.Connection;

public class Main 
{
    public static void main(String args[]) throws Exception 
    {
    	 java.awt.EventQueue.invokeLater(new Runnable() {
    	        public void run() 
    	        {
    	               new AgendaControle();
    	        }
    	       });
    }
 
      	
}
    
    
/*	Incluir
  Contato contato = new Contato("GHI","789");
    	ContatoDAO contatoDao = new ContatoDAO();
    	contatoDao.save(contato);
 
 
 
  
 * Select *
  ContatoDAO contatoDao = new ContatoDAO();
    	for(Contato c:contatoDao.getContatos())
    	{
    		System.out.println("Contato: "+c.getNome());
    	}
 
 * 	Alterar
  		ContatoDAO contatoDao = new ContatoDAO();
    	Contato c1 = new Contato("ABC","123");
    	
    	
    	contatoDao.update(c1);
  
  
 * Delete
  		Contato c1 = new Contato();
    	c1.setTelefone("123");
    	
    	ContatoDAO contatoDao = new ContatoDAO();
    	contatoDao.deletebynumber(c1.getTelefone());
 * Testa conexão
      	ConnectionFactory nova = new ConnectionFactory();
    	nova.testaconn();
 * padrão
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() 
        {
               new AgendaControle();
           }
       });
    }
   */