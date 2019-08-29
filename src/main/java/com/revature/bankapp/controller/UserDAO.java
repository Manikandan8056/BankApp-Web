package com.revature.bankapp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

	public boolean login(String email, String password) throws SQLException {
        boolean isValidLogin = false;
        
        Connection con=ConnectionUtil.getConnection();
        String sql="select * from users where email = ? and password = ?";
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1, email);
        pst.setString(2, password);
        ResultSet rs=pst.executeQuery();
        
        String mailId="";
        String pwd="";
        if(rs.next()) {
        	mailId=rs.getString("email");
        	pwd=rs.getString("password");
        }
        
        if(email.equals(mailId) && pwd.equals(pwd)) {
        	isValidLogin= true;
        }
        
        return isValidLogin;
    }
	
}
