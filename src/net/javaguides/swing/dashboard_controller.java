package net.javaguides.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard_controller {
	private ashboard the_View;
	private deposit the_Model;
	private loan_controller loan_control;
	
	public dashboard_controller(ashboard theView, deposit theModel, loan_controller loan_control) {
	// TODO Auto-generated constructor stub
		this.the_View = theView;
		this.the_Model= theModel;
		this.loan_control = loan_control;
		this.the_View.onDeposit(new onDep());
		this.the_View.onWithdraw(new onWith());
		this.the_View.onLoan(new onLoan());
		
		this.the_View.set_name(this.the_Model.name);
		this.the_View.set_credit(this.the_Model.credit);
		this.the_View.set_id(this.the_Model.id);
		this.the_View.set_balance(this.the_Model.balance);
		
	}
	
	class onDep implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			float amt = the_View.get_depamt();
			//int id = the_View.get_id();
			int id = the_View.get_id();
	        
	 try {
		 int res=0;
		res = the_Model.deposit_amt(id, "deposit", amt);
		the_View.set_credit(the_Model.credit);
		the_View.set_balance(the_Model.balance);
		the_View.errormsgdep(res);
	 }
	 catch (Exception e1) {
		// TODO: handle exception
	}
			
		}
		
	}
	
	class onWith implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			float amt = the_View.get_witamt();
			//int id = the_View.get_id();
			int id = the_View.get_id();
	        
	 try {
		 int res = 0;
		res = the_Model.withdraw_amt(id, "withdraw", amt);
		the_View.set_credit(the_Model.credit);
		the_View.set_balance(the_Model.balance);
		the_View.errormsgwith(res);
	 }
	 catch (Exception e1) {
		// TODO: handle exception
	}
			
		}
		
	}
	class onLoan implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	        
	 try {
		 loan_control.set_view_loan();
		 loan_control.set_loan_inputs(the_Model.name, the_Model.id, the_Model.credit);
		
	 }
	 catch (Exception e1) {
		// TODO: handle exception
	}
			
		}
		
	}
	
	public void set_dep_id(int id) {
		the_Model.set_id(id);
		the_Model.set_dash();
		the_View.set_name(this.the_Model.name);
		the_View.set_credit(this.the_Model.credit);
		the_View.set_id(this.the_Model.id);
		the_View.set_balance(this.the_Model.balance);
	}
	
	public void set_dash_front() {
		the_View.setVisible(true);
	}
}
