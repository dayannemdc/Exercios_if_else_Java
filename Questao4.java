package Exercicios;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4 - Faca um programa em que permita a entrada de um número qualquer e exiba se este
número e par ou impar. Se for par exiba tambem a raiz quadrada do mesmo; se for
ímpar exiba o numero elevado ao quadrado.*/
		
		double numero,par,impar,raiz,aoQuadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número: ");
		numero=leia.nextDouble();
		
		if(numero%2==0)
		{
			System.out.println("O "+numero+" é par.");
			raiz=Math.sqrt(numero);
			System.out.println("\nA raiz quadrada do número: "+numero+" é: "+raiz);
		}
		if(numero%2!=0)
		{
			System.out.println("O "+numero+" é impar.");
			aoQuadrado=Math.pow(numero, 2);
			System.out.println("\nO número: "+numero+" elevado ao quadrado é: "+aoQuadrado);
		}
		
	}

}
