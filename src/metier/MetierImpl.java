package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	// Couplage faible
	private IDao dao;
	@Override
	public double calcul() {
		double temp=dao.getData();
		double res=temp*Math.cos(temp)*400;
		return res;
	}
	/*
	 * Injecter dans la variable dao un objet
	 * d'une classe qui implémente l'interface IDao
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
