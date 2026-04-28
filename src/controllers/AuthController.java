package controllers;

import view.AuthView;

public class AuthController {
	
	private AuthView vista;
	
	public AuthController() {
		
		vista = new AuthView();
	}
	
	public void showLogin() {
		
		vista.LoginView();
	}
	

}
