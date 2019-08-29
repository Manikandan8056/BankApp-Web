package com.revature.bankapp.UtilTest;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.bankapp.controller.UserDAO;

public class UserDAOTest {

	@Test
    public void testValidLogin() throws SQLException {

        String email = "m@gmail.com";
        String password = "mani123";
        UserDAO userdao = new UserDAO();
        boolean isValidLogin = userdao.login(email, password);
        assertTrue(isValidLogin);
    }
    
    @Test
    public void testInValidLogin() throws SQLException {

        String email = "";
        String password = "";
        UserDAO userdao = new UserDAO();
        boolean isValidLogin = userdao.login(email, password);
        assertFalse(isValidLogin);
    }

}
