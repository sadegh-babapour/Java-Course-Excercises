import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MyController {
	private MyView2 view;
	private InventoryManager inventory;

	public MyController(MyView2 view, InventoryManager inventory) {
		this.view = view;
		this.inventory = inventory;

		view.registerLoadListener(new loadListener());
		view.registerSearchListener(new SearchListener());
		view.registerAddtoDataBase(new AddtoDbListener());

	}

	class AddtoDbListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			int id = Integer.parseInt(view.txtID.getText());
			String names = view.txtName.getText();
			int q = Integer.parseInt(view.txtQuantity.getText());
			double price = Double.parseDouble(view.txtPrice.getText());
			int supp = Integer.parseInt(view.txtSupplierID.getText());

			Tool tool = new Tool(id, names, q, price, supp);

			inventory.addItemz(tool);
			// simulataneoudly adds to current table and database
			view.tablemodel = (DefaultTableModel) view.table.getModel();
			view.tablemodel.addRow(new Object[] { id, names, q, price, supp });
		}
	}

	class loadListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			ResultSet rows = inventory.printTable();
			DefaultTableModel dTableModel = (DefaultTableModel) view.table.getModel();

			Object[] tempRow;

			if (dTableModel.getRowCount() == 0) {
				try {
					while (rows.next()) {
						// Gets the column values based on class type expected

						tempRow = new Object[] { rows.getInt(1), rows.getString(2), rows.getInt(3), rows.getDouble(4),
								rows.getInt(5), };

						// Adds the row of data to the end of the model
						dTableModel.addRow(tempRow);

					}
				} catch (SQLException ex) {
					System.out.println("SQLException: " + ex.getMessage());

				}
			}
		}
	}

	class SearchListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//			DefaultTableModel tablemodel = (DefaultTableModel) view.table.getModel();
//			TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tablemodel);
//			view.table.setRowSorter(sorter);
			TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) view.table.getRowSorter();

			String text = view.txtSearchInput.getText();
			if (view.btnID.isSelected()) {
				if (text.length() == 0) {
					sorter.setRowFilter(null);
				} else {
					sorter.setRowFilter(RowFilter.regexFilter(text, 0));
				}
			} else if (view.btnName.isSelected()) {
				if (text.length() == 0) {
					sorter.setRowFilter(null);
				} else {
					sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 1));
				}
			} else if (view.btnSupplier.isSelected()) {
				if (text.length() == 0) {
					sorter.setRowFilter(null);
				} else {
					sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 4));
				}
			}
		}
	}
}
//class ClearListener implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent q) {
//
//		while (view.table.getModel().getRowCount() > 0) {
//			view.table.removeAll();
//		}
//
//		DefaultTableModel dTableModel = (DefaultTableModel) view.table.getModel();
//
//		view.table.setModel(new DefaultTableModel(null,
//				new String[] { "Tool ID", "Tool Name", "Quantity", "Price", "Supplier ID" }));
//
//	}
