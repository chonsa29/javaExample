package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame {
	private int checkNum = 1;
	private double startTime;
	private double endTime;
	private JLabel label;
	public MyFrame2() {
		setTitle("랜덤 버튼 배치");

		Random ran = new Random();
		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			int x = ran.nextInt(500);
			int y = ran.nextInt(500);
			btn.setLocation(x, y);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton btn = (JButton) e.getSource();
					int btnNum = Integer.parseInt(btn.getText());

					if (checkNum == btnNum) {
						btn.setVisible(false);
						checkNum++;
						if(checkNum == 2) {
							startTime = System.currentTimeMillis();
						}
						if(checkNum == 11) {
							endTime = System.currentTimeMillis();
							double time = (endTime-startTime)/1000;
							System.out.println(time + "초");
						}
					}
				}
			});
			c.add(btn);
		}
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame2 gui = new MyFrame2();
	}
}
