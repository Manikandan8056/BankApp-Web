package com.revature.bankapp.UtilTest;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

import com.revature.bankapp.controller.ConnectionUtil;

public class ConnectionUtilTest {


	@Test
    public void testConnection() {
        Connection connection = ConnectionUtil.getConnection();
        assertNotNull(connection);
    }

	

}
