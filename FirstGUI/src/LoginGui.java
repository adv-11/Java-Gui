package adv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginGui implements ActionListener {
	
		private static JLabel label;
		private static JTextField userText;
		
		private static JLabel pwdlabel;
		private static JPasswordField userPass;
		
		private static JButton button;
		
		private static JLabel success;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		 label = new JLabel("User");
		label.setBounds(10,20,80,25); //x,y,w,h
		panel.add(label);
		
		 userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		 pwdlabel = new JLabel("Password");
		pwdlabel.setBounds(10,50,80,25);
		panel.add(pwdlabel);
		
		 userPass = new JPasswordField();
		userPass.setBounds(100,50,165,25);
		panel.add(userPass);
		
		 button = new JButton("Login");
		button.setBounds(10,80,80,25);
		panel.add(button);
		
		button.addActionListener(new LoginGui());
		
		frame.setVisible(true);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText();
		String pass = userPass.getText();
		
		if (user.equals("adv") && pass.equals("adv")) {
			success.setText("Login Succesful");
		}
		else{
			success.setText("Invalid Credentials !");
		}
		
	}	

}
