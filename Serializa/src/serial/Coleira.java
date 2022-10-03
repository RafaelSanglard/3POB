package serial;
import java.io.Serializable;

class Coleira implements Serializable 
{
	private int tamanho; private Cor cor;
	Coleira(int t,Cor c) { tamanho=t; cor=c; }
	public String toString() { return tamanho + "-" + cor; }
}