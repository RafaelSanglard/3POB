package br.nom.belo.marcio.agendatel.modelo;

import java.io.Serializable;

public class Contato implements Serializable {
	private int id;


	private String nome;
    private String telefone;
    
    public Contato(String nome,String telefone) {
        setNome(nome);
        setTelefone(telefone);
    }
    
    public Contato() {
		// TODO Auto-generated constructor stub
	}
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
