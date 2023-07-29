package adv;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GUI implements ActionListener{
	
	int count = 0;
	JLabel label;
	JFrame frame;
	JPanel panel;
	
	
	public GUI() {
		frame = new JFrame();    //object creation
		panel = new JPanel();
		JButton button = new JButton("Click Me");
		JButton button2 = new JButton("Add query");
		button2.addActionListener(this);
		button.addActionListener(this);
		
		
		label = new JLabel();
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(button2);
		panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);       			 //add panel to frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //set what happens when you close frame
		frame.setTitle("ADV");
		frame.pack(); 										     //matches size of window
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GUI();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("No of Clicks : "+ count);
		
	}

}
 