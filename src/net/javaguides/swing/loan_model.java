package net.javaguides.swing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class loan_model {
	private Connection connection;
	private int x;
    private ArrayList<Object[]> lis;

	public loan_model() {
        try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan_application", "root", "Rb0f?odh!");
			lis = new ArrayList<Object[]>();
			get_database();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void set_database(String username, String account_no, String credit_score, String amount, String loan_term, String interest_rate) {
	try {
		
		if(Float.parseFloat(credit_score) < 300) {
			x = 0;
			return;
			
		}

        String query = "INSERT INTO loan_application values('" + username + "','" + account_no + "','" + credit_score + "','" +
            amount + "','" + loan_term + "','" + interest_rate + "')";

        Statement sta = connection.createStatement();
        x = sta.executeUpdate(query);
  
        
    } catch (Exception exception) {
        exception.printStackTrace();
    }
}
	
	public void get_database() {
		try {

			lis.clear();
	        Statement sta1 = connection.createStatement();
	        String query1 = "SELECT * FROM loan_application";
	        ResultSet res = sta1.executeQuery(query1);
	        
	        while(res.next())  
	        {
	        	Object[] row = new Object[6];
	        	row[0] = res.getString(1);
	        	row[1] = res.getString(2);
	        	row[2] = res.getString(3);
	        	row[3] = res.getString(4);
	        	row[4] = res.getString(5);
	        	row[5] = res.getString(6);
	        	lis.add(row);
	        }
	        
	        
	  
	        
	    } catch (Exception exception) {
	        exception.printStackTrace();
	    }
	}
	
	public int get_x() {
		return x;
	}
	
	public ArrayList<Object[]> get_lis() {
		return lis;
	}
}
