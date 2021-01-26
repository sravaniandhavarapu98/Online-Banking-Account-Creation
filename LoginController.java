package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
@WebServlet("/loginCon")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   AdminController acController;
   public void init() {
	   acController=new AdminController();
   }
   AccountController controller = new AccountController();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Account> list=controller.viewAccount();
		request.setAttribute("AccountList", list);
		
	RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
	rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int result=acController.authenticate(username, password);
		
		if (result == 1) {
			List<Account> list = controller.viewAccount();
			request.setAttribute("AccountList", list);
			
			RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		} else {
			String msg = "Invalid Credentials";
			request.setAttribute("message", msg);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

}
