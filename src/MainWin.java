
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.AbstractTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;

public class MainWin {
	
	
	
	
	
	
	
	
//	Double sub=0.0,prod=0.0,kval=0.0;
	//Arrays from Driver
	User[] UsersFinger;
	Manager[] ManagersFinger;
	Stock[] InventoryFinger;
	ShoppingCart[] CartsFinger;
	//
	JFrame fr = new JFrame();
	JPanel cards= new JPanel(new CardLayout()); //CardLayoutContainer
	JPanel startpan= new JPanel();
	JPanel pan1=new JPanel();
	JPanel pan2=new JPanel();
	JPanel pan3=new JPanel();
	//Test stuff below
	//
	//Card Layout Set
	CardLayout cl = (CardLayout) (cards.getLayout());
	
	/// Test Buttons on start panel (Comment out later)
	JButton but1= new JButton("User View");
	JButton but2= new JButton("Manager View");
	JButton but3= new JButton("Shopping Cart");
	//
	
	
	//Constructor
	public MainWin(User[] a,Manager[] b,Stock[] c,ShoppingCart[] d) {
		
		//Get "Pointers" of drivers arrays
		UsersFinger=a;
		ManagersFinger=b;
		InventoryFinger=c;
		CartsFinger=d;
		//Frame Stuff
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("TEDU Books");
        fr.setSize(950,650);
        fr.setVisible(true);
        fr.setResizable(false); 
        fr.getContentPane().add(cards);
        //Setup inner Panels
        setupstartpan();
        setuppan1();
        setuppan2();
        setuppan3();
        cards.add(startpan,"startpan");
        
        //Card Layout Stuff
        cards.add(pan1,"pan1");
        cards.add(pan2,"pan2");
        cards.add(pan3,"pan3");
		cl.show(cards,"startpan");
	}
		//Panel 3 Shopping Cart Pan 
	private void setuppan3() {
		JTable table_CartList;
		//Table Model to put data into JTable
		@SuppressWarnings("serial")
		class CartTable extends AbstractTableModel{

			@Override
			public int getRowCount() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return 4;
			}

			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			
			
		}
		
		//JTable Model Stuff done
		table_CartList = new JTable(new CartTable());
		
		JComboBox<String> comboBoxAddBook = new JComboBox<String>();
		
		JComboBox<String> comboBoxRemoveBook = new JComboBox<String>();
		
		JButton btnAdd = new JButton("Add");
		
		JButton btnRemove = new JButton("Remove");
		
		JButton back3 = new JButton("Back");
		//Declare all JComponents
				
		
		//Use a Layout or Bounds with no Layout
		
