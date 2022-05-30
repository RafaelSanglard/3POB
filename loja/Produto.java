package loja;

public class Produto 
{
	int id;
	int codbarras;
	String sku;
	String nome;
	String desc;
	String categoria;
	double preco;
	double peso;
	String fabricante;
	
	
	public Produto(int id, int codbarras, String sku, String nome, String categoria, double preco, double peso,
			String fabricante) 
	{

		this.id = id;
		this.codbarras = codbarras;
		this.sku = sku;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	public Produto(int id, int codbarras, String sku, String nome, String desc, String categoria, double preco,
			double peso, String fabricante) 
	{

		this.id = id;
		this.codbarras = codbarras;
		this.sku = sku;
		this.nome = nome;
		this.desc = desc;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getCodbarras() 
	{
		return codbarras;
	}
	
	public void setCodbarras(int codbarras) 
	{
		this.codbarras = codbarras;
	}
	
	public String getSku() 
	{
		return sku;
	}
	
	public void setSku(String sku) 
	{
		this.sku = sku;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getDesc() 
	{
		return desc;
	}
	
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}
	
	public String getCategoria() 
	{
		return categoria;
	}
	
	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}
	
	public double getPreco() 
	{
		return preco;
	}
	
	public void setPreco(double preco) 
	{
		this.preco = preco;
	}
	
	public double getPeso() 
	{
		return peso;
	}
	
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	
	public String getFabricante() 
	{
		return fabricante;
	}
	
	public void setFabricante(String fabricante) 
	{
		this.fabricante = fabricante;
	}
	
	
	public void mostra_tudo() 
	{
		System.out.print("Id:"+getId());
		System.out.print(" - CodBarras: "+getCodbarras());
		System.out.print(" - Nome: "+getNome());
		System.out.print(" - SKU: "+getSku());
		System.out.print(" - Descrição: "+getDesc());
		System.out.print(" - Categoria: "+getCategoria());
		System.out.print(" - Preço: "+getPreco());
		System.out.print(" - Peso: "+getPeso());
		System.out.print(" - Fabricante: "+getFabricante());
		System.out.println("\n ");
		
	}
	

}
