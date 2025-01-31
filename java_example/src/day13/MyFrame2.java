package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {

	public MyFrame2() {
		setTitle("첫번째 GUI");

		Random ran = new Random();
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(null);

		for(int i = 1;i<=10;i++) {
			JButton btn = new JButton(i + "");
			btn.setSize(50,50);
			int x = ran.nextInt(700);
			int y = ran.nextInt(700);
			btn.setLocation(x,y);
			c.add(btn);;
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame2 gui = new MyFrame2();
	}
}

class MyEvent implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼 클릭!");
	}
	
}