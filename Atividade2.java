package vetores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int a[] = new int [1+2+3+4+5];
		int soma=0;


		Scanner ler = new Scanner (System.in);
		for (int i=0; i<5; i++){

			System.out.println("Informe um valor " + i+ ": ");
			a[i] = ler.nextInt();
		}
		for (int i =0; i<=5-1;i++) {

			soma=soma+a[i];


		}
		if (soma>=30) {
			System.out.println("total da soma é "+soma);
		}
		else {
			System.out.println("sua soma não atingiu o valor mínimo");
		}

		ler.close();
	}
}

