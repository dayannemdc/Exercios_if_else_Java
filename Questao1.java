package Exercicios;

import java.util.Scanner;

public class Questao1 {

	private static final String Systen = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int n1,n2,n3,maior=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o n�mero N1: ");
		n1=leia.nextInt();
		System.out.println("\nEntre com o n�mero N2: ");
		n2=leia.nextInt();
		System.out.println("\nEntre com o n�mero N3: ");
		n3=leia.nextInt();
		
		if(maior<n1)
		{
			maior=n1;
		}
		else if(n1<n2)
		{
			maior=n2;
		}
		else if(n2<n3)
		{
			maior=n3;
		}
		else
		{maior=0;}
		
		System.out.println("\nO maior n�mero �: "+maior);
	}

}
