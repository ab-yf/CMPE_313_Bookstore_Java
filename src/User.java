class User {
	int UserID;
	String Username="";
	String Pass="";
	ShoppingCart UserCart;
	//Constructors
	
	User(String a,String b,ShoppingCart c,int d){this.Pass=a;this.Username=b;this.UserCart=c;this.UserID=d;}
	User(String a,String b,int c){this.Pass=a;this.Username=b;this.UserID=c;}
	User(){this.Username="";}
	User(String a){this.Username="";}
	//ToString
	public String toString() {
		String temp= "User: "+this.Username+" Pass: "+this.Pass+" ID:"+this.UserID;
		return temp;}
	//Setter Methods
	void setPass(String a) {this.Pass=a;}
	void setUsername(String a){this.Username=a;}
	void setCart(ShoppingCart a) {this.UserCart=a;}
	//Getter Methods
	String getUname() {return this.Username;}
	
	String getPass() {return this.Pass;}
	
	int getID() {return this.UserID;}
	int getCartID() {return this.UserCart.CartID;}




}