package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao slrdao = DaoFactory.createSeller();
		
		Seller slr =slrdao.findById(3);
		System.out.println(slr);

	}

}
