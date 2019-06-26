public class AppRunner {
	public static void main(String args[]) {
		MyView2 view = new MyView2();
		view.setVisible(true);
		InventoryManager inventory = new InventoryManager();
		inventory.createTable();
		inventory.fillTable();

//		inventory.addItemz(new Tool(2222, "wwww", 77, 45.36, 3333));

		MyController control = new MyController(view, inventory);

	}
}
