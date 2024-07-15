package projetoJava;
public class ArrayLoopingcomFOREACH {
	public static void main (String [] args) {
		String [] caixa= {"Regina", "Eduardo", "Matheus", "Júnior"};
	
		System.out.println("Nomes dos amigos: ");
		for (String nome : caixa) {
			System.out.print(nome + ", ");
		}
	}
}