package projetoJava;

import java.util.Scanner;

public class numeroUm {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao Quiz sobre as linguagens de Java !!");
			Scanner scanner = new Scanner (System.in);
			
		System.out.println("E vamos para a primeira pergunta !!");
		boolean respostaCorretaUm = false;
		while (!respostaCorretaUm) {
			System.out.println("Em que ano a linguagem java foi inventada? ");
			int primeiraResposta = scanner.nextInt();
				if (primeiraResposta == 1995 ) { 
					System.out.println("Certa Resposta !!");
					respostaCorretaUm = true;
				}else{
					System.out.println("Resposta errada tente novamente !!");
				}
		}
		
		boolean respostaCorretaDois = false;
		while (!respostaCorretaDois) {
		System.out.println("Quantos paradigmas a linguagem Java suporta?");		
			int segundaResposta = scanner.nextInt();
			scanner.nextLine();
				if(segundaResposta == 3 || segundaResposta == 03) {
					System.out.println("Certa Resposta!!");
					respostaCorretaDois = true;
				}else{
					System.out.println("Tente novamente");
				}
		}
		
		boolean respostaCorretaTres = false;
		while (!respostaCorretaTres){
			System.out.println("Qual é o paradigma de programação mais usado na linguagem java?");
				String terceiraResposta = scanner.nextLine().toLowerCase().trim();
					if(terceiraResposta.contains("poo") || terceiraResposta.contains("programação orientada a objetos") || terceiraResposta.contains("programacao orientada a objetos")) {				
						System.out.print("Certa Resposta");
							respostaCorretaTres = true;
					}else{
						System.out.println("Tente novamente");
				}
		}
		
		System.out.println();
		
		boolean respostaCorretaQuatro = false;
		while (!respostaCorretaQuatro){
			System.out.println("Para rodar java você deve instalar a maquina virtual java que tem a sigla de: ");
				String quartaResposta = scanner.nextLine().toLowerCase().trim();
					if (quartaResposta.contains("jvm")) {
						System.out.println("Certa resposta!!");
							respostaCorretaQuatro = true;
					}else {
						System.out.println("tente novamnete");
				}
		}
		
		boolean respostaCorretaCinco = false;
		while (!respostaCorretaCinco){
			System.out.println("Qual empresa desenvolvel a linguagem de programação java");
				String quintaResposta = scanner.nextLine().toLowerCase().trim();
					if (quintaResposta.contains("oracle")) {
						System.out.println("Certa Resposta!");
						respostaCorretaCinco = true;
					}else {
						System.out.println("tente novamente");
			}
		}
		scanner.close();
	}

}
