package com.greatLearn.email.driver;

import java.util.Scanner;

import com.greatLearn.email.model.Employee;
import com.greatLearn.email.service.CredentialService;
import com.greatLearn.email.service.ICredentialService;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ICredentialService service = new CredentialService();
		
		System.out.println("***Employee Login Credentials***");
		System.out.println("Enter First Name");
		String fn =sc.nextLine();
		System.out.println("Enter Last Name");
		String fl =sc.nextLine();
		
		Employee emp=new Employee(fn, fl);
		System.out.println("Please select department");
		System.out.println("1.Admin");
		System.out.println("2.Human Resource");
		System.out.println("3.Artificial Intelligence");
		System.out.println("4.Information Technology");

		int option =sc.nextInt();
		switch (option) {
		case 1: {
			emp.setDepartment("ad");
			break;
		}
		case 2: {
			emp.setDepartment("hr");
			break;
		}
		case 3: {
			emp.setDepartment("ai");
			break;
		}
		case 4: {
			emp.setDepartment("it");
			break;
		}
		default:
			System.out.println("Please select valid option");
		}
		
		if(emp.getFirstName()!=null && emp.getLastName()!=null && emp.getDepartment()!=null) {
			service.generateEmail(emp);
			service.generatePassword(emp);
			service.showCredentails(emp);
		}
		else {
			System.out.println("Invalid Employee Details!");
		}
	}

}
