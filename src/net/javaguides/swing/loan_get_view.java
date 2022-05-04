package net.javaguides.swing;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class loan_get_view {
	private DefaultTableModel tableModel;
	private JTable table;
	
	public loan_get_view() {
		tableModel = new DefaultTableModel();
	    table = new JTable();
	    Object[] columns = {"Username","Acc_No","Credit","Amt","Term","Int_Rate"};
	    tableModel.setColumnIdentifiers(columns);
	    table.setModel(tableModel);
	    
	    JFrame f = new JFrame();
	    f.setSize(550, 350);
	    f.add(new JScrollPane(table));
	    f.setVisible(true);
	}
	
	public void set_table(ArrayList<Object[]> lis){
		tableModel.setRowCount(0);
		
		for(Object[] i:lis) {
			tableModel.addRow(i);
		}
	}
}
