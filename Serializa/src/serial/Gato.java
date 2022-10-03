package serial;
import java.io.Serializable;

class Gato implements Serializable
{
	private int idade; private double peso; private String nome;
	private Coleira coleira;
	Gato(String n,int i,double p,Coleira c) {
	nome=n; idade=i; peso=p; coleira=c;
	}
	public String toString() {
	return nome + "-" + idade + "-" + peso + "-" + coleira;
	}
}
