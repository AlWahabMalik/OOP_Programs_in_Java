import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.security.cert.URICertStoreParameters;
import java.util.FormatFlagsConversionMismatchException;

public class loginPage {

	public static void main(String[] args) {
		HashMap<String,String> info=  
		JFrame frame=new JFrame("Login Screen");
		JButton btn_login=new JButton("Login");
		JButton btn_reset=new JButton("Reset");
		JTextField txt_user=new JTextField();
		JPasswordField txt_password=new JPasswordField();
		JLabel lbl_user = new JLabel ("Enter User ID");
		JLabel lbl_password = new JLabel ("Enter Password");
		JLable message_Lable=new JLable("THIS IS A TEST");
		loginPage(HashMap<String,String>){
			userIDLabel.setBounds(50,100,75,25);
			userPasswordLabel.setBounds(50,150,75,25);
			messageLabel.setBounds(125,250,250,35);
		    messageLabel.setFont(new Font(null,Font.ITALIC,25));
			userIDField.setBounds(125,100,200,25);
			userPasswordField.setBounds(125,150,200,25);
			loginButton.setBounds(125,200,100,25);
			loginButton.setFocusable(false);
			loginButton.addActionListner(this);
			resetButton.setBounds(225,200,100,25);
			resetButton.setFocusable(false);
			resetButton.addActionListner(this);
			frame.add(userIDLabel);
			frame.add(userPasswordLabel);
			frame.add(messageLabel);
			frame.add(userIDField);
			frame.add(userPasswordField);
			frame.add(loginButton);
			frame.add(resetButton);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 250);
			frame.setLayout(new BorderLayout(0, 20));
			frame.setVisible(true);
	}

}
}