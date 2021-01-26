package controller;

import java.util.List;

import dao.AccountImpl;
import dao.IAccount;
import model.Account;

public class AccountController {
	IAccount aImpl = new AccountImpl();

	public int addAccount(String name, String mobileno, String aadharid, String emailid) {
		Account account = new Account(name, mobileno, aadharid, emailid);
		return aImpl.addAccount(account);
	}

	public List<Account> viewAccount() {
		return aImpl.viewAccount();
	}

	public int editAccount(String name, String mobileno, String aadharid, String emailid) {
		Account account = new Account(name, mobileno, aadharid, emailid);
		return aImpl.editAccount(account);
	}

	public int removeAccount(String aadharid) {
		Account account = new Account();
		account.setAadharid(aadharid);
		return aImpl.removeAccount(account);
	}

}