package controller;

import controller.action.Action;
import controller.action.BookingAction;
import controller.action.JoinAction;
import controller.action.LoginAction;
import controller.action.LogoutAction;

public class ActionFactory {

	private ActionFactory() {}
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if (command.equals("join"))
			action = new JoinAction();
		else if (command.equals("login"))
			action = new LoginAction();
		else if (command.equals("logout"))
			action = new LogoutAction();
		else if (command.equals("booking"))
			action = new BookingAction();
//		else if (command.equals("writeBoard"))
//			action = new WriteBoardAction();
		
		return action;
	}
	
}
