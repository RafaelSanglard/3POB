package testenum;

import java.time.LocalDate;

public class Dependente extends Pessoa 
{
	private TipoDependenteEnum tipo;
	public Dependente( String nome, LocalDate dataNascimento, TipoDependenteEnum tipo) 
	{
		super( nome, dataNascimento);
		this.tipo = tipo;
	}
	public TipoDependenteEnum getTipo() 
	{
		return tipo;
	}

}