package br.nom.belo.marcio.agendatel.factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import br.nom.belo.marcio.agendatel.modelo.Contato;

public class ContatoDAO 
{
//	Create,Read, Update, Delete 
	//passa uma instancia de contato
	public void save(Contato contato)
	{
		String sql = "INSERT INTO contatos(nome,telefone) VALUES(?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try 
		{
			//cria a conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			//preparedStatement criada para executar a query
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getTelefone());
			//executar a query
			pstm.execute();
			System.out.println("Contato salvo com sucesso");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				//fechando as conexões
				if(pstm!=null) 
				{
					pstm.close();
				}
				
				if(conn!=null) 
				{
					conn.close();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public List<Contato> getContatos()
	{
		String sql = "SELECT * FROM  contatos ";
		List<Contato> contatos = new ArrayList<Contato>();
		Connection conn= null;
		PreparedStatement pstm = null;
		//Classe que vai recurerar os dados do banco
		ResultSet rset = null;
		
		try 
		{
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			
			while (rset.next()) 
			{
				Contato contato = new Contato();
				//recupera o id
				contato.setId(rset.getInt("id"));
				//nome
				contato.setNome(rset.getString("nome"));
				//telefone
				contato.setTelefone(rset.getString("telefone"));
				
				contatos.add(contato);
			}
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				if(rset!=null)
				{
					rset.close();
				}
				if(pstm!=null)
				{
					pstm.close();
				}
				if(conn!=null)
				{
					conn.close();
				}
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		return contatos;
	}
	
	public void update(Contato contato)
	{
		String sql = "Update contatos Set nome = ?"+
					 "WHERE telefone = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try 
		{
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			//Adicionar os valores para atualizar
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getTelefone());
			
			//o nome do registro a ser atualizado
			//pstm.setInt(3, contato.getId());
			
			// executar query 
			pstm.execute();
			System.out.println("Alterado com sucesso");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				if(pstm!=null) 
				{
					pstm.close();
				}
				if(conn!= null)
				{
					conn.close();
				}
			}catch(Exception e) 
			{
				e.printStackTrace();
				
			}
		}
		
	}
	
	public void deletebynumber(String numero)
	{
		String sql = "DELETE FROM contatos "+
					 "WHERE telefone = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try 
		{
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			//Adicionar os valores para atualizar
			pstm.setString(1, numero);
			
			//o nome do registro a ser atualizado
			//pstm.setInt(3, contato.getId());
			
			// executar query 
			pstm.execute();
			System.out.println("Deletado com sucesso");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				if(pstm!=null) 
				{
					pstm.close();
				}
				if(conn!= null)
				{
					conn.close();
				}
			}catch(Exception e) 
			{
				e.printStackTrace();
				
			}
		}
	}
}
