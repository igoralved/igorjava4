package src;
import java.util.Random;
import java.util.Scanner;
public class Main {

	private static Random r = new Random();
	private static Scanner in = new Scanner(System.in);
	
	//Exercicio 12
	public static int[] bubblesort(int vetor[]) {
		int troca = 1;
		while(troca == 1) {
			troca = 0;
			int j = 0;
			while(j < vetor.length - 1) {
				if(vetor[j + 1] < vetor[j]) {
					troca = 1;
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
				j++;
			}
		}
		return vetor;
	}
	
	
	//Exercicio 13
	
	
	public static int lesegundos() {
		System.out.println("Escreva o tempo em segundos:");
		int segundos = in.nextInt();
		return segundos;
	}
	
	public static int horas(int segundos) {
		return segundos / 3600;
	}
	
	public static int minutos(int segundos) {
		return (segundos % 3600) / 60;
	}
	
	
	public static int segundosrestantes(int segundos) {
		return segundos % 60;
	}
	
	public static String escreveresultado(int tempoemsegundos) {
		String s = "";
		int horas = horas(tempoemsegundos);
		s = s + horas + "h";
		int minutos = minutos(tempoemsegundos);
		s = s + minutos + "min";
		int segundos = segundosrestantes(tempoemsegundos);
		s = s + segundos;
		return s;
	}
	
	public static double calculamedia(double[] vetor) {
		if(vetor == null || vetor.length == 0) {
			return 0;
		}
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}return soma / vetor.length;
	}
	
	public static String situacaonota(double notafinal) {
		if(notafinal >= 6 && notafinal <= 10) {
			return "Aprovado";
		}else if(notafinal >= 4 && notafinal < 6) {
			return "Verificacao suplementar";
		}else if(notafinal >= 0 && notafinal < 4) {
			return "Reprovado";
		}
		return "Erro de nota";
	}
	
	public static void main(String args[]) {
		System.out.println("\f");
		//exercicio 12
		System.out.println("Exercício 12");
		System.out.println("Vetor 1 inicial:");
		int[] vetor1 = new int[50];
		for(int i = 0; i < 50; i++) {
			vetor1[i] = r.nextInt();
			System.out.println("Vetor do índice " + i + " = " + vetor1[i]);
		}
		bubblesort(vetor1);
		System.out.println("Vetor 1 ordenado:");
		for(int i = 0; i < 50; i++) {
			System.out.println("Vetor do índice " + i + " = " + vetor1[i]);
		}
		
		System.out.println("Vetor 2 inicial:");
		int[] vetor2 = new int[50];
		for(int i = 0; i < 50; i++) {
			vetor2[i] = r.nextInt();
			System.out.println("Vetor do índice " + i + " = " + vetor2[i]);
		}
		bubblesort(vetor2);
		System.out.println("Vetor 2 ordenado:");
		for(int i = 0; i < 50; i++) {
			System.out.println("Vetor do índice " + i + " = " + vetor2[i]);
		}
		System.out.println("Vetor resultado inicial:");
		int vetorconcatenado[] = new int[100];
		for(int i = 0; i < 50; i++) {
			vetorconcatenado[i] = vetor1[i];
			System.out.println("Vetor do índice " + i + " = " + vetorconcatenado[i]);
		}
		for(int i = vetor1.length; i < 100; i++) {
			vetorconcatenado[i] = vetor2[i - 50];
			System.out.println("Vetor do índice " + i + " = " + vetorconcatenado[i]);
		}
		bubblesort(vetorconcatenado);
		System.out.println("Vetor resultado ordenado:");
		for(int i = 0; i < 100; i++) {
			System.out.println("Vetor do índice " + i + " = " + vetorconcatenado[i]);
		}
		
		//exercicio 13
		System.out.println("Exercício 13");
		
		double[] vetornotas = {9.3, 9.5, 9.5, 10.0, 10.0};
		
		double media = calculamedia(vetornotas);
		
		System.out.println("Média: " + media);
		
		String s = situacaonota(media);
		System.out.println("Situação: " + s);
		
		//exercicio 14
		System.out.println("Exercício 14");
		int	segundos = lesegundos();
		String temporesult = escreveresultado(segundos);
		System.out.println("Tempo em segundos : " + segundos);
		System.out.println("Tempo resultado: " + temporesult);
		
	}
	
}
