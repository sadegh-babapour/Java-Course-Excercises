import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// Lab 10 - In Lab Exercise 1

// This program allows you to create and manage a store inventory database.
// It creates a database and data table, then populates that table with tools from
// items.txt.
public class InventoryManager {

	public Connection jdbc_connection;
	public Statement statement;
	public PreparedStatement preparedStatement;
	public String databaseName = "InventoryDB", tableName = "ToolTable",
			dataFile = "C:\\Users\\Nano\\eclipse-workspace\\MyProject222\\src\\ItemsNew.txt";

	// Students should configure these variables for their own MySQL environment
	// If you have not created your first database in mySQL yet, you can leave the
	// "[DATABASE NAME]" blank to get a connection and create one with the
	// createDB() method.
	public String connectionInfo = "jdbc:mysql://localhost:3306/InventoryDB", login = "root", password = "qaz123";

	public InventoryManager() {
		try {
			// If this throws an error, make sure you have added the mySQL connector JAR to
			// the project
			Class.forName("com.mysql.jdbc.Driver");

			// If this fails make sure your connectionInfo and login/password are correct
			jdbc_connection = DriverManager.getConnection(connectionInfo, login, password);
			System.out.println("Connected to: " + connectionInfo + "\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Use the jdbc connection to create a new database in MySQL.
	// (e.g. if you are connected to "jdbc:mysql://localhost:3306", the database
	// will be created at "jdbc:mysql://localhost:3306/InventoryDB")
	public void createDB() {
		try {
			statement = jdbc_connection.createStatement();
			statement.executeUpdate("CREATE DATABASE " + databaseName);
			System.out.println("Created Database " + databaseName);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Create a data table inside of the database to hold tools
	public void createTable() {
		String sql = "CREATE TABLE " + tableName + "(" + "ID INT(4) NOT NULL, " + "TOOLNAME VARCHAR(20) NOT NULL, "
				+ "QUANTITY INT(4) NOT NULL, " + "PRICE DOUBLE(5,2) NOT NULL, " + "SUPPLIERID INT(4) NOT NULL, "
				+ "PRIMARY KEY ( id ))";
		try {
			statement = jdbc_connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("Created Table " + tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Removes the data table from the database (and all the data held within it!)
	public void removeTable() {
		String sql = "DROP TABLE " + tableName;
		try {
			statement = jdbc_connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("Removed Table " + tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Fills the data table with all the tools from the text file 'items.txt' if
	// found
	public void fillTable() {
		try {
			Scanner sc = new Scanner(new FileReader(dataFile));
			while (sc.hasNext()) {
				String toolInfo[] = sc.nextLine().split(";");
				addItem(new Tool(Integer.parseInt(toolInfo[0]), toolInfo[1], Integer.parseInt(toolInfo[2]),
						Double.parseDouble(toolInfo[3]), Integer.parseInt(toolInfo[4])));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("File " + dataFile + " Not Found!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 Add a tool to the database table
	public void addItem(Tool tool) {
		String sql = "INSERT INTO " + tableName + " VALUES ( " + tool.getID() + ", '" + tool.getName() + "', "
				+ tool.getQuantity() + ", " + tool.getPrice() + ", " + tool.getSupplierID() + ");";
		try {
			statement = jdbc_connection.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addItemz(Tool tool) {
//		String insertTableSQL = "INSERT INTO " + databaseName + " " + tableName + " "
//				+ "(ID, TOOLNAME, QUANTITY, PRICE, SUPPLIERID) VALUES" + "(?,?,?,?,?)";
		String query = " insert into tooltable (id, toolname, quantity, price, supplierid)" + " values (?, ?, ?, ?, ?)";

		try {
			preparedStatement = jdbc_connection.prepareStatement(query);

			preparedStatement.setInt(1, tool.getID());
			preparedStatement.setString(2, tool.getName());
			preparedStatement.setInt(3, tool.getQuantity());
			preparedStatement.setDouble(4, tool.getPrice());
			preparedStatement.setInt(5, tool.getSupplierID());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet printTable() {
		try {
			String sql = "SELECT * FROM " + tableName;
			statement = jdbc_connection.createStatement();
			ResultSet tools = statement.executeQuery(sql);

			return tools;
		} catch (Exception e) {
			System.out.println("llllllll");
			return null;
		}

	}

	// This method should search the database table for a tool matching the toolID
	// parameter and return that tool.
	// It should return null if no tools matching that ID are found.
	public Tool searchTool(int toolID) {
		String sql = "SELECT * FROM " + tableName + " WHERE ID=" + toolID;
		ResultSet tool;
		try {
			statement = jdbc_connection.createStatement();
			tool = statement.executeQuery(sql);
			if (tool.next()) {
				return new Tool(tool.getInt("ID"), tool.getString("TOOLNAME"), tool.getInt("QUANTITY"),
						tool.getDouble("PRICE"), tool.getInt("SUPPLIERID"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
