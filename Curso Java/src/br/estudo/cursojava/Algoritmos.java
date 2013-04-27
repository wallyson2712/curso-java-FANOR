package br.estudo.cursojava;

import java.util.Scanner;

public class Algoritmos {

	public static void idade() {
		Scanner entrada = new Scanner(System.in);

		int dataNascimento, anoAtual;

		System.out.println("Digite a data de nascimento:");
		dataNascimento = entrada.nextInt();

		System.out.println("Digite o ano atual");
		anoAtual = entrada.nextInt();

		System.out.println(anoAtual - dataNascimento);
	}
	
	public static void calculaSalarioMinimos(){
		Scanner scan = new Scanner(System.in);
		
		double salarioMinimo, salario;
		
		System.out.println("Digite o salario atual");
		salario = scan.nextDouble();
		
		System.out.println("Digite o salario minimo");
		salarioMinimo = scan.nextDouble();
		
		System.out.println(salario/salarioMinimo);
	}
	
	public static void mediaHomensMulheres(){
		int homem, mulher;
		
	}

	public static void main(String[] args) {
		// idade();
		// calculaSalarioMinimos();
		
		
	}

}
