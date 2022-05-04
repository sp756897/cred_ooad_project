package net.javaguides.swing;

import java.awt.EventQueue;

public class cred_app {
	private static int id;
	public cred_app(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    loan_view view = new loan_view();
                    loan_get_view view_Get_view = new loan_get_view();
                    loan_model model = new loan_model();
                    loan_controller controller = new loan_controller(view ,model, view_Get_view);
                    ashboard dashboard = new ashboard();
                    deposit dmodel = new deposit(id);
                    dashboard_controller dcontroller = new dashboard_controller(dashboard, dmodel, controller);
                    
                    view.setVisible(false);
                    dashboard.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
