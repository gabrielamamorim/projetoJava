package projetoJava;
import java.util.Scanner;
public class Array {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		String deseja, desejas;
		
		System.out.print("Informe quantas divisórias deseja para a caixa: ");
		int divcaixa = scanner.nextInt();
		
		scanner.nextLine();
		String caixa[] = new String [divcaixa];
		
		System.out.println("Você deseja alocar um item na sua caixa? (S/N)");
		deseja = scanner.next();
		
		while (deseja.equalsIgnoreCase ("S")) {
			System.out.println("Informe a divisória onde deseja alocar o item: ");
			int div = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Informe o item a ser alocado: ");
			String item = scanner.nextLine();
			
			
			caixa [div-1] = item;
			
			System.out.println("Deseja alocar mais um item na sua caixa? (S/N)");
			deseja = scanner.nextLine();
			System.out.println("BLAoajdfgoptj");
		}
			System.out.println("Deseja visualizar o conteúdo atual da caixa? (S/N)");
			desejas = scanner.next();
		if (desejas.equalsIgnoreCase ("S")) {
		for (int i = 0; i < caixa.length; i++) {
			System.out.println(caixa[i] + " ");
			scanner.close();
			}
		}
	}
}