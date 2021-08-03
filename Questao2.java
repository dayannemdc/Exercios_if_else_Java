package Exercicios;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2 - Faça um programa que entre com três números e coloque em ordem crescente.
		
		double n1,n2,n3;
		//String primeiro,segundo,terceiro;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o número N1: ");
		n1 = leia.nextDouble();
		System.out.println("\nEntre com o número N2: ");
		n2 = leia.nextDouble();
		System.out.println("\nEntre com o número N3: ");
		n3 = leia.nextDouble();
		
		if(n1<n2 && n1<n3)
		{
			System.out.print(n1+" - ");
			if(n1<n3) 
			{
				System.out.println(n2+" - "+n3);
			}
			else 
			{
				System.out.println(n3+" - "+n2);
			}
		}
		if(n2<n1 && n2<n3)
		{
			System.out.print(n2+" - ");
			if(n1<n3) 
			{
				System.out.println(n1+" - "+n3);
			}
			else 
			{
				System.out.println(n3+" - "+n1);
			}
		}
		if(n3<n1 && n3<n2)
		{
			System.out.print(n3+" - ");
			if(n1<n2) 
			{
				System.out.println(n1+" - "+n2);
			}
			else 
			{
				System.out.println(n2+" - "+n1);
			}
		}
	}

}
