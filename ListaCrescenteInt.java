package listas;

public class ListaCrescenteInt {

	private class NO {
		int dado;
		NO prox;
	}

	public NO lista = null;

	public boolean isEmpty() {
		return (lista == null);
	}

	public void add(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (isEmpty()) {
			novo.prox = null;
			lista = novo;
		} else {
			if (novo.dado < lista.dado) {
				novo.prox = lista;
				lista = novo;
			} else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado < novo.dado) {
						aux = aux.prox;
					} else {
						achou = true;
					}
				}
				novo.prox = aux.prox;
				aux.prox = novo;
			}
		}
	}

	public boolean remove(int valor) {
		boolean achou = false;
		if (!isEmpty()) {
			if (valor == lista.dado) {
				lista = lista.prox;
				achou = true;
			} else {
				NO aux = lista;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado != valor) {
						aux = aux.prox;
					} else {
						achou = true;
					}
				}
				if (achou) {
					aux.prox = aux.prox.prox;

				}

			}
		}

		return achou;
	}

	public int contaNos() {
		int qtd = 0;
		NO aux = lista;
		while (aux != null) {
			qtd++;
			aux = aux.prox;
		}
		return qtd;
	}

	public void show() {
		NO aux = lista;
		System.out.println("******** Lista ********");
		while (aux != null) {
			System.out.println(aux.dado + "\t");
			aux = aux.prox;
		}
		System.out.println();
	}

	public void showGreaters(int limite) {
		NO aux = lista;
		System.out.println("******** Lista de valores acima de " + limite + " ********");
		while (aux != null) {
			// esse comando muda dependendo do que vc quer, pq a base é a mesma

			if (aux.dado > limite) {
				System.out.println(aux.dado + "\t");
				aux = aux.prox;
			}

			// até aqui muda
		}
		System.out.println();
	}

}
