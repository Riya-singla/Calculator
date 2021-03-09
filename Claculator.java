import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Claculator {

	private JFrame frame;
	private JTextField textField;
  double first;
  double second;
  double result;
  String operation;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Claculator window = new Claculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Claculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton.getText();
				textField.setText(num);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(31, 290, 52, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(104, 290, 52, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(184, 290, 52, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_3.getText();
				textField.setText(num);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(31, 356, 125, 38);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_4.getText();
				textField.setText(num);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(31, 244, 52, 38);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_5.getText();
				textField.setText(num);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setBounds(31, 194, 52, 38);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_6.getText();
				textField.setText(num);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setBounds(104, 244, 52, 36);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_7.getText();
				textField.setText(num);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBounds(104, 194, 52, 38);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_8.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setBounds(184, 244, 52, 36);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_9.getText();
				textField.setText(num);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9.setBounds(184, 194, 52, 38);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="-";
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_10.setBounds(31, 146, 52, 38);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="+";
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_11.setBounds(104, 146, 52, 38);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="/";
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_12.setBounds(184, 146, 52, 38);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("C");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_13.setBounds(184, 356, 52, 38);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="*";
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_14.setBounds(266, 148, 52, 38);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.valueOf(result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.valueOf(result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.valueOf(result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.valueOf(result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.valueOf(result);
					textField.setText(answer);
				}
				
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_15.setBounds(266, 194, 52, 38);
		frame.getContentPane().add(btnNewButton_15);
		
		textField = new JTextField();
		textField.setBounds(31, 45, 281, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_16 = new JButton("%");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="%";
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_16.setBounds(266, 356, 63, 34);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton(".");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_17.getText();
				textField.setText(num);
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_17.setBounds(266, 244, 52, 33);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("B");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0)
				{
					
					String str;
					str=textField.getText();
					str=str.substring(0,str.length()-1);
					textField.setText(str);
					
					
				}
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_18.setBounds(266, 291, 52, 37);
		frame.getContentPane().add(btnNewButton_18);
		frame.setBounds(100, 100, 369, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
