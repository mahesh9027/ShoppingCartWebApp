package com.niit.ShoppingCart;

public class LoginDAO {


public boolean isValidUser(String userID, String password) {
	// TODO Auto-generated method stub
	if (userID.equals(password))
	{
		return true;
	}
	else
	{
		return false;
	}
		
}
}