package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao slrdao = DaoFactory.createSeller();
		
		System.out.println("=== TESTE 1: seller findById ===");
		Seller slr = slrdao.findById(3);
		System.out.println(slr);
		
		System.out.println("\n=== TESTE 2: seller findByIdDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = slrdao.findByIdDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: seller findAll ===");
		list = slrdao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}

	}

}
