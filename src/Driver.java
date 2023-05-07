
import java.awt.EventQueue;


public class Driver {
    //Count goes up each time an object is created
	static int UserID=0;
	static int ManagerID=0;
	static int StockID=0;
	static int CartID=0;
	
	//Stores some objects
static User[] Users= new User[99];
static Manager[] Managers= new Manager[99];
static Stock[] Inventory= new Stock[99];
static ShoppingCart[] Carts= new ShoppingCart[99];
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	//Manually Populating Users, Managers, Stock, and a few Carts
		addUser("Adam","passAdam123"); //1
		addUser("Bob","passBob123"); //2
		addUser("Charlie","passCharlie123"); //3
		addUser("David","passDavid123"); //4
		addUser("Eddie","passEddie123"); //5
		//
		addManager("Rep. Adam","passRepAdam123"); //1
		addManager("Rep. Bob","passRepBob123"); //2
		//
		addStock("Da Vinci Code for Dummies","Bad",11.11,11); //1
		addStock("Kite Runner","Good",32.21,21); //2
		addStock("Fifty Shades","Bad",69.0,53); //3
		addStock("Harry Potter 1","Bad",42.0,42); //4
		addStock("Mockingbird","Good",31.13,47); //5
		addStock("Hannibal","Good",89.25,90); //6
		addStock("How to Steal Books","Bad",0.0,0); //7
		addStock("Hunger Games","Good",18.85,24); //8
		//
		addCart(Users[2]); //1
		addCart(Users[4]); //2
		addCart(Users[5]); //3
	// UI Stuff beginnings
	EventQueue.invokeLater(new Runnable() {
	public void run() {
		try {
			MainWin main= new MainWin(Users,Managers,Inventory,Carts);
			} catch (Exception e) {
				e.printStackTrace();
				}}});
	
	}
	
	
	static void addUser(String a,String b) {
		User temp= new User(a,b,UserID);
		Users[UserID]=temp;
		UserID++;
	}
	static void addManager(String a,String b) {
		Manager temp= new Manager(a,b,ManagerID);
		Managers[ManagerID]=temp;
		ManagerID++;
	}
	static void addStock(String a,String b, Double c,int d) {
		Stock temp= new Stock(a,b,c,d,StockID);
		Inventory[StockID]=temp;
		StockID++;
	}
	static void addCart(User a) {
		ShoppingCart temp= new ShoppingCart(a,CartID);
		Carts[CartID]=temp;
		CartID++;
	}
	
}