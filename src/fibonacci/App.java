package fibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int resp;
		do {
		Scanner ler = new Scanner(System.in);
		int a = 0, b = 1, c = 0, d;
		System.out.println("Digite o num�ro para saber se � da sequ�ncia fibonacci: ");
		d = ler.nextInt();
		do{
			c = a + b;
			a = b;
			b = c;
		} while (d > c);
		if(d == 0) {
			System.out.println("O pr�ximo �: "+b);
		} else if(d == c) {
			System.out.println("Pr�ximo: "+(a + b));
		} else {
			System.err.println("Ta errado!");
		}
		System.out.println("Deseja continuar: \n1 - Sim \n2 - N�o");
		resp = ler.nextInt();
		}while (resp == 1);
		System.out.println("Beleza, te espero na pr�xima!");
	}

}
