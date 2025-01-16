package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioBtnEx1 extends JFrame{
	public RadioBtnEx1() {
		setTitle("체크박스");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		
		g.add(radio1);
		g.add(radio2);
		c.add(radio1);
		c.add(radio2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioBtnEx1();
	}
}
