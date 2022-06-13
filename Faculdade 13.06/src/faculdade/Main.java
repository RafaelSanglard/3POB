package faculdade;

import java.util.ArrayList;
import java.util.List;

public class Main 
{

	public static void main(String[] args) 
	{
		List<String> lst = new ArrayList<String>();
		lst.add("joão");
		lst.add("Maria");
		lst.add("José");
		lst.add("Mariana");
		lst.add("Joana");
		lst.add("Mario");
		lst.add("josefa");
		
		for(String nome:lst) 
		{
			System.out.println("Aluno:" + nome);
		}
		
		List<Aluno> lst2 = new ArrayList<Aluno>();
		
		
		Aluno aluno = new Aluno(1,"João","12345");
		lst2.add(aluno);
		aluno = new Aluno( 2, "Maria","54321");
		lst2.add(aluno);
		Aluno aluno2 = new Aluno(1,"João","33333");
		lst2.add(aluno2);
			
		for(Aluno lstAluno:lst2) 
		{
			//lstAluno
			System.out.println("Id: "+lstAluno.getId()+" Nome:"+lstAluno.getNome()+" Matricula:"+lstAluno.getMatricula());;
		}
		
		List<String> lst3 = lst.stream().filter(x -> x.charAt(0) == 'j').toList();
		
		for(String nome:lst3) 
		{
			System.out.println("Aluno:" + nome);
		}
	}

}
