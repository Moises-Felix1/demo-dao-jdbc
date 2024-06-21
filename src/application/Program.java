package application;

import java.util.Date;
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
		list.forEach(System.out::println);
		
		System.out.println("\n=== TESTE 3: seller findAll ===");
		list = slrdao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TESTE 4: seller insert ===");
		Seller newseller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, dep);
		slrdao.insert(newseller);
		System.out.println("Inserted! New id = " + newseller.getId());
		
		System.out.println("\n=== TESTE 5: seller update ===");
		slr = slrdao.findById(1);
		slr.setName("Martha Wayne");
		slrdao.update(slr);
		System.out.println("Update completed");
	}

}
