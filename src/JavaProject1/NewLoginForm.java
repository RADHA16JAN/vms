package JavaProject1;
//
//import java.awt.event.*;
//
//import javax.swing.*;
//
//public class NewLoginForm extends JFrame implements ActionListener {
//	JButton bt1,bt2;
//
//	NewLoginForm(){
//		setSize(700,700);
//		setLayout(null);
//		bt1= new JButton("Admin");
//	
//	add(bt1);
//	
//	bt1.addActionListener(this);
//	bt1.setBounds(70,210,100,40);
//	
//	bt2= new JButton("User");
//	add(bt2);
//	bt2.addActionListener(this);
//	bt2.setBounds(190,210,100,40);
//	
//	
//	setDefaultCloseOperation(EXIT_ON_CLOSE);
//	setVisible(true);
//	}
//	public static void main(String[] args) {
//		
//		new NewLoginForm();
//		
//	}
//
//
//	@Override
//	public void actionPerformed(ActionEvent ae) {
//	
//		if(ae.getSource()==bt2) {
//		 new VisitorAutomaticId();
//			//new Registration();
//		}
//		if(ae.getSource()==bt1) {
//			 new AdminLoginForNewAdmin();
//			//new Employ_insersion();
//		}
//		
//	}
//}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class NewLoginForm extends JFrame implements ActionListener {
	JButton bt1,bt2;

	NewLoginForm(){
		setSize(1900,1000);
		setLayout(null);
		bt1= new JButton("Admin");
		bt1.setFont(new Font("Arial",Font.BOLD,50));
	    add(bt1);
	bt1.addActionListener(this);
	bt1.setBounds(280,210,200,70);
	bt1.setBackground(Color.GRAY);
	bt1.setForeground(Color.WHITE);
	bt2= new JButton("User");
	add(bt2);
	bt2.addActionListener(this);
	bt2.setBounds(550,210,200,70);
	bt2.setBackground(Color.BLUE);
	bt2.setForeground(Color.WHITE);
	bt2.setFont(new Font("Arial",Font.BOLD,50));
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	public static void main(String[] args) {
		
		new NewLoginForm();
		
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==bt2) {
			
			new userMainwindow();
		}
		if(ae.getSource()==bt1) {
			new AdminLoginForNewAdmin();
		}
		
	}
}