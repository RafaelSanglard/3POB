package loja;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);

		
		ArrayList<Produto> list = new ArrayList<>();
		
		
		
		
		int i=0, j=0;
		int opt;
		
		do{
			
			Menu menu = new Menu();
			
			opt=menu.exibe_menu();
			
			switch(opt)
			{
			  		
			
					case 0:
						System.out.println("\n Encerrando");
						break;
						
					case 1:
						list.add(insere(i));
						i++;
						break;
						
					case 2:
						System.out.println("\n Exibindo a lista inteira");
						System.out.println(list);
						exibe(list);
						break;
						
					case 3:
						System.out.println("\n Digite o indice a ser exibido");
						j=entrada.nextInt();
						exibeunidade(list,j);
						break;
						
					case 4:
						System.out.println("\n Digite o indice a ser alterado");
						j=entrada.nextInt();
						list.set(j,insere(i));
						break;
						
					case 5:
						System.out.println("\n Digite o indice a ser removido");
						j=entrada.nextInt();
						list.remove(j);
						break;
			
			}
		
		
	
		}while(opt!=0);
		entrada.close();

	}
	
	private static void exibe(ArrayList<Produto> produto)
	{
		
		int i;			
		for(i=0;i<produto.size();i++) 
		{
			Produto produtoAux = ((Produto) produto.get(i));
			produtoAux.mostra_tudo();
			
		}
	}
	
	private static void exibeunidade(ArrayList<Produto> produto, int indice)
	{
		
		int i;			
		for(i=0;i<produto.size();i++) 
		{	
			Produto produtoAux = ((Produto) produto.get(i));
				
			if(produtoAux.getId()==indice) 
			{
				produtoAux.mostra_tudo();
			}
		}

	}
	
	private static Produto insere(int i)
	{
		int codbarras;
		String sku;
		String nome;
		String desc;
		String categoria;
		double preco;
		double peso;
		String fabricante;
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o codigo de barras: ");
		codbarras=entrada.nextInt();
		System.out.println("Digite o SKU: ");
		entrada.nextLine();
		sku=entrada.nextLine();
		System.out.println("Digite o nome do produto: ");
		nome=entrada.nextLine();
		System.out.println("Descrição do produto: ");
		desc=entrada.nextLine();
		System.out.println("Digite a categoria: ");
		categoria=entrada.nextLine();
		System.out.println("Digite o preço: ");
		preco=entrada.nextDouble();
		System.out.println("Digite o peso: ");
		peso=entrada.nextDouble();
		System.out.println("Digite o nome do fabricante: ");
		entrada.nextLine();
		fabricante=entrada.nextLine();
		
		Produto produto=new Produto(i,codbarras,sku,nome,desc,categoria,preco,peso,fabricante);
		
		
		return produto;
	}
	
}
