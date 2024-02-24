package com.greatLearn.email.service;

import java.util.Random;

import com.greatLearn.email.model.Employee;

public class CredentialService implements ICredentialService{

	private String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower="abcdefghijklmnopqrstuvwxyz";
	private String num ="1234567890";
	private String specl="!@#$%^&*()";
	private String pass=upper+lower+num+specl;
	private Random ran = new Random();
	
	@Override
	public void generateEmail(Employee emp) {
		String emailAddress =emp.getFirstName()+emp.getLastName()+
				"@"+emp.getDepartment()+".gl.com";
		emp.setEmailAddress(emailAddress);
	}

	@Override
	public void generatePassword(Employee emp) {
		String password ="";
//		for(int i=0;i<8;i++) {
//			password=password+pass.charAt(ran.nextInt(pass.length()));
//		}
		for(int i=0;i<8;i++) {
			password=password+(char)(ran.nextInt(126-33)+33);
		}
		emp.setPassWord(password);
	}

	@Override
	public void showCredentails(Employee emp) {
		System.out.println("Dear "+emp.getFirstName()+", your credentials as follows: ");
		System.out.println("Email Address: "+emp.getEmailAddress());
		System.out.println("Password: "+emp.getPassWord());
	}


}
