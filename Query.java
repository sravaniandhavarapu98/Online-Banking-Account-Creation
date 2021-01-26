package util;

public class Query {
	public static String adminAuthentication = "select * from admin where name=? and password=?";
	public static String addAccount = "insert into account values(?,?,?,?)";
	public static String viewAccount = "select * from account";
	public static String editAccount = "update account set name=?,mobileno=?,emailid=? where aadharid=?";
	public static String removeAccount = "delete from account where aadharid=?";
}
