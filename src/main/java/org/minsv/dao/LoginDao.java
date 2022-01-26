package org.minsv.dao;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.minsv.entity.Login;



public class LoginDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://nas.minsv.com:30010/student";
    static final String USER = "dbuser";
    static final String PASS = "cxvmdsflncxv@SDFCXVVXCVlsdf445fsdfsd";
	
	public static int login(Login login) {
		int flag = -1;
		int result = -1;
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			String sql = "select count(*) from login where name=? and password =?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, login.getName());
			pstmt.setString(2, login.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
			if(result>0) {
				return 1;
			} else {
				return 0;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return flag;
		}finally {
			
			
				try {
					if(rs!=null) rs.close();
					if(pstmt != null) pstmt.close();
					if(connection != null) connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
			
			
			
			
		}
	}
}



