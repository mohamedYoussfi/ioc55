package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class Pres2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(new File("config.txt"));
		
		String daoClassName=scanner.nextLine();
		Class<?> cDao=Class.forName(daoClassName);
		IDao dao=(IDao)cDao.getDeclaredConstructor().newInstance();
		
		String metierClassName=scanner.nextLine();
		Class<?> cMetier=Class.forName(metierClassName);
		IMetier metier=(IMetier)cMetier.getDeclaredConstructor().newInstance();
		
		Method m=cMetier.getMethod("setDao", IDao.class);
		m.invoke(metier, dao);
		System.out.println("Res=>"+metier.calcul());

	}

}
