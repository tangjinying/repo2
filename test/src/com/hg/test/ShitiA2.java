package com.hg.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;                                     
public class ShitiA2  extends JFrame implements ActionListener{	
	public static void main(String[] args) {          
		 ShitiA2 f=new ShitiA2();                       		
		 f.setTitle("测试按钮动作");
		 f.setSize(300,200);
		 f.setVisible(true);
		 f.setLayout(new FlowLayout());                 		
		 Button b1=new Button("绿色按钮");
		 Button b2=new Button("蓝色按钮");          		
		 b1.addActionListener(f);
		 b2.addActionListener(f);
		 f.add(b1);
		 f.add(b2);		                              	
	}                                                    
	public void actionPerformed(ActionEvent e) {	    		
		Container c= this.getContentPane();
		if(e.getActionCommand()=="绿色按钮")
			c.setBackground(Color.green);		
		if(e.getActionCommand()=="蓝色按钮")
			c.setBackground(Color.blue);
	}
}                           