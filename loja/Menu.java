package loja;
import java.util.Scanner;
public class Menu 
{
	public int exibe_menu()
	{
		Scanner entrada = new Scanner(System.in);
		int opt;
		
		
		System.out.println("\n Informe a operação:"
				+ "			\n 1 - Inserir produto"
				+ "			\n 2 - Exibir lista de produtos"
				+ "			\n 3 - Exibir um produto"
				+ "			\n 4 - Alterar produto"
				+ "			\n 5 - Deletar produto"
				+ "			\n 0 - Fechar menu"
				+ "			\n Sua opção: ");
		
		opt=entrada.nextInt();
		System.out.println("\n ");
		
		
	if(opt<0||opt>6)
	{
		System.out.println("entrada invalida, encerrando operações.");
		opt=0;
	}
		return opt;

	}
	
	

}
