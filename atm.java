package com.java.collect;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
public class atm {
	private static final Statement ATM = null;
	private static final AbstractButton amount = null;
	private static final String Color = null;

	public static void main(String args[]){
        firstscreen();

}
static void firstscreen(){
    JFrame f=new JFrame("MY ATM");
    JLabel l1,l2;
    l1= new JLabel("Enter Your ATM Number");
    l2= new JLabel ("Welcome To Union Bank Of India");
    l1.setVerticalAlignment(SwingConstants.BOTTOM);
    l2.setVerticalAlignment(SwingConstants.BOTTOM);
    JTextField tf1=new JTextField();
    tf1.setBounds(50,240, 320,50);
    l1.setBounds(130,140,300,90);
    l2.setBounds(120,100,300,90);
    JButton c1=new JButton(" Next");
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    JButton b7=new JButton("7");
    JButton b8=new JButton("8");
    JButton b9=new JButton("9");
    JButton b0=new JButton ("0");
    JButton b00=new JButton (".");
    JButton bq=new JButton ("00");
    
    
    
    
	
    
    
    
    
    b1.setBounds(50, 350, 100 , 40);
   
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"1");
        }

		public void actionPerformed1(ActionEvent e) {
			String txt=tf1.getText();
            tf1.setText(txt+"1");
			
		}});


    b2.setBounds(160, 350, 100, 40);

    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"2");
        }});


    b3.setBounds(270, 350, 100 , 40);
    b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"3");
        }});




    b4.setBounds(50, 410, 100, 40);
    b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"4");
        }});


    b5.setBounds(160, 410, 100, 40);
    b5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"5");
        }});

    b6.setBounds(270, 410, 100, 40);
    b6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"6");
        }});
    b7.setBounds(50, 470, 100, 40);
    b7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"7");
        }});
    b8.setBounds(160, 470, 100, 40);
    b8.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"8");
        }});
    b9.setBounds(270, 470, 100, 40);
    b9.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"9");
        }});
    b0.setBounds(160, 530, 100, 40);
    b0.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"0");
        }});
    
    
    
    
    b00.setBounds(50, 530, 100, 40);
    b00.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+".");
        }});
    
    
    
    bq.setBounds(270, 530, 100, 40);
    bq.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"00");
        }});

    c1.setBounds(160, 600, 100, 40);
    c1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String atm_number = tf1.getText();

            boolean flag=false;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_card", "root", "");
                PreparedStatement ps=con.prepareStatement("SELECT id from atm_cards where atm_number=?");
                ps.setString(1,atm_number);
                ResultSet rs=ps.executeQuery();
                while (rs.next()) {
                    flag=true;
                }
                if (flag){

                   JOptionPane.showMessageDialog(c1,"Account Match");
                    secondscreen(atm_number);
                    f.dispose();

                }else {
                    JOptionPane.showMessageDialog(c1,"Account Not Match");
                }
                con.close();
            } catch (Exception exception) {
                exception.printStackTrace();

            }}
    });



    f.add(l1);
    f.add(l2);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(b00);
    f.add(b0);
    f.add(bq);
    f.add(tf1);
    f.add(c1);




    f.setSize(1366,768);
    f.setLayout(null);
    f.setVisible(true);
}

