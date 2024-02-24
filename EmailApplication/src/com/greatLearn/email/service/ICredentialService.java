package com.greatLearn.email.service;

import com.greatLearn.email.model.Employee;

public interface ICredentialService {

	public void generateEmail(Employee emp);
	public void generatePassword(Employee emp);
	public void showCredentails(Employee emp);

}