		//Group Layout Stuff
		GroupLayout layout3 = new GroupLayout(pan3);
		layout3.setHorizontalGroup(
			layout3.createParallelGroup(Alignment.LEADING)
				.addGroup(layout3.createSequentialGroup()
					.addGap(157)
					.addComponent(table_CartList, GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
					.addGap(76))
				.addGroup(layout3.createSequentialGroup()
					.addGap(73)
					.addGroup(layout3.createParallelGroup(Alignment.LEADING)
						.addGroup(layout3.createSequentialGroup()
							.addComponent(btnAdd)
							.addPreferredGap(ComponentPlacement.RELATED, 594, Short.MAX_VALUE)
							.addComponent(btnRemove))
						.addGroup(layout3.createSequentialGroup()
							.addComponent(comboBoxAddBook, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
							.addGap(98)
							.addComponent(back3)
							.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
							.addComponent(comboBoxRemoveBook, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)))
					.addGap(155))
		);
		layout3.setVerticalGroup(
			layout3.createParallelGroup(Alignment.LEADING)
				.addGroup(layout3.createSequentialGroup()
					.addGap(27)
					.addComponent(table_CartList, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
					.addGap(91)
					.addGroup(layout3.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxRemoveBook, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxAddBook, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(back3))
					.addGap(18)
					.addGroup(layout3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnRemove))
					.addGap(54))
		);
		pan3.setLayout(layout3);
		 layout3.setAutoCreateGaps(true);
		 layout3.setAutoCreateContainerGaps(true);
		 
		//Actions Added Last
		 back3.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {cl.show(cards, "startpan");}});
		 
		
	}
		//Panel 2 Manager View Pan (Edit Stock)
	private void setuppan2() {
		//back button and action..
		JButton back2= new JButton("Back to Login");
		back2.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {cl.show(cards, "startpan");}});
		 //Declare all JComponents below
		
		//Use a Layout or Bounds with no Layout
		
		//GroupLayout stuff
		GroupLayout layout2 = new GroupLayout(pan2);
		layout2.setHorizontalGroup(
			layout2.createParallelGroup(Alignment.LEADING)
				.addGroup(layout2.createSequentialGroup()
					.addContainerGap()
					.addComponent(back2)
					.addContainerGap(837, Short.MAX_VALUE))
		);
		layout2.setVerticalGroup(
			layout2.createParallelGroup(Alignment.LEADING)
				.addGroup(layout2.createSequentialGroup()
					.addContainerGap()
					.addComponent(back2)
					.addContainerGap(587, Short.MAX_VALUE))
		);
		 pan2.setLayout(layout2);
		 layout2.setAutoCreateGaps(true);
		 layout2.setAutoCreateContainerGaps(true);

		 //
		 
		
	}
		//Panel 1 User View Pan (Browse Books)
	private void setuppan1() {
		//Table Model Class
		@SuppressWarnings("serial")
		class UserBookTable extends AbstractTableModel{

			@Override
			public int getRowCount() {
				// TODO Auto-generated method stub
				return InventoryFinger.length;
			}

			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return 4;
			}

			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				// TODO Auto-generated method stub
				//Switch case to switch between columns of diff data types
				switch(columnIndex+1) {
				case 1: // Book ID
				return InventoryFinger[rowIndex+1].StockID;
				case 2: // Book Name
				return InventoryFinger[rowIndex+1].BookName;
				case 3: // Book Price
				return InventoryFinger[rowIndex+1].Price;
				case 4: // Book Stock
				return InventoryFinger[rowIndex+1].StockCount;
				}
				return null;
			}
		}
		//back button and action
		JButton back1= new JButton("Back to Login");
		back1.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {cl.show(cards, "startpan");}});
		//Combo Box of Categories, and its action.
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"All", "Good", "Bad", "Favorited"}));
		//JTable below
		JTable tableAllBooks = new JTable(new UserBookTable());
		//Table Model to put data into JTable
				
					
					
		
		//Bounds
		tableAllBooks.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		//
		GroupLayout layout1 = new GroupLayout(pan1);
		layout1.setHorizontalGroup(
			layout1.createParallelGroup(Alignment.LEADING)
				.addGroup(layout1.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout1.createParallelGroup(Alignment.LEADING)
						.addComponent(back1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(tableAllBooks, GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
					.addContainerGap())
		);
		layout1.setVerticalGroup(
			layout1.createParallelGroup(Alignment.LEADING)
				.addGroup(layout1.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout1.createParallelGroup(Alignment.BASELINE)
						.addGroup(layout1.createSequentialGroup()
							.addComponent(back1)
							.addGap(3)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(tableAllBooks, GroupLayout.PREFERRED_SIZE, 573, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(587, Short.MAX_VALUE))
		);
		pan1.setLayout(layout1);
		 layout1.setAutoCreateGaps(true);
		 layout1.setAutoCreateContainerGaps(true);
		 //Actions should be added below
		 comboBox.addActionListener (new ActionListener () {
			    public void actionPerformed(ActionEvent e) {
			     //Get category selection and feed it to JTable somehow
			    	
			    	
			    	
			    }
			});
		
		// end of setup method	
	}
		//Login Panel
	private void setupstartpan() {
		//Login Page Textfields
		JTextField Uname_Field;
		JPasswordField passwordField;	
		//WindowBuilder is adding Login Page stuff below...
        Uname_Field = new JTextField();
        Uname_Field.setText("Username");
        Uname_Field.setBounds(337, 100, 96, 20);
        startpan.add(Uname_Field);
        Uname_Field.setColumns(15);
        
        passwordField = new JPasswordField();
        passwordField.setToolTipText("Password");
        passwordField.setBounds(337, 131, 96, 20);
        startpan.add(passwordField);
        
        JButton btnNewButton = new JButton("Login");
        btnNewButton.setBounds(337, 162, 89, 23);
        startpan.add(btnNewButton);
		
		//Other startpanel stuff
		startpan.setLayout(null);
		but1.setBounds(50,150,150,50);
		but2.setBounds(50,250,150,50);
		but3.setBounds(50,350,150,50);
	startpan.add(but1);
	startpan.add(but2);
	startpan.add(but3);
	but1.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {cl.show(cards, "pan1");}});
	but2.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {cl.show(cards, "pan2");}});
	but3.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {cl.show(cards, "pan3");}});
	}
}
