package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCozinha;

public class Principal {

	public static void main(String[] args) {

		int permissoes = 0;
		Semaphore semaforo = new Semaphore(permissoes);
		

		for (int idPratos = 1; idPratos <= 5; idPratos++) {
			Thread tPratos = new ThreadCozinha(idPratos,semaforo);
			tPratos.start();
		}

	}

}