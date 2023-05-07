import java.util.Stack;

public class ShoppingCart {
int CartID;
User Owner;
//Stock[] CartItems=new Stock[99];
Stack<Stock> CartItems= new Stack<Stock>();
int CartLastIndex=0;
ShoppingCart(User a,int b){this.Owner=a;this.CartID=b;}
//ToString
public String toString() {
	String temp= "Cart Owner: "+this.Owner.getUname()+" Owner ID: "+this.Owner.getID()+"Items in Cart: "+(this.CartLastIndex+1)+" CartID:"+this.CartID;
	return temp;}



//Add/Remove Items to from Cart
void AddItem(Stock a){this.CartItems.push(a);this.CartLastIndex++;}

void RemoveItem(Stock a) {this.CartItems.remove(a);}

void EmptyCart() {while(!this.CartItems.empty()) {
	this.CartItems.pop();
}
this.CartLastIndex=0;
}



//Auto Getter/Setters
public int getCartID() {
	return CartID;
}
public void setCartID(int cartID) {
	CartID = cartID;
}
public User getOwner() {
	return Owner;
}
public void setOwner(User owner) {
	Owner = owner;
}
public Stack<Stock> getCartItems() {
	return CartItems;
}
public void setCartItems(Stack<Stock> cartItems) {
	CartItems = cartItems;
}

}
