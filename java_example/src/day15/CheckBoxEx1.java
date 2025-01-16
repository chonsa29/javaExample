package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx1 extends JFrame{
	
	public CheckBoxEx1() {
		setTitle("체크박스");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JCheckBox check1 = new JCheckBox("사과");
		JCheckBox check2 = new JCheckBox("배",true);
		
		ImageIcon phone1 = new ImageIcon("C:\\Users\\tj-bu-708-00\\eclipse-workspace\\javaExample\\java_example\\image\\icon1.png");
		ImageIcon phone2 = new ImageIcon("C:\\Users\\tj-bu-708-00\\eclipse-workspace\\javaExample\\java_example\\image\\icon2.png");
		JCheckBox check3 = new JCheckBox(phone1);
		check3.setBorderPainted(true);
		check3.setSelectedIcon(phone2);
		c.add(check1);
		c.add(check2);
		c.add(check3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx1();
	}
}
