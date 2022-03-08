package ui;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
	public static void main(String[] args) {
		/*
		 * Injection des dépendances par
		 * instanciation statique => new
		 */
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		metier.setDao(dao);
		System.out.println("Res=>"+metier.calcul());
	}
}
