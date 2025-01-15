package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("레이블 실습");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label =  new JLabel("자바 재밌다~");
		
		c.add(label);

		ImageIcon image1 = new ImageIcon("C:\\Users\\tj-bu-708-00\\eclipse-workspace\\javaExample\\java_example\\image\\icon1.png");
		
		
		Image image = image1.getImage();
        Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel label2 = new JLabel(scaledIcon);
		c.add(label2);
		
		ImageIcon image2 = new ImageIcon("C:\\Users\\tj-bu-708-00\\eclipse-workspace\\javaExample\\java_example\\image\\icon2.png");
		JLabel label3 = new JLabel("자바 좋아!",image2, SwingConstants.CENTER);
		c.add(label3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		LabelEx label = new LabelEx();
	}
}
