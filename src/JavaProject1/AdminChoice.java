package JavaProject1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class AdminChoice extends JFrame implements ActionListener{

	JButton bt1,bt2;
	AdminChoice(){
		setSize(1900,1000);
		setLayout(null);
		setTitle("admin");
		
	
	bt2= new JButton("Add a New Admin");
	add(bt2);
	bt2.addActionListener(this);
	bt2.setBounds(700,210,400,70);
	bt2.setBackground(Color.BLUE);
	bt2.setForeground(Color.WHITE);
	bt2.setFont(new Font("Arial",Font.BOLD,50));
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	public static void main(String[] args) {
		new AdminChoice();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==bt2) {
			new AdminNewForm();
		}
		if(ae.getSource()==bt1) {
			new Mainwindow();
		}
	}

}
