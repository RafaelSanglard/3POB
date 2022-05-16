package academico;
import java.util.*;

public class Main
{

		public static void main(String[] args) 
		{

			Scanner entrada = new Scanner(System.in);
			// TODO Auto-generated method stub
			
			
			
			ArrayList<Aluno> list = new ArrayList<>();
			
			
			int i=0, j=0;
			int opt;
			
			do{
				
				opt=menu();
				
				switch(opt)
				{
				  		
				
						case 0:
							System.out.println("\n Encerrando");
							break;
							
						case 1:
							Aluno aluno = new Aluno(i, "Jose da Silva", "2022123456");
							list.add(aluno);
							i++;
							break;
							
						case 2:
							System.out.println(list);
							exibe(list);
							break;
							
						case 3:
							System.out.println("\n Digite o indice a ser alterado");
							j=entrada.nextInt();
							Aluno aluno2 = new Aluno(i, "novo nome", "2021473456");
							list.set(j,aluno2);
							break;
							
						case 4:
							System.out.println("\n Digite o indice a ser removido");
							j=entrada.nextInt();
							list.remove(j);
							break;
				
				}
			
			
		
		}while(opt!=0);
		entrada.close();	
	}



		public static int menu()
		{
			
			Scanner entrada = new Scanner(System.in);
			int opt;
			System.out.println("\n Informe a operação:"
					+ "\n 1 - Inserir aluno"
					+ "\n 2 - Exibir Lista de alunos"
					+ "\n 3 - Alterar aluno"
					+ "\n 4 - Deletar aluno"
					+ "\n 0 - Fechar menu"
					+ "\n Sua opção: ");
			opt=entrada.nextInt();
			System.out.println("\n ");
			
			
			return opt;

		}
		
		public static void exibe(ArrayList<Aluno> aluno)
		{
			
			int i;			
			for(i=0;i<aluno.size();i++) 
			{
				Aluno alunoAux = ((Aluno) aluno.get(i));
				System.out.print("Id:"+alunoAux.getId());
				System.out.print(" - Matricula: "+alunoAux.getMatricula());
				System.out.print(" - Nome: "+alunoAux.getNome());
				System.out.println("\n ");
				
			}
			
		}
		
		

}

