package Exercicios;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Faca um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
		
		double idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextDouble();
		
		if(idade>=10 && idade<15)
		{
			System.out.println("Categoria infantil!!!");
		}
		else if(idade>=15 && idade<18)
		{
			System.out.println("Categoria juvenil!!!");
		}
		else if(idade>=18 && idade<25)
		{
			System.out.println("Categoria adulto!!!");
		}
		else
		{
			System.out.println("Fora das categorias disponíveis...");
		}
			
			
	}

}
