package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depdao = DaoFactory.createDepartment();
		
		System.out.println("=== TESTE 1: Department findById ===");
		Department dep = depdao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TESTE 2: Department findAll ===");
		List<Department> lista = depdao.findAll();
		lista.forEach(System.out::println);
		
		System.out.println("\n=== TESTE 3: Department insert ===");
		Department newdep = new Department(null, "d9");
		depdao.insert(newdep);
		System.out.println("Inserted! New id = " + newdep.getId());
		
		System.out.println("\n=== TESTE 4: Department update ===");
		dep = depdao.findById(7);
		dep.setName("dSete");
		depdao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n=== TESTE 6: Department deleteById ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		depdao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