static void secondscreen(String atm_num){
    JFrame f=new JFrame("MY ATM");
    JLabel l1;
    l1= new JLabel("Please Enter youe ATM Pin");
    l1.setVerticalAlignment(SwingConstants.BOTTOM);
    JTextField tf1=new JTextField();
    tf1.setBounds(50,240, 320,50);
  //  l1.setBounds(130,100,300,90);
    l1.setBounds(130,140,300,90);
    JButton c1=new JButton("Next");
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    JButton b7=new JButton("7");
    JButton b8=new JButton("8");
    JButton b9=new JButton("9");
    JButton b0=new JButton ("0");
    JButton b00=new JButton (".");
    JButton bq=new JButton ("00");

    b1.setBounds(50, 350, 100 , 40);
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"1");
        }});


    b2.setBounds(160, 350, 100, 40);

    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"2");
        }});


    b3.setBounds(270, 350, 100 , 40);
    b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"3");
        }});




    b4.setBounds(50, 410, 100, 40);
    b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"4");
        }});


    b5.setBounds(160, 410, 100, 40);
    b5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"5");
        }});

    b6.setBounds(270, 410, 100, 50);
    b6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"6");
        }});
    b7.setBounds(50, 470, 100, 40);
    b7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"7");
        }});
    b8.setBounds(160, 470, 100, 40);
    b8.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"8");
        }});
    b9.setBounds(270, 470, 100, 40);
    b9.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"9");
        }});
    b0.setBounds(160, 530, 100, 40);
    b0.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"0");
        }});
    
    
    b00.setBounds(50, 530, 100, 40);
    b00.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+".");
        }});
    
    
    
    bq.setBounds(270, 530, 100, 40);
    bq.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String txt=tf1.getText();
            tf1.setText(txt+"00");
        }});

    c1.setBounds(160, 300, 100, 40);
    c1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String atm_pin = tf1.getText();

            boolean flag=false;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_card", "root", "");
                PreparedStatement ps=con.prepareStatement("SELECT id from atm_cards where atm_number=? and atm_pin=?");
                ps.setString(1,atm_num);
                ps.setString(2,atm_pin);
                ResultSet rs=ps.executeQuery();
                while (rs.next()) {
                    flag=true;
                }
                if (flag){

                    JOptionPane.showMessageDialog(c1,"Account Match");
                   
					thirdscreen(atm_num ,atm_pin);
                    f.dispose();

                }else {
                    JOptionPane.showMessageDialog(c1,"Account Not Match");
                }
                con.close();
            } catch (Exception exception) {
                exception.printStackTrace();

            }
            }
    });



    f.add(l1);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(b0);
    f.add(b00);
    f.add(bq);
    f.add(tf1);
    f.add(c1);
    f.setSize(1366,768);
    f.setLayout(null);
    f.setVisible(true);
}
static void thirdscreen(String atm_number, String atm_pin) {
    JFrame f = new JFrame("MY ATM");
    JLabel l3 = new JLabel("Bank Balance");
    l3.setBounds(160, 200, 100, 40);

    JTextField tf4 = new JTextField();
    tf4.setBounds(50,240, 320,50);
                                                                                        //Deposit
    JButton p = new JButton("Deposit");
    p.setBounds(270, 350, 100, 40);
    
    p.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent actionEvent ) {
			String deposit_money = tf4.getText();
			double current_balance = 0;
			int user_id=0;
			Date dt = new Date();
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_card", "root", "");
	             PreparedStatement ps = con.prepareStatement("SELECT id,balance from atm_cards where atm_number=? and atm_pin=?");
	             ps.setString(1, atm_number);
	             ps.setString(2, String.valueOf(atm_pin));
	             ResultSet gs = ps.executeQuery();
	             while (gs.next()) {
	            	 current_balance = gs.getDouble("balance");
	            	 user_id = gs.getInt("id");
	             	 
	             }
	             current_balance = current_balance + Double.parseDouble(deposit_money);
	             PreparedStatement ps2 = con.prepareStatement("update atm_cards set balance=? where atm_number=? and atm_pin=?");
	             PreparedStatement ps3 = con.prepareStatement("insert into id? (date,credit,balance) values(?,?,?)");
	             ps3.setInt(1, user_id);
	             ps3.setString(2,dt.toString());
	             ps3.setString(3, deposit_money);
	             ps3.setDouble(4, current_balance);
	             ps2.setString(1, String.valueOf(current_balance));
	             ps2.setString(2,atm_number);
	             ps2.setString(3, String.valueOf(atm_pin));
	             ps2.executeUpdate();
	             ps3.executeUpdate();
	             tf4.setText("₹ " + current_balance);
	             con.close();
			} catch(
					 Exception exception) {
                exception.printStackTrace();
			}
			
		}
    	
    });
                                                                                //Withdraw
  
    JButton i = new JButton("Withdraw ");
    i.setBounds(58, 440, 100, 40);
                                                                                     
    i.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String withdraw_money = tf4.getText();
            double current_balance = 0;
           
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_card", "root", "");
                PreparedStatement ps = con.prepareStatement("SELECT balance from atm_cards where atm_number=? and atm_pin=?");
                ps.setString(1, atm_number);
                ps.setString(2, String.valueOf(atm_pin));
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    current_balance = rs.getDouble("balance");
                    
                    
                    double temp = current_balance;
                    current_balance = current_balance - Double.parseDouble(withdraw_money);
                    if (temp - (current_balance) == Double.parseDouble(withdraw_money)) {
                        JOptionPane.showMessageDialog(i, "withdraw Successful");
                    }
                    
                
                    
                }
                current_balance = current_balance - Double.parseDouble(withdraw_money);
                PreparedStatement ps1 = con.prepareStatement("update atm_cards set balance=? where atm_number=? and atm_pin=?");
            
                
                
               
                
                
                
                
                ps1.setString(1, String.valueOf(current_balance));
                ps1.setString(2, atm_number);
                ps1.setString(3, String.valueOf(atm_pin));
                ps1.executeUpdate();
                tf4.setText("₹ " + current_balance); 
                
                con.close();
            } catch (
                    Exception exception) {
                exception.printStackTrace();
            }

        }
           
    });
                                            
   
  JButton t = new JButton("Transfer");
  t.setBounds(58,350,100,40);
  t.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				transfer_screen(atm_number,atm_pin);
				f.dispose();
				
			} 
});
                                                                     //quiet
        JButton q = new JButton("Exit");
        q.setBounds(270,440,100,40);
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==q){
                    JOptionPane.showMessageDialog(q,"are you Exit");
                    f.dispose();
                    firstscreen();
                }
            }
        });
        
        f.add(tf4);
        f.add(l3);
        f.add(p);
        f.add(i);
        f.add(t);
        f.add(q);
        f.setSize(1366,768);
        f.setLayout(null);
        f.setVisible(true);
        
        
        
        } 

                                                                            //Transfer

