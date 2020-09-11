package questao_01;

import java.util.Random;
import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		int x,y;
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		x = rnd.nextInt(100);
		System.out.println("Digite um número entre 0 e 99: ");
		y = sc.nextInt();
		
		while(x!=y) {
			if(y<x) {
				System.out.println("MAIOR");
			}
			if(y>x) {
				System.out.println("MENOR");
			}
			System.out.println("Digite um número entre 0 e 99: ");	
			y = sc.nextInt();
		}
		
		if(x==y) {
			System.out.println("ACERTOU");
		}
	
	
		

	}

}
