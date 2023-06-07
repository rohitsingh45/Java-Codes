import javax.swing.*;
import java.awt.*;

 class first_frame{
	 public static void main(String[] args){
		 JFrame ff = new JFrame();
		 ff.setVisible(true);
		 ff.setLocation(100,100);
		 JButton jb=new JButton("OK");
jb.setBounds(130,100,100, 40);		
ff.add(jb);
		 ff.setSize(400,500);
		 ff.setLayout(null);
	 }
 }