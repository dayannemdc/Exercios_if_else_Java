package Exercicios;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4 - Faca um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero e par ou impar. Se for par exiba tambem a raiz quadrada do mesmo; se for
�mpar exiba o numero elevado ao quadrado.*/
		
		double numero,par,impar,raiz,aoQuadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o n�mero: ");
		numero=leia.nextDouble();
		
		if(numero%2==0)
		{
			System.out.println("O "+numero+" � par.");
			raiz=Math.sqrt(numero);
			System.out.println("\nA raiz quadrada do n�mero: "+numero+" �: "+raiz);
		}
		if(numero%2!=0)
		{
			System.out.println("O "+numero+" � impar.");
			aoQuadrado=Math.pow(numero, 2);
			System.out.println("\nO n�mero: "+numero+" elevado ao quadrado �: "+aoQuadrado);
		}
		
	}

}
