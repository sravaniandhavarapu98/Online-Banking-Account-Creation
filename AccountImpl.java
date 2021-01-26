package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Account;
import util.Db;
import util.Query;

public class AccountImpl implements IAccount {
	PreparedStatement pst = null;
	ResultSet rs = null;
	int result = 0;

	@Override
	public int addAccount(Account account) {
		try {
			pst = Db.getCon().prepareStatement(Query.addAccount);
			pst.setString(1, account.getName());
			pst.setString(2, account.getMobileno());
			pst.setString(3, account.getAadharid());
			pst.setString(4, account.getEmailid());
			result = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			result = 0;
		} finally {
			try {
				Db.getCon().close();
				pst.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public List<Account> viewAccount() {
		List<Account> account = new ArrayList<Account>();
		try {
			pst = Db.getCon().prepareStatement(Query.viewAccount);
			rs = pst.executeQuery();
			while (rs.next()) {
				Account a = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				account.add(a);
			}

		} catch (ClassNotFoundException | SQLException e) {
			try {
				Db.getCon().close();
				pst.close();
				rs.close();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return account;
	}

	@Override
	public int editAccount(Account account) {
		try {
			pst = Db.getCon().prepareStatement(Query.editAccount);
			pst.setString(1, account.getName());
			pst.setString(2, account.getMobileno());
			pst.setString(3, account.getEmailid());
			pst.setString(4, account.getAadharid());
			result = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			result = 0;
		} finally {
			try {
				Db.getCon().close();
				pst.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int removeAccount(Account account) {
		try {
			pst = Db.getCon().prepareStatement(Query.removeAccount);
			pst.setString(1, account.getAadharid());
			result = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			result = 0;
		} finally {
			try {
				Db.getCon().close();
				pst.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}
