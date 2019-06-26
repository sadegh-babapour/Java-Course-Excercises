import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MyView2 extends JFrame {
	JTextField txtID;
	JTextField txtName;
	JTextField txtQuantity;
	JTextField txtPrice;
	JTextField txtSupplierID;
	JTextField txtSearchInput;
	DefaultTableModel tablemodel;
	JButton btnSearch;
	JButton btnClearSearch;
	JRadioButton btnID;
	JRadioButton btnName;
	JRadioButton btnSupplier;
	ButtonGroup bgroup;
	JScrollPane fscrollPane;
	JTable table;
	JButton btnLoad;
	JPanel panel;
	JPanel panel_1;
	JPanel panel_3;
	JPanel panel_4;
	JPanel panel_2;
	JPanel panel_5;

//	JButton btnAddItem;
	JButton btnAddDataBase;
	JButton btnDbAdd;

	/**
	 * Launch the application.
	 */

	public MyView2() {
//		setLayout(new FlowLayout());
//		setSize(1090, 695);
		setTitle("My Awesome Application");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);

		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		borderLayout.setVgap(10);
		borderLayout.setHgap(1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 665);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		getContentPane().add(panel_1, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setBackground(new Color(204, 102, 51));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_1.add(lblNewLabel);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		getContentPane().add(panel_3, BorderLayout.EAST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 30, 0, 30, 50, 40 };
		gbl_panel_3.rowHeights = new int[] { 75, 24, 30, 30, 32, 30, 30, 0, 30, 30, 0, 30, 30, 0, 30, 30, 0, 30, 30, 0,
				15 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0 };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblID = new JLabel("Tool ID");
		lblID.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_lblID = new GridBagConstraints();
		gbc_lblID.anchor = GridBagConstraints.WEST;
		gbc_lblID.insets = new Insets(0, 0, 5, 5);
		gbc_lblID.gridx = 1;
		gbc_lblID.gridy = 1;
		panel_3.add(lblID, gbc_lblID);

		txtID = new JTextField();
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.insets = new Insets(0, 0, 5, 5);
		gbc_txtID.fill = GridBagConstraints.BOTH;
		gbc_txtID.gridx = 3;
		gbc_txtID.gridy = 1;
		panel_3.add(txtID, gbc_txtID);
		txtID.setColumns(10);

		JLabel lblName = new JLabel("Tool Name");
		lblName.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.fill = GridBagConstraints.VERTICAL;
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 4;
		panel_3.add(lblName, gbc_lblName);

		txtName = new JTextField();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 3;
		gbc_txtName.gridy = 4;
		panel_3.add(txtName, gbc_txtName);
		txtName.setColumns(10);

		JLabel lblQuantity = new JLabel("Tool Quantity");
		lblQuantity.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_lblQuantity = new GridBagConstraints();
		gbc_lblQuantity.anchor = GridBagConstraints.WEST;
		gbc_lblQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuantity.gridx = 1;
		gbc_lblQuantity.gridy = 7;
		panel_3.add(lblQuantity, gbc_lblQuantity);

		txtQuantity = new JTextField();
		GridBagConstraints gbc_txtQuantity = new GridBagConstraints();
		gbc_txtQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_txtQuantity.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtQuantity.gridx = 3;
		gbc_txtQuantity.gridy = 7;
		panel_3.add(txtQuantity, gbc_txtQuantity);
		txtQuantity.setColumns(10);

		JLabel lblPrice = new JLabel("Tool Price");
		lblPrice.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.anchor = GridBagConstraints.WEST;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 1;
		gbc_lblPrice.gridy = 10;
		panel_3.add(lblPrice, gbc_lblPrice);

		txtPrice = new JTextField();
		GridBagConstraints gbc_txtPrice = new GridBagConstraints();
		gbc_txtPrice.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrice.gridx = 3;
		gbc_txtPrice.gridy = 10;
		panel_3.add(txtPrice, gbc_txtPrice);
		txtPrice.setColumns(10);

		JLabel lblSupplierID = new JLabel("Supplier ID");
		lblSupplierID.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_lblSupplierID = new GridBagConstraints();
		gbc_lblSupplierID.anchor = GridBagConstraints.WEST;
		gbc_lblSupplierID.insets = new Insets(0, 0, 5, 5);
		gbc_lblSupplierID.gridx = 1;
		gbc_lblSupplierID.gridy = 13;
		panel_3.add(lblSupplierID, gbc_lblSupplierID);

		txtSupplierID = new JTextField();
		GridBagConstraints gbc_txtSupplierID = new GridBagConstraints();
		gbc_txtSupplierID.insets = new Insets(0, 0, 5, 5);
		gbc_txtSupplierID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSupplierID.gridx = 3;
		gbc_txtSupplierID.gridy = 13;
		panel_3.add(txtSupplierID, gbc_txtSupplierID);
		txtSupplierID.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtID.setText("");
				txtName.setText("");
				txtQuantity.setText("");
				txtPrice.setText("");
				txtSupplierID.setText("");
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.anchor = GridBagConstraints.NORTH;
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridx = 2;
		gbc_btnClear.gridy = 15;
		panel_3.add(btnClear, gbc_btnClear);

		JPanel panel = new JPanel();

		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblAddItemtoDB = new JLabel("Add Item to Database");
		panel.add(lblAddItemtoDB);

		btnDbAdd = new JButton("DB Add");
		panel.add(btnDbAdd);

		JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_4.add(panel_2, BorderLayout.NORTH);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 299, 106, 98, 0, 30, 30 };
		gbl_panel_2.rowHeights = new int[] { 40, 30, 30, 30, 15, 15, 30, 30, 0 };
		gbl_panel_2.columnWeights = new double[] { 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblNewLabel_8 = new JLabel("Search Tools");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 0;
		panel_2.add(lblNewLabel_8, gbc_lblNewLabel_8);

		JLabel lblSelectThe = new JLabel("Select Type of Search to be Performed:");
		lblSelectThe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblSelectThe = new GridBagConstraints();
		gbc_lblSelectThe.anchor = GridBagConstraints.WEST;
		gbc_lblSelectThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectThe.gridx = 0;
		gbc_lblSelectThe.gridy = 1;
		panel_2.add(lblSelectThe, gbc_lblSelectThe);

		btnID = new JRadioButton("Tool Id", false);
		GridBagConstraints gbc_btnID = new GridBagConstraints();
		gbc_btnID.anchor = GridBagConstraints.WEST;
		gbc_btnID.insets = new Insets(0, 0, 5, 5);
		gbc_btnID.gridx = 0;
		gbc_btnID.gridy = 3;
		panel_2.add(btnID, gbc_btnID);

		btnName = new JRadioButton("Tool Name", false);
		GridBagConstraints gbc_btnName = new GridBagConstraints();
		gbc_btnName.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnName.insets = new Insets(0, 0, 5, 5);
		gbc_btnName.gridx = 0;
		gbc_btnName.gridy = 4;
		panel_2.add(btnName, gbc_btnName);

		btnSupplier = new JRadioButton("Supplier ID", false);
		btnSupplier.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnSupplier = new GridBagConstraints();
		gbc_btnSupplier.insets = new Insets(0, 0, 5, 5);
		gbc_btnSupplier.anchor = GridBagConstraints.WEST;
		gbc_btnSupplier.gridx = 0;
		gbc_btnSupplier.gridy = 5;
		panel_2.add(btnSupplier, gbc_btnSupplier);

		bgroup = new ButtonGroup();
		bgroup.add(btnID);
		bgroup.add(btnName);
		bgroup.add(btnSupplier);

		JLabel lblEnterTheSearch = new JLabel("Enter the Search Parameter");
		lblEnterTheSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEnterTheSearch = new GridBagConstraints();
		gbc_lblEnterTheSearch.anchor = GridBagConstraints.WEST;
		gbc_lblEnterTheSearch.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterTheSearch.gridx = 0;
		gbc_lblEnterTheSearch.gridy = 6;
		panel_2.add(lblEnterTheSearch, gbc_lblEnterTheSearch);

		setTxtSearchInput(new JTextField());
		GridBagConstraints gbc_txtSearchInput = new GridBagConstraints();
		gbc_txtSearchInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchInput.insets = new Insets(0, 0, 5, 5);
		gbc_txtSearchInput.gridx = 0;
		gbc_txtSearchInput.gridy = 7;
		panel_2.add(getTxtSearchInput(), gbc_txtSearchInput);
		getTxtSearchInput().setColumns(10);

		btnSearch = new JButton("Search");
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.anchor = GridBagConstraints.WEST;
		gbc_btnSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearch.gridx = 1;
		gbc_btnSearch.gridy = 7;
		panel_2.add(btnSearch, gbc_btnSearch);

		JButton btnClearSearch = new JButton("Clear Search");
		btnClearSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
//				DefaultTableModel tablemodel = (DefaultTableModel) view.table.getModel();
//				TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tablemodel);

				TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) table.getRowSorter();
				table.setRowSorter(sorter);

				tableModel.setRowCount(0);
				bgroup.clearSelection();
				txtSearchInput.setText("");
				sorter.setRowFilter(null);
			}
		});

		GridBagConstraints gbc_btnClearSearch = new GridBagConstraints();
		gbc_btnClearSearch.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnClearSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btnClearSearch.gridx = 2;
		gbc_btnClearSearch.gridy = 7;
		panel_2.add(btnClearSearch, gbc_btnClearSearch);

		JLabel lblSearchResults = new JLabel("Search Results");
		lblSearchResults.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblSearchResults = new GridBagConstraints();
		gbc_lblSearchResults.fill = GridBagConstraints.VERTICAL;
		gbc_lblSearchResults.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchResults.gridx = 0;
		gbc_lblSearchResults.gridy = 8;
		panel_2.add(lblSearchResults, gbc_lblSearchResults);

		btnLoad = new JButton("Load Data");

		GridBagConstraints gbc_btnLoad = new GridBagConstraints();
		gbc_btnLoad.anchor = GridBagConstraints.WEST;
		gbc_btnLoad.fill = GridBagConstraints.VERTICAL;
		gbc_btnLoad.insets = new Insets(0, 0, 0, 5);
		gbc_btnLoad.gridx = 1;
		gbc_btnLoad.gridy = 8;
		panel_2.add(btnLoad, gbc_btnLoad);

		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));

		table = new JTable();
		table.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Tool ID", "Tool Name", "Quantity", "Price", "Supplier ID" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, Integer.class, Double.class,
					Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setBackground(UIManager.getColor("CheckBox.background"));

		DefaultTableModel tablemodel = (DefaultTableModel) table.getModel();
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tablemodel);
		table.setRowSorter(sorter);

		panel_5.add(table, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(table);
		panel_5.add(scrollPane, BorderLayout.CENTER);
	}

	void registerSearchListener(ActionListener ac) {
		btnSearch.addActionListener(ac);
	}

	void registerLoadListener(ActionListener ac) {
		btnLoad.addActionListener(ac);
	}

// change to DBAdd
	void registerAddtoDataBase(ActionListener z) {
		btnDbAdd.addActionListener(z);
	}

	public JTextField getTxtSearchInput() {
		return txtSearchInput;
	}

	public void setTxtSearchInput(JTextField txtSearchInput) {
		this.txtSearchInput = txtSearchInput;
	}
}
