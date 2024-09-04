package listas;

import java.util.Scanner;

public class MainTeste {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ListaCrescenteInt lista = new ListaCrescenteInt();
		int valor;
		
		System.out.println("Valor positivo insere na lista, negativo encerra: ");
		valor = le.nextInt();
		while (valor >= 0) {
			lista.add(valor);
			System.out.println("A quantidade de nos na lista: "+lista.contaNos());
			lista.show();
			System.out.println("Valor positivo insere na lista, negativo encerra: ");
			valor = le.nextInt();

		}
		
		System.out.println("Valor limite para pesquisar na lista valores maiores do que limite: ");
		valor = le.nextInt();
		lista.showGreaters(valor);
		
		System.out.println("Valor positivo remove na lista, negativo encerra: ");
		valor = le.nextInt();
		while (valor >= 0) {
			if(lista.remove(valor)) {
				System.out.println("Valor removido com sucesso!");
			}else {
				System.out.println("Valor não encontrado na lista");
			}
			lista.show();
			System.out.println("Valor negatio insere na lista, negativo encerra: ");
			valor = le.nextInt();

		}
		System.out.println(" quatidade que ficaram na lista: "+lista.contaNos());
		le.close();
	}
}
