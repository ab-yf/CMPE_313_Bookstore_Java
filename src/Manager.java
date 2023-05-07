
public class Manager{
		int ManagerID;
		String Username="";
		String Pass="";
		//Constructors
		Manager(String a,String b,int c){this.Pass=a;this.Username=b;this.ManagerID=c;}
		Manager(){this.Username="";}
		Manager(String a){this.Username=a;}
		//ToString
		public String toString() {
			String temp= "User: "+this.Username+" Pass: "+this.Pass+" ID:"+this.ManagerID;
			return temp;}
		//Setter Methods
		void setPass(String a) {this.Pass=a;}
		void setUname(String a){this.Username=a;}
		//Getter Methods
		String getUname() {return this.Username;}
		
String getPass() {return this.Pass;}

int getID() {return this.ManagerID;}
}
