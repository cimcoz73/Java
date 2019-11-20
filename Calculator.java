

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
//	private JButton btnMin;
	private JButton btnPerc;
//	private JButton btnClear;
//	private JButton btnDel;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		


		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("Burçin Cimcoz Calculator");


		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		

		
		
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 247, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
//		frame.pack();  bu kullanılınca uygulama tam boyutunda açılmıyor???
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(6, 6, 236, 40);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		// Row 1
		
		JButton btnDel;
//		btnDel.setBackground(Color.BLACK);//Black By Default
//		btnDel.setForeground(Color.GRAY);//Set as a Gray Colour 
		
		btnDel = new JButton("f");
		btnDel.setBackground(Color.RED);
		btnDel.setForeground(Color.RED);
		
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String delete = null;
				
				if(txtDisplay.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(txtDisplay.getText());
				strB.deleteCharAt(txtDisplay.getText().length() - 1);
				delete = strB.toString();
				txtDisplay.setText(delete);
				}
				
			}
		});
		btnDel.setFont(new Font("Wingdings 3", Font.PLAIN, 30));
		btnDel.setBounds(6, 50, 55, 55);
		frame.getContentPane().add(btnDel);
		
		JButton btnClear;
		
		btnClear = new JButton("C");
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.RED);
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnClear.setBounds(66, 50, 55, 55);
		frame.getContentPane().add(btnClear);
		
		JButton btPerc;
		btnPerc = new JButton("%");
		btnPerc.setBackground(Color.RED);
		btnPerc.setForeground(Color.RED);
		
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		btnPerc.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnPerc.setBounds(126, 50, 55, 55);
		frame.getContentPane().add(btnPerc);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(Color.BLUE);
		btnPlus.setBackground(Color.BLUE);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
				
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnPlus.setBounds(186, 230, 55, 55);
		frame.getContentPane().add(btnPlus);		
		
		
		// Row 2
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn7.setBounds(6, 110, 55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn8.setBounds(66, 110, 55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn9.setBounds(126, 110, 55, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnMin;
		btnMin = new JButton("-");
		btnMin.setForeground(Color.BLUE);
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMin.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnMin.setBounds(186, 170, 55, 55);
		frame.getContentPane().add(btnMin);
		
		// Row 3
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn4.setBounds(6, 170, 55, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn5.setBounds(66, 170, 55, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn6.setBounds(126, 170, 55, 55);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(Color.BLUE);
		btnMul.setForeground(Color.BLUE);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnMul.setBounds(186, 110, 55, 55);
		frame.getContentPane().add(btnMul);
		
		// Row 4
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn1.setBounds(6, 230, 55, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn2.setBounds(66, 230, 55, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn3.setBounds(126, 230, 55, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(Color.BLUE);
		btnDiv.setBackground(Color.BLUE);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnDiv.setBounds(186, 50, 55, 55);
		frame.getContentPane().add(btnDiv);
		
		// Row 5
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Entering Number Area for Zero
				
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn0.setBounds(6, 290, 55, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				String EnterNumber = txtDisplay.getText() + btnDot.getText();
//				txtDisplay.setText(EnterNumber );
				
				if(! txtDisplay.getText().contains("."))
		          {
		          txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
		          }
					
				
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnDot.setBounds(66, 290, 55, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
			ops = ops * (-1);
			txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnPlusMinus.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnPlusMinus.setBounds(126, 290, 55, 55);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(0, 128, 0));
		btnEqual.setForeground(new Color(0, 128, 0));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				else if (operations == "-") 
				{
				
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*") 
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/") 
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnEqual.setBounds(186, 290, 55, 55);
		frame.getContentPane().add(btnEqual);	
		

		
		
	}
	
}
