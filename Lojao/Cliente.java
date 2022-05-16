package Lojao;

public class Cliente {
	private int id;
	private String nome;
	private String cep;
	public Cliente()
	{
		
	}
	
	public Cliente(String nome, int id)
	{
		this.id=id;
		this.nome=nome;
		
	}
	
	public Cliente(String cep, String nome, int id)
	{
		this.id=id;
		this.nome=nome;
		this.cep=cep;
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
		this.nome = nome;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	} 
	public void exibeprod()
	{
		System.out.print("\n \n Id Aluno: "+getId());
		System.out.print(" - nome: "+getNome());
		System.out.print(" - cep: "+getCep());
		
	}

}
