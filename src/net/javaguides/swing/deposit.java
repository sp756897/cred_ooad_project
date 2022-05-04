package net.javaguides.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class deposit {
	private Connection connection;
	public String name;
	public float credit;
	public int id;
	private int x;
	private credit cred_ref;
	public float balance;
	

	public deposit(int id) {
		
		this.id = id;
		this.cred_ref = new credit();		
		
	}
	
	public int deposit_amt(int id, String kind, float amount) {
		try {
			
			ResultSet resultset;
			int dtimes;
			float cred;
			
	        Statement sta = connection.createStatement();
			
			String query1 = "SELECT * FROM account where( account_id ='" + id + "')";
			resultset = sta.executeQuery(query1);
			resultset.next();
			this.credit = resultset.getFloat("creditscore");
			dtimes = resultset.getInt("dtimes");
			dtimes = dtimes + 1;
			System.out.print(id);

	        String query = "INSERT INTO transaction_history (id, kind, amount) values('" + id + "','" + kind + "','" +
	            amount + "')";

	        x = sta.executeUpdate(query);
	        
	        cred = this.cred_ref.cred_deposit(amount, this.credit, dtimes);
	        
	        this.credit = cred;
	        
	        this.balance = this.balance + amount;
	        	        
	        String query2 = "UPDATE account SET dtimes = " + dtimes + "," + "creditscore = " + cred + "," + "balance = " + this.balance + " WHERE (account_id ='" + id + "')";
	        x = sta.executeUpdate(query2);
	        
	        return 1;
	  
	        
	    } catch (Exception exception) {
	        exception.printStackTrace();
	        return 0;
	    }
	}
	
	public int withdraw_amt(int id, String kind, float amount) {
		
		
		try {
			
			if(amount > this.balance) {
				return 0;
			}
			
			int wtimes;
			ResultSet resultset;
			float cred;

	        Statement sta = connection.createStatement();
	        String query1 = "SELECT * FROM account where( account_id ='" + id + "')";
			resultset = sta.executeQuery(query1);
			resultset.next();
			this.credit = resultset.getFloat("creditscore");
			wtimes = resultset.getInt("wtimes");
			wtimes = wtimes + 1;
			

	        String query = "INSERT INTO transaction_history (id, kind, amount) values('" + id + "','" + kind + "','" +
	            amount + "')";

	        x = sta.executeUpdate(query);
	        
	        cred = this.cred_ref.cred_withdraw(amount, this.credit, wtimes);
	        
	        this.credit = cred;
	        
	        this.balance = this.balance - amount;
	        
	        String query2 = "UPDATE account SET wtimes = " + wtimes + "," + "creditscore = " + cred + "," + "balance = " + this.balance + " WHERE (account_id ='" + id + "')";
	        x = sta.executeUpdate(query2);
	        return 1;
	  
	        
	    } catch (Exception exception) {
	        exception.printStackTrace();
	        return 0;
	    }
	}
	
	public void set_id(int id) {
		this.id = id;
	}
	
	public void set_dash() {
		try {
        	ResultSet resultset;
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan_application", "root", "Rb0f?odh!");
	        Statement sta = connection.createStatement();

			String query1 = "SELECT * FROM account where( account_id ='" + id + "')";
			resultset = sta.executeQuery(query1);
			resultset.next();
			this.credit = resultset.getFloat("creditscore");
			this.name = resultset.getString("username");
			this.balance = resultset.getFloat("balance");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


