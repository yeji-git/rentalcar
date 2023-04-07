package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import client.Client;
import client.controller.ClientDao;

public class LoginAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String client_id = request.getParameter("client_id");
		String password = request.getParameter("password");

		ClientDao clientDao = ClientDao.getInstance();
		Client client = clientDao.getClientById(client_id);
		
		if (client != null && password.equals(client.getPassword())) {
			HttpSession session = request.getSession();
			session.setAttribute("log", client);
			response.sendRedirect("/");
		}
		else {
			response.sendRedirect("login");
		}
	}

}
