import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2; 
    double res;
	String op;
	String ans;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		;	public void run() {
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
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(10, 27, 319, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 62, 319, 114);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnNewButton.setBounds(10, 208, 66, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnx.setBounds(10, 266, 66, 61);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
                 textField.setText("");
                 op="X^Y";
			}
		});
		btnXy.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnXy.setBounds(10, 322, 66, 61);
		frame.getContentPane().add(btnXy);
		
		JButton btnX_1 = new JButton("X^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnX_1.setBounds(10, 382, 66, 61);
		frame.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnX.setBounds(10, 439, 66, 61);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText(" ");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnN.setBounds(10, 501, 66, 61);
		frame.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnPlusMinus.setBounds(10, 563, 66, 61);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnEx.setBounds(75, 208, 66, 61);
		frame.getContentPane().add(btnEx);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnLog.setBounds(75, 266, 66, 61);
		frame.getContentPane().add(btnLog);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="%";
			}
		});
		btnPercent.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnPercent.setBounds(75, 322, 66, 61);
		frame.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn7.setBounds(75, 382, 66, 61);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn4.setBounds(75, 439, 66, 61);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn1.setBounds(75, 501, 66, 61);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSin.setBounds(141, 208, 66, 61);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnCos.setBounds(202, 208, 66, 61);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnTan.setBounds(267, 208, 66, 61);
		frame.getContentPane().add(btnTan);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSinh.setBounds(141, 266, 66, 61);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnCosh.setBounds(202, 266, 66, 61);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnTanh.setBounds(267, 266, 66, 61);
		frame.getContentPane().add(btnTanh);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnClear.setBounds(141, 322, 66, 61);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackspace = new JButton(" \uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 21));
		btnBackspace.setBounds(202, 322, 66, 61);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn8.setBounds(141, 382, 66, 61);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn9.setBounds(202, 382, 66, 61);
		frame.getContentPane().add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn5.setBounds(141, 439, 66, 61);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn6.setBounds(202, 439, 66, 61);
		frame.getContentPane().add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn2.setBounds(141, 501, 66, 61);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn0.setBounds(72, 563, 135, 61);
		frame.getContentPane().add(btn0);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn3.setBounds(202, 501, 66, 61);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnDot.setBounds(202, 563, 66, 61);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num2=Double.parseDouble(textField.getText());
                 if(op=="+")
                 {
                     res=num1+num2;
                     ans=String.format("%.2f",res);
                     textField.setText(ans);
                 }
                 else if(op=="-")
                 {
                     res=num1-num2;
                     ans=String.format("%.2f",res);
                     textField.setText(ans);
                 }
                 else if(op=="*")
                 {
                     res=num1*num2;
                     ans=String.format("%.2f",res);
                     textField.setText(ans);
                 }
                 else if(op=="/")
                 {
                     res=num1/num2;
                     ans=String.format("%.2f",res);
                     textField.setText(ans);
                 }
                 else if(op=="%")
                 {
                     res=num1%num2;
                     ans=String.format("%.2f",res);
                     textField.setText(ans);
                 }
                 else if(op=="X^Y")
                 {
                     double result1=1;
                     for(int i=0;i<num2;i++)
                     {
                         res=num1%num2;
                     }
                     ans=String.format("%.2f",res);
                     textField.setText(ans);
                 }
		
}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnEqual.setBounds(263, 563, 66, 61);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnDivide.setBounds(267, 501, 66, 61);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="*";
			}
		});
		btnMul.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnMul.setBounds(267, 439, 66, 61);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="-";
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnSub.setBounds(267, 382, 66, 61);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="+";
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnAdd.setBounds(267, 322, 66, 61);
		frame.getContentPane().add(btnAdd);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btnDot.setEnabled(true);
                btnPlusMinus.setEnabled(true);
                btnAdd.setEnabled(true);
                btnSub.setEnabled(true);
                btnDivide.setEnabled(true);
                btnMul.setEnabled(true);
                btnEqual.setEnabled(true);
                btnPercent.setEnabled(true);
                btnClear.setEnabled(true);
                btnBackspace.setEnabled(true);
                btnNewButton.setEnabled(true);
                btnx.setEnabled(true);
                btnX.setEnabled(true);
                btnX_1.setEnabled(true);
                btnXy.setEnabled(true);
                btnTan.setEnabled(true);
                btnTanh.setEnabled(true);
                btnCos.setEnabled(true);
                btnCosh.setEnabled(true);
                btnSin.setEnabled(true);
                btnSinh.setEnabled(true);
                btnLog.setEnabled(true);
                btnN.setEnabled(true);
                btnXy.setEnabled(true);
                btnEx.setEnabled(true);
                textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		rdbtnNewRadioButton.setBounds(20, 182, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 btn9.setEnabled(false);
                 btnDot.setEnabled(false);
                 btnPlusMinus.setEnabled(false);
                 btnAdd.setEnabled(false);
                 btnSub.setEnabled(false);
                 btnDivide.setEnabled(false);
                 btnMul.setEnabled(false);
                 btnEqual.setEnabled(false);
                 btnPercent.setEnabled(false);
                 btnClear.setEnabled(false);
                 btnBackspace.setEnabled(false);
                 btnNewButton.setEnabled(false);
                 btnx.setEnabled(false);
                 btnX.setEnabled(false);
                 btnX_1.setEnabled(false);
                 btnXy.setEnabled(false);
                 btnTan.setEnabled(false);
                 btnTanh.setEnabled(false);
                 btnCos.setEnabled(false);
                 btnCosh.setEnabled(false);
                 btnSin.setEnabled(false);
                 btnSinh.setEnabled(false);
                 btnLog.setEnabled(false);
                 btnN.setEnabled(false);
                 btnXy.setEnabled(false);
                 btnEx.setEnabled(false);
                 textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Times New Roman", Font.BOLD, 17));
		rdbtnOff.setBounds(125, 182, 103, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
