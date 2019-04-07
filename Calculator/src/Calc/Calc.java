package Calc;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Calc {
	double num1;
	double num2;
	double result;
	String operation;

	private JFrame frame;
	private JTextField jDisplay;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(135, 206, 235));
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setForeground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 191, 255));
		frame.setBounds(100, 100, 392, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jDisplay = new JTextField();
		jDisplay.setBackground(new Color(224, 255, 255));
		jDisplay.setForeground(new Color(255, 0, 0));
		jDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		jDisplay.setEditable(false);
		jDisplay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jDisplay.setBounds(35, 11, 310, 43);
		frame.getContentPane().add(jDisplay);
		jDisplay.setColumns(10);
		
		JButton jB1 = new JButton("1"); /* Добавление кнопки один*/
		jB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unputnum = jDisplay.getText()+ jB1.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB1.setForeground(Color.RED);
		jB1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB1.setBounds(35, 65, 56, 37);
		frame.getContentPane().add(jB1);
		
		JButton jB2 = new JButton("2"); /* Добавление кнопки два*/
		jB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB2.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB2.setForeground(Color.RED);
		jB2.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB2.setBounds(105, 65, 56, 37);
		frame.getContentPane().add(jB2);
		
		JButton jB3 = new JButton("3");/* Добавление кнопки три */
		jB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+jB3.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB3.setForeground(Color.RED);
		jB3.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB3.setBounds(179, 65, 56, 37);
		frame.getContentPane().add(jB3);
		
		JButton jB4 = new JButton("4");/* Добавление кнопки четыре */
		jB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB4.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB4.setForeground(Color.RED);
		jB4.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB4.setBounds(35, 113, 56, 37);
		frame.getContentPane().add(jB4);
		
		JButton jB5 = new JButton("5");/* Добавление кнопки пять */
		jB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB5.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB5.setForeground(Color.RED);
		jB5.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB5.setBounds(105, 113, 56, 37);
		frame.getContentPane().add(jB5);
		
		JButton jB6 = new JButton("6"); /* Добавление кнопки шесть */
		jB6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB6.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB6.setForeground(Color.RED);
		jB6.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB6.setBounds(179, 113, 56, 37);
		frame.getContentPane().add(jB6);
		
		JButton jB7 = new JButton("7");/* Добавление кнопки семь */
		jB7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB7.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB7.setForeground(Color.RED);
		jB7.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB7.setBounds(35, 161, 56, 37);
		frame.getContentPane().add(jB7);
		
		JButton jB8 = new JButton("8"); /* Добавление кнопки восемь */
		jB8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB8.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB8.setForeground(Color.RED);
		jB8.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB8.setBounds(105, 161, 56, 37);
		frame.getContentPane().add(jB8);
		
		JButton jB9 = new JButton("9"); /* Добавление кнопки девять */
		jB9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB9.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB9.setForeground(Color.RED);
		jB9.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB9.setBounds(179, 161, 56, 37);
		frame.getContentPane().add(jB9);
		
		JButton jBplusminus = new JButton("+/-"); /* Добавление кнопки "плюс/минус" */
		jBplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusminus = Double.parseDouble(String.valueOf(jDisplay.getText()));
				plusminus = plusminus * (-1);
				jDisplay.setText(String.valueOf(plusminus));
			}
		});
		jBplusminus.setForeground(Color.RED);
		jBplusminus.setFont(new Font("Tahoma", Font.BOLD, 12));
		jBplusminus.setBounds(35, 209, 56, 37);
		frame.getContentPane().add(jBplusminus);
		
		JButton jB10 = new JButton("0"); /* Добавление кнопки ноль */
		jB10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jB10.getText();
				jDisplay.setText(unputnum);
			}
		});
		jB10.setForeground(Color.RED);
		jB10.setFont(new Font("Tahoma", Font.BOLD, 14));
		jB10.setBounds(105, 209, 56, 37);
		frame.getContentPane().add(jB10);
		
		JButton jBdot = new JButton("."); /* Добавление кнопки  вещественных чисел */
		jBdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unputnum = jDisplay.getText()+ jBdot.getText();
				jDisplay.setText(unputnum);	
			}
		});
		jBdot.setForeground(Color.RED);
		jBdot.setFont(new Font("Tahoma", Font.BOLD, 14));
		jBdot.setBounds(179, 209, 56, 37);
		frame.getContentPane().add(jBdot);
		
		JButton jBplus = new JButton("+"); /* Добавление кнопки сложения */
		jBplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(jDisplay.getText());
				jDisplay.setText("");
				operation = "+";
			}
		});
		jBplus.setForeground(Color.RED);
		jBplus.setFont(new Font("Tahoma", Font.BOLD, 14));
		jBplus.setBounds(289, 113, 56, 37);
		frame.getContentPane().add(jBplus);
		
		JButton jBminus = new JButton("-");/* Добавление кнопки вычитания */
		jBminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(jDisplay.getText());
				jDisplay.setText("");
				operation = "-";
			}
		});
		jBminus.setForeground(Color.RED);
		jBminus.setFont(new Font("Tahoma", Font.BOLD, 14));
		jBminus.setBounds(289, 161, 56, 37);
		frame.getContentPane().add(jBminus);
		
		JButton jBmultiply = new JButton("*"); /* Добавление кнопки умножения */
		jBmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(jDisplay.getText());
				jDisplay.setText("");
				operation = "*";
			}
		});
		jBmultiply.setForeground(Color.RED);
		jBmultiply.setFont(new Font("Tahoma", Font.BOLD, 14));
		jBmultiply.setBounds(289, 208, 56, 37);
		frame.getContentPane().add(jBmultiply);
		
		JButton jBdivided = new JButton("/"); /* Добавление кнопки деления */
		jBdivided.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(jDisplay.getText());
				jDisplay.setText("");
				operation = "/";
			}
		});
		jBdivided.setForeground(Color.RED);
		jBdivided.setFont(new Font("Tahoma", Font.BOLD, 14));
		jBdivided.setBounds(289, 258, 56, 37);
		frame.getContentPane().add(jBdivided);
		
		JButton jDclear = new JButton("C"); /* Добавление кнопки удаления */
		jDclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jDisplay.setText("");
			}
		});
		jDclear.setForeground(Color.RED);
		jDclear.setFont(new Font("Tahoma", Font.BOLD, 14));
		jDclear.setBounds(289, 65, 56, 37);
		frame.getContentPane().add(jDclear);
		
		JButton jBequally = new JButton("="); /* Добавление кнопки равенства */
		jBequally.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(jDisplay.getText());
				String total;
				if ( operation == "+")
				{
					result = num1+num2;
					total=String.format("%.4f", result);
					jDisplay.setText(total);
				} /* Выполняет операцию сложения */
				else if ( operation == "-")
				{
					result = num1-num2;
					total=String.format("%.4f", result);
					jDisplay.setText(total);
				} /* Выполняет операцию вычитания */
				else if ( operation == "*")
				{
					result = num1*num2;
					total=String.format("%.4f", result);
					jDisplay.setText(total);
				} /* Выполняет операцию умножения */
				else if ( operation == "/")
				{
					result = num1/num2;
					total=String.format("%.4f", result);
					jDisplay.setText(total);
				} /* Выполняет операцию деления */
			}
		});
		jBequally.setForeground(new Color(255, 0, 0));
		jBequally.setFont(new Font("Tahoma", Font.BOLD, 13));
		jBequally.setBounds(35, 263, 200, 32);
		frame.getContentPane().add(jBequally);
	}
}
