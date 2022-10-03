package serial;
import java.io.Serializable;

class Cor implements Serializable 
{
	private int verde,vermelho,azul;
	Cor(int vd,int vm, int az) { verde=vd;vermelho=vm;azul=az; }
	public String toString() { return
	verde+"-"+vermelho+"-"+azul; }
}

