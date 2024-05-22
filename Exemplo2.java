package vetores;

public class Exemplo2 {

	public static void main(String[] args) {
	
		String[] names = new String [3];
		names[0] = "LISA";
		names[1] = "KEVIN";
		names[2] = "ROGER";

		for (String name : names) {
			System.out.print(name + ", " );
		}
	}

}
