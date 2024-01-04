package JavaProject1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class userMainwindow extends JFrame implements ActionListener{
	JMenu JM_Admin,JM_ComInfo,JM_Dep,JM_Dep_calender,JM_EmpDetails,JM_VisitorDetail,JM_hod;
	JMenuItem JMI_Update_Find,JMI_update_find,JMI_find_update2,JMI_find_update3,JMI_update_find4,JMI_update_find5,JMI_update_find6;
	JMenuBar JMenuBar;
	JButton JBtn_insert,JBtn_insert2,JBtn_delete,JBtn_delete2,JBtn_update,JBtn_update2,jbtn2;
	JLabel lbl_CheckIn,lbl_CheckOut;
	
	userMainwindow(){
		setSize(1900,1000);
		setTitle("MAIN");
		setLayout(null);
//		JM_Admin=new JMenu("Admin");
//		add(JM_Admin);
//		
//		JMI_Update_Find=new JMenuItem("FIND ");
//		JMI_Update_Find.addActionListener(this);
//		
//		JM_Admin.add(JMI_Update_Find);
//		JM_Admin.addSeparator();
		
		JM_Dep=new JMenu("Department");
		add(JM_Dep);
		
		JMI_find_update2=new JMenuItem("FIND ");
		JMI_find_update2.addActionListener(this);
		
		JM_Dep.add(JMI_find_update2);
		JM_Dep.addSeparator();
		
		JM_Dep_calender=new JMenu("DepatmentCalender");
		add(JM_Dep_calender);
		
		JMI_find_update3=new JMenuItem("FIND ");
		JMI_find_update3.addActionListener(this);
		
		JM_Dep_calender.add(JMI_find_update3);
		JM_Dep_calender.addSeparator();
		
		JM_EmpDetails=new JMenu("Employee Details");
		add(JM_EmpDetails);
		
		JMI_update_find4=new JMenuItem("FIND ");
		JMI_update_find4.addActionListener(this);
		
		JM_EmpDetails.add(JMI_update_find4);
		JM_EmpDetails.addSeparator();
		
		JM_VisitorDetail=new JMenu("Visitor Details");
		add(JM_VisitorDetail);
		
		JMI_update_find5=new JMenuItem("FIND");
		JMI_update_find5.addActionListener(this);
		
		JM_VisitorDetail.add(JMI_update_find5);
		JM_VisitorDetail.addSeparator();
		
		
		lbl_CheckIn=new JLabel("CHECK IN");
		add(lbl_CheckIn);
		lbl_CheckIn.setFont(new Font("Arial",Font.PLAIN,25));
		lbl_CheckIn.setBounds(60,120,250,40);
		

		JBtn_update=new JButton("UPDATE");
		JBtn_update.setBounds(65,340,100,40);
		JBtn_update.addActionListener(this);
		
		add(JBtn_update);
		
		lbl_CheckOut=new JLabel("CHECK OUT");
		add(lbl_CheckOut);
		lbl_CheckOut.setFont(new Font("Arial",Font.PLAIN,25));
		lbl_CheckOut.setBounds(220, 120, 250, 40);
		
		JBtn_update2=new JButton("UPDATE");
		JBtn_update2.setBounds(220,340,100,40);
		JBtn_update2.addActionListener(this);
		
		add(JBtn_update2);
		
		JMenuBar=new JMenuBar();
		//JMenuBar.add(JM_Admin);
		JMenuBar.add(JM_Dep);
        JMenuBar.add(JM_Dep_calender);
        JMenuBar.add(JM_EmpDetails);
        JMenuBar.add(JM_VisitorDetail);
		
        setJMenuBar(JMenuBar);
        
        
        
        jbtn2= new JButton("Add a New user");
    	add(jbtn2);
    	jbtn2.addActionListener(this);
    	jbtn2.setBounds(700,210,400,50);
    	jbtn2.setBackground(Color.BLUE);
    	jbtn2.setForeground(Color.WHITE);
    	jbtn2.setFont(new Font("Arial",Font.BOLD,30));
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new userMainwindow();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==JMI_find_update2) {
			Dept_UpdateFind obj=new Dept_UpdateFind();
		}
		
		if(ae.getSource()==JMI_update_find4) {
			Employe_UpdateFind obj=new Employe_UpdateFind();
		}
		
		if(ae.getSource()==JMI_update_find5) {
			Visitor_UpdateFind obj=new Visitor_UpdateFind();
		}
		if(ae.getSource()==jbtn2){
			new VisitorAutomaticId();
		}
		
		
		
	}

}
