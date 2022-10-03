package serial;
import java.io.*;
public class SerializaGato 
{
	public static void main(String[] args) throws Exception 
	{
	Cor cor=new Cor(255,255,255);
	Coleira coleira=new Coleira(5,cor);
	Gato g1=new Gato("Timão",8,2.3,coleira);
	System.out.println("Original:"+g1);
/* Serializa */
	FileOutputStream fos=new FileOutputStream("gato.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(g1);
	System.out.println("serializado:"+oos);

/* Deserializa */
	FileInputStream fis=new FileInputStream("gato.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Gato g2=(Gato) ois.readObject();
	System.out.println("Recriado:"+g2);
	}
}