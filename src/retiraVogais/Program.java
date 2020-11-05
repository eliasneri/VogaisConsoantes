package retiraVogais;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();
		int co=0, vo=0;

		String novo="", novo2="", pos="";
		
		for (int i=0; i<frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i)=='e' || frase.charAt(i)	== 'i' || frase.charAt(i)	== 'o' || frase.charAt(i)	== 'u' ) {
				novo = novo + frase.charAt(i);
				vo++;
				pos = pos + String.valueOf(i+1) + ",";
			} else {
				novo2 = novo2 + frase.charAt(i);
				co++;
			}
		}
		
		System.out.println("Vogais na frase: " + novo);
		System.out.println("Consoantes: " + novo2);
		System.out.println("Vogais: " + vo);
		System.out.println("Consoantes: " + co);
		System.out.println("Totais de Caracteres na frase: " + frase.length());
		System.out.println("Posições das vogais: " + pos);
		
		sc.close();

	}

}
