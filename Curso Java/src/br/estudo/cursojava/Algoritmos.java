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

	public static void calculaSalarioMinimos() {
		Scanner scan = new Scanner(System.in);

		double salarioMinimo, salario;

		System.out.println("Digite o salario atual");
		salario = scan.nextDouble();

		System.out.println("Digite o salario minimo");
		salarioMinimo = scan.nextDouble();

		System.out.println(salario / salarioMinimo);
	}

	public static void mediaHomensMulheres() {
		int homem, mulher, total;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de homens na turma");
		homem = scan.nextInt();
		System.out.println("Digite a quantidade de mulheres na turma");
		mulher = scan.nextInt();

		total = mulher + homem;

		System.out.println("A porcentagens de homens na turma é: "
				+ ((double) homem / (double) total) * 100);
		System.out.println("A porcentagens de mulheres na turma é: "
				+ ((double) mulher / (double) total) * 100);

	}

	public static void mediaAritmetica() {
		Scanner scan = new Scanner(System.in);

		int notas[] = new int[4];
		int soma = 0;

		for (int i = 0; i < notas.length; ++i) {
			System.out.println("Digite a nota " + (i + 1));
			notas[i] = scan.nextInt();

			soma = soma + notas[i];
		}

		System.out.println("A media é: " + (double) soma / 4);
	}

	public static void calculaDividas() {
		Scanner scan = new Scanner(System.in);

		int meses;
		double debito, taxaJuros, totalJuros;

		System.out.println("Digite o total do debito: ");
		debito = scan.nextDouble();

		System.out.println("Digite a quantidade de meses: ");
		meses = scan.nextInt();

		System.out.println("Digite a quantidade de juros: ");
		taxaJuros = scan.nextDouble();

		totalJuros = debito * taxaJuros * meses;

		System.out.println("O juros total é: " + totalJuros + debito);

	}
	
	

	public static void main(String[] args) {
		// idade();
		// calculaSalarioMinimos();
		// mediaHomensMulheres();
		// mediaAritmetica();
		// calculaDividas();
	}

}
