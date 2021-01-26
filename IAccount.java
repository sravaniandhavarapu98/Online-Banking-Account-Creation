package dao;

import java.util.List;

import model.Account;

public interface IAccount {

	public int addAccount(Account account);

	public List<Account> viewAccount();

	public int editAccount(Account account);

	public int removeAccount(Account account);

}
