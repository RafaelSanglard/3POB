package loja;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);

		
		ArrayList<Produto> list = new ArrayList<>();
		
		
		
		String string;
		int i=0, j=0;
		int opt;
		Produto verifica = new Produto(null, 0);
		do{
			
			Menu menu = new Menu();
			
			opt=menu.exibe_menu();
			
			switch(opt)
			{
			  		
			
					case 0:
						System.out.println("\n Encerrando");
						break;
						
					case 1:
						verifica = insere(i);
						if(verifica == null)
						{	
							opt=0;
							break;
						}
						
						list.add(verifica);
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
						list.get(j).mostra_tudo();
				
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
						
					case 6:
						System.out.println("\n Digite o indice que deseja adicionar");
						j=entrada.nextInt();
						verifica = insere(i);
						if(verifica == null)
						{	
							opt=0;
							break;
						}
						
						list.add(j,verifica);
						i++;
						break;
					case 7:
						System.out.println("\n Digite o nome a ser procurado na lista: ");
						string = entrada.nextLine();
						encontraNome(list,string);
						break;
		
				}
		
		
	
		}while(opt!=0);
		entrada.close();
		System.out.println("\n Encerrando.");

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
	

	
	private static Produto insere(int i)
	{
		
		String nome;
		double preco;
		
	
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do produto ou 'fim' para fechar o programa: ");
		nome=entrada.nextLine();
		
		if(nome.equals("fim"))
		{
			return null;
			
		}
		
		System.out.println("Digite o preço: ");
		preco=entrada.nextDouble();
		entrada.nextLine();
		
		Produto produto=new Produto(nome,preco);
		
		
		return produto;
	}
	
	
	public static void encontraNome(ArrayList<Produto> produto, String nome)
	{
		int i;			
		for(i=0;i<produto.size();i++) 
		{
			Produto produtoAux = ((Produto) produto.get(i));
			if(produtoAux.getNome().equals(nome))
					{
						produtoAux.mostra_tudo();
						
					}
					
			
		}		
	}
	
	public static int encontraIndice(ArrayList<Produto> produto, String nome)
	{int ind;
		ind = produto.indexOf(nome);
		return ind;
	}
	
}