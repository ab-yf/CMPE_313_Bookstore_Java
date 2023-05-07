
public class Stock {
int StockID;
String BookName;
Double Price;
int StockCount;
String Category;
//Constructors
Stock(String a,String b,Double c,int d,int e){this.BookName=a;this.Category=b;this.Price=c;this.StockCount=d;this.StockID=e;}

//ToString
public String toString() {
	String temp= "BookName: "+this.BookName+" Price: "+this.Price+"Amount: "+this.StockCount+" ID:"+this.StockID;
	return temp;}

//Getter Setter AutoComplete
public int getStockID() {
	return StockID;
}
public void setStockID(int stockID) {
	StockID = stockID;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public Double getPrice() {
	return Price;
}
public void setPrice(Double price) {
	this.Price = price;
}
public int getStockCount() {
	return StockCount;
}
public void setStockCount(int stockCount) {
	StockCount = stockCount;
}
public void StockUp(){this.StockCount++;}
public void StockDown() {this.StockCount--;}

}
