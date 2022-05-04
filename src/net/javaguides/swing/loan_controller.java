package net.javaguides.swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loan_controller{
	private loan_view the_View;
	private loan_model the_Model;
	private loan_get_view the_Get_view;
	
	public loan_controller(loan_view theView, loan_model theModel, loan_get_view thegetview) {
	// TODO Auto-generated constructor stub
		this.the_View = theView;
		this.the_Model= theModel;
		this.the_Get_view = thegetview;
		
		this.the_View.onApply(new Apply_loan());
		this.the_Get_view.set_table(the_Model.get_lis());
	}

class Apply_loan implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		        String username = the_View.get_username();
		        String acc_number = the_View.get_acc_number();
		        String credit_score = the_View.get_credit_score();
		        String interest = the_View.get_interest();
		        String term = the_View.get_term();
		        String amount = the_View.get_amount();
		        
		 try {
			the_Model.set_database(username, acc_number, credit_score, amount, term, interest);
			the_View.errormsg(the_Model.get_x());
			the_Model.get_database();
			the_Get_view.set_table(the_Model.get_lis());
			the_View.setVisible(false);
		 }
		 catch (Exception e1) {
			// TODO: handle exception
		}
	}
	
  }
public void set_view_loan() {
	this.the_View.setVisible(true);
}
public void set_loan_inputs(String name, int id, float credit) {
	this.the_View.set_name(name);
	this.the_View.set_acc(id);
	this.the_View.set_credit(credit);
	this.the_View.set_interest();
}

}



