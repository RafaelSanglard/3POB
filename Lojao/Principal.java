package Lojao;
import java.util.*;
public class Principal 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
//		System.out.println("Digite o nome do cliente: ");
//		String nome = entrada.nextLine();
//		
//		System.out.println("Digite o cep: ");
//		String cep = entrada.nextLine();
//		
//		System.out.println("Digite o id: ");
//		int id= entrada.nextInt();
//		
//		Cliente cliente = new Cliente(cep, nome, id);
//		
//		System.out.print("\n \n cliente: "+cliente.getNome());
//		System.out.print(" - cep: "+cliente.getCep());
//		System.out.print(" - id: "+cliente.getId());

		
		
		System.out.println("Digite o nome do produto: ");
		String nomeprod = entrada.nextLine();
		
		System.out.println("Digite o id do produto: ");
		int idprod = entrada.nextInt();
				
		System.out.println("Digite a descrição do produto: ");
		String desc = entrada.nextLine();
		entrada.nextLine();
		
		System.out.println("Digite o valor do produto: ");
		double valor = entrada.nextDouble();
		
		Produto produto = new Produto(nomeprod,idprod,valor);
		produto.exibeprod();
		
		entrada.close();
		
	}

}
