package Lojao;

public class Produto 
{
	private String nome;
	private int idproduto;
	private String descricao;
	private double valorun;
	
	
	public Produto(int idproduto, double valorun) {
		super();
		this.idproduto = idproduto;
		this.valorun = valorun;
	}
	public Produto(String nome, int idproduto, String descricao, double valorun) {
		super();
		this.nome = nome;
		this.idproduto = idproduto;
		this.descricao = descricao;
		this.valorun = valorun;
	}
	public Produto(String nome, int idproduto, double valorun) {
		super();
		this.nome = nome;
		this.idproduto = idproduto;
		this.valorun = valorun;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorun() {
		return valorun;
	}
	public void setValorun(double valorun) {
		this.valorun = valorun;
	}
	
	public void exibeprod()
	{
		System.out.print("\n \n Id produto: "+getIdproduto());
		System.out.print(" - nome: "+getNome());
		System.out.print(" - valor unitário: "+getValorun());
		System.out.print(" - descrição: "+getDescricao());
		
	}

}
