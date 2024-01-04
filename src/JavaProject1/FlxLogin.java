package JavaProject1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FlxLogin extends JFrame implements ActionListener,KeyListener,MouseListener {
	
	private static final Border Border = null;
	JLabel title,name,aadhar;
	JTextField tf1,tf2;
	JButton bt1,bt2;
	FlxLogin(){
		setSize(1900,1000);
		setTitle("My Insert frame");
		setLayout(null);
		title=new JLabel("Admin Entry");
		title.setBounds(600, 20, 300, 70);
		title.setFont(new Font("Arial",Font.BOLD,50));
		title.setForeground(Color.RED);
		add(title);
		name=new JLabel("Enter Name Please : ");
		name.setBounds(400, 100, 200, 40);
		name.setFont(new Font("Arial",Font.BOLD,18));
		
		add(name);
		tf1=new JTextField();
		tf1.setBounds(700, 100, 200, 40);
		add(tf1);
		aadhar=new JLabel("Enter Password Please : ");
		aadhar.setBounds(400, 200, 200, 40);
		aadhar.setFont(new Font("Arial",Font.BOLD,17));

		add(aadhar);
		tf2=new JTextField();
		tf2.setBounds(700, 200, 200, 40);
		add(tf2);
		bt1=new JButton("Login");
		bt1.setBounds(600, 300, 200, 40);
		bt1.setFont(new Font("Arial",Font.BOLD,30));
		bt1.setForeground(Color.white);
		bt1.setBackground(Color.RED);
		add(bt1);
		
		bt2=new JButton("Cancel");
		bt2.setBounds(850, 300, 200, 40);
		bt2.setFont(new Font("Arial",Font.BOLD,30));
		bt2.setForeground(Color.white);
		bt2.setBackground(Color.GREEN);
		add(bt2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	
		
	}
	public static void main(String[] args) {
		new FlxLogin();

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}

	public void mouseDragged(MouseEvent arg0) {
		
		
	}

	public void mouseMoved(MouseEvent arg0) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ar) {
		if (ar.getSource()==bt1){
		if (tf1.getText().equals("pass") && tf2.getText().equals("word")){
			JOptionPane.showMessageDialog(this,"Now you can add admin...");
			new AdminNewForm();
		}
		else{
			JOptionPane.showMessageDialog(this, "Wrong Credentials");
		}
		}
		if (ar.getSource()==bt2){
			new NewLoginForm();
			
			System.exit(1);
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
