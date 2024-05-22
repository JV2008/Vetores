package vetores;

import java.util.ArrayList;
import java.util.Arrays;

public class ExemploArray {

	public static void main(String[] args) {
		String[] diciplinas = {"matemática","filosofia","história","física"}; 
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(diciplinas));

		novaLista.add("geografia");
		novaLista.add("lingua inglesa");

		for (String i: novaLista)
		{
			System.out.println("diciplina:" +i);	
		}




	}

}
