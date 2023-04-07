package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.ClientRequestDto;
import client.controller.ClientDao;

public class JoinAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String client_id = request.getParameter("client_id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		ClientRequestDto clientDto = new ClientRequestDto(client_id, password, name, phone, address);

		ClientDao clientDao = ClientDao.getInstance();
		clientDao.createClient(clientDto);		
		
		response.sendRedirect("/");
	}

}
