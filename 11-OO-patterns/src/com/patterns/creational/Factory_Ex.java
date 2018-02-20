package com.patterns.creational;

//--------------------------------------------------
// factory class
class OracleConnectionFactory {

	// factory-method
	public static String getConnection() {
		// steps to create connection
		return "Oracle connection";
	}

}
// --------------------------------------------------

class AccountRepository {
	public void loadAccount(String num) {
		// need oracle-connection
		String con = OracleConnectionFactory.getConnection(); // invoking factory-method
	}

	public void updateAccount() {
		// need oracle-connection
		String con = OracleConnectionFactory.getConnection(); // invoking factory-method
	}
}
// --------------------------------------------------------

// ---------------------------------------------------------------------------------
interface Menu {}
class Veg implements Menu {}
class NonVeg implements Menu {}

class ChefFactory {
	public static Menu getMenu(String menuType) {
		switch (menuType) {
		case "meals":
			return new Veg();
		case "biryani":
			return new NonVeg();
		default:
			return null;
		}
	}
}
// -------------------------------------------------------------------------------
public class Factory_Ex {
	public static void main(String[] args) {
		// Table-1
		// -------------------------------------------------------
		String menuPreference = "meals";
		Menu menu = ChefFactory.getMenu(menuPreference);
		if (menu instanceof Veg) {
			System.out.println("Factory retured Veg menu..");
		}
		// --------------------------------------------------------
		// Table-2
		// -------------------------------------------------------
		menuPreference = "biryani";
		menu = ChefFactory.getMenu(menuPreference);
		if (menu instanceof NonVeg) {
			System.out.println("Factory retured NonVeg menu..");
		}
		// --------------------------------------------------------
	}
}
