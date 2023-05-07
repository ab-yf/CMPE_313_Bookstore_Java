import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMainWin {

	@Test
	void testMainWin() {
		MainWin MainWin = new MainWin(null, null, null, null);
		fail("Not yet implemented");
	}
	
	//Browse Function Assertions
	//Tests that the Array being displayed by JTable has all the books from the selected category, by doing a fresh search.
	void testTable() {
		try {
			MainWin test= new MainWin(Driver.Users, Driver.Managers, Driver.Inventory,Driver.Carts);
			} catch (Exception e) {
				e.printStackTrace();
				}
		
// 1. Check the Checkbox selected Item
// 2. Create a new array of all books from Stock with selected Category (fresh check)
// 3. Pull array of all books displayed on JTable
// 4. assertArrayEquals(String "Displayed Books are of the right category?", Check[],JTable[]) to check the two arrays against each other.
//  This will tell us if the list of books being displayed is current.
		
	}
	
	//Tests that the category of the Selected Item on Checkbox, is the same as the category of the first book shown.
	void testCheckbox() {	
		try {
		MainWin test= new MainWin(Driver.Users, Driver.Managers, Driver.Inventory,Driver.Carts);
		} catch (Exception e) {
			e.printStackTrace();
			}
		
	}
	
	void test3() {}
	
	void test4() {}
	
	void test5() {}
	
	
	// Tests whether or not the Test window is able to be opened.
	void testWindowOpened() {
		try {
			MainWin test= new MainWin(Driver.Users, Driver.Managers, Driver.Inventory,Driver.Carts);
			fail("My program did not throw an exception!");
			} catch (Exception e) {
				e.printStackTrace();
				}
	}
	
	
	
	
	
	
	
//	static void assertArrayEquals(String message, array[],array[]){
	



}
	
	
	
	
	
//assertEquals(Object expected, Object actual){}
//assertSame(String,Object expected, Object actual){}

