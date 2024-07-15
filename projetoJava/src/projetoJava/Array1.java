package projetoJava;
import java.util.Scanner;
public class Array1 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		String deseja;
		// Array é como se fosse uma caixa que possui divisórias
		// Em cada divisória pode-se colocar itens, organizados e manipulados quando precisar
		
		// Um espaço de uma divisória nessa caixa será identificada por um nº inteiro
		// O nº começará pelo nº zero
		// Array (caixa) pode ser de qualquer tipo: int, String...
		
		// Declarando variável Array ([])
		/*int box[] = new int[5];*/
		
		/*box [0] = 2;
		box [1] = 4;
		box [2] = 6;
		box [3] = 8;
		box [4] = 10;
		
		System.out.print(box[0] + " ");
		System.out.print(box[1] + " ");
		System.out.print(box[2] + " ");
		System.out.print(box[3] + " ");
		System.out.print(box[4] + " ");*/
		
		System.out.print("Digite o tamanho de espaços para a sua caixa: ");
		int esp = input.nextInt();
		int box[] = new int [esp];
		do {
		
		System.out.print("Digite o compartimento da caixa que quer usar: ");
		int comp = input.nextInt();
		
		System.out.print("Digite o item que quer alocar no compartimento: ");
		int item = input.nextInt();
		
		input.nextLine();
		
		box [comp-1] = item;
		
			System.out.println("Você deseja alocar mais um item na sua caixa? ");
			deseja = input.next();
		} while (deseja.equalsIgnoreCase ("S"));
		
		for (int i = 0; i < box.length; i++) {
		System.out.print(box[i] + " ");}
		input.close();
	}
}