static void transfer_screen(String atm_number,String atm_pin) {
	JLabel l5,l6;
	 l5= new JLabel("Enter Your Account Number");
	 l6= new JLabel ("Enter Amount You Want to Transfer");
	
	 l5.setBounds(120,140,300,90);
	 
	    l6.setBounds(100,30,300,90);
	
    JFrame tf4 = new JFrame("");

    
    JTextField tf5 = new JTextField();
    tf5.setBounds(100, 100, 200, 50);

    
    JTextField tf6 = new JTextField();
    tf6.setBounds(100, 200, 200, 50);


    JButton t = new JButton("Transfer");
    t.setBounds(95, 280, 100, 40);
  
    
    
    JButton z =new JButton("History");
    z.setBounds(204,280,100,40);
    z.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			history(atm_number, atm_pin);
			
		}
  });   
    t.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int in_amount = Integer.parseInt(tf5.getText());
          
            String in_account = tf6.getText();
            System.out.println(in_account);
            int self_balance = 0;
            int current_rec_balance = 0;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_card", "root", "");
                PreparedStatement ps=con.prepareStatement("select balance from atm_cards where atm_number=? and atm_pin=?");
                ps.setString(1,atm_number);
                ps.setString(2,atm_pin);
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    self_balance = Integer.parseInt(rs.getString("balance"));
                }
                self_balance = self_balance - in_amount;
              
                PreparedStatement ps1=con.prepareStatement("update atm_cards set balance=? where atm_number=? and atm_pin=?");
                ps1.setInt(1,self_balance);
                ps1.setString(2,atm_number);
                ps1.setString(3,atm_pin);
                ps1.executeUpdate();
                PreparedStatement ps2=con.prepareStatement("select balance from atm_cards where account_number=?");
                ps2.setString(1,in_account);
                ResultSet rs1 = ps2.executeQuery();
                while (rs1.next()){
                    current_rec_balance = Integer.parseInt(rs1.getString("balance"));
                }
                current_rec_balance = current_rec_balance + in_amount;
                PreparedStatement ps3=con.prepareStatement("update atm_cards set balance=? where account_number=?");
                ps3.setInt(1,current_rec_balance);
                ps3.setString(2,in_account);
                ps3.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    });


tf4.add(tf5);
tf4.add(tf6);
tf4.add(t);
tf4.add(z);
tf4.add(l5);
tf4.add(l6);
tf4.setSize(900,900);
tf4.setLayout(null);
tf4.setVisible(true);

}                                          
                                                                                              // History




static void history(String atm_number, String atm_pin) {
	String data[][] = new String[25][3];
	String cols[] = {"ID","DATE","CREDIT"};
	JFrame jFrame = new JFrame();
	JTable jTable = new JTable(data,cols);
	JScrollPane jScrollPane = new JScrollPane(jTable);
	jScrollPane.setBounds(10,10,500,1000);
	jFrame.add(jScrollPane);
	
	 
     
  
	jFrame.setSize(1366,768);
	jFrame.setLayout(null);
	jFrame.setVisible(true);
	
	 try {
		 int user_id=0;
		 Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_card", "root", "");
         PreparedStatement ps1 = con.prepareStatement("select id from atm_cards where atm_number=? and atm_pin=?");
         ps1.setString(1, atm_number);
         ps1.setString(2, atm_pin);
         ResultSet rSet = ps1.executeQuery();
         while(rSet.next()) {
        	 user_id = rSet.getInt("id");
         }
         PreparedStatement pn = con.prepareStatement("SELECT id,date,credit,debit,balance from id?");
            pn.setInt(1,user_id);
            ResultSet rs=pn.executeQuery();
            int i=0;
            while (rs.next()) {
                for (int j=0; j<4; j++){
                    data[i][j] = rs.getString(j+1);
                }
                i++;
            }

            con.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
	
}
}



















