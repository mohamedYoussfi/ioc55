package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {
		System.out.println("Base de donn�es");
		double temp=Math.random()*50;
		return temp;
	}

}
