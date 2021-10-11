package com.tim.it.jfram;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class 樂透對獎
{
	public JFrame table;
	private JTextField Input;
	private JTextField Input0;
	private JTextField Input1;
	private JTextField Input2;
	private JTextField Input3;
	private JTextField Input4;
	private JTextField Input5;
	private JLabel PromptText;
	public JButton CheckButton;
	private String Data[] = new String[6];
	private boolean b = true;
	private JButton T4;
	private JButton T5;
	private JButton T6;
	private JButton T2;
	private JButton T7;
	private JButton T8;
	private JButton T9;
	private JButton T1;
	private JButton T3;
	private JButton T0;

	public 樂透對獎()
	{
		initialize();
	}

	private void initialize()
	{
		table = new JFrame();
		table.setResizable(false);
		table.getContentPane().setBackground(new Color(255, 204, 255));
		table.getContentPane().setForeground(new Color(0, 255, 255));
		table.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowDeiconified(WindowEvent e)
			{

			}

			public void windowActivated(WindowEvent e)
			{
				System.out.println("Start");
			}
		});
		table.setTitle("\u6A02\u900F\u5C0D\u734E");
		table.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\\Program Files\\icons8-pouch-64.png"));
		table.setAlwaysOnTop(true);
		table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table.setBounds(710, 315, 656, 493);
		table.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 649, 153);
		panel.setToolTipText("");
		panel.setBorder(new LineBorder(Color.PINK, 7));
		panel.setBackground(Color.ORANGE);
		table.getContentPane().add(panel);

		Input0 = new JTextField();
		Input0.setHorizontalAlignment(SwingConstants.CENTER);
		Input0.setBounds(208, 13, 34, 25);
		Input0.setColumns(2);

		Input1 = new JTextField();
		Input1.setHorizontalAlignment(SwingConstants.CENTER);
		Input1.setBounds(248, 13, 34, 25);
		Input1.setColumns(2);

		Input2 = new JTextField();
		Input2.setHorizontalAlignment(SwingConstants.CENTER);
		Input2.setBounds(288, 13, 34, 25);
		Input2.setColumns(2);

		Input3 = new JTextField();
		Input3.setHorizontalAlignment(SwingConstants.CENTER);
		Input3.setBounds(328, 13, 34, 25);
		Input3.setColumns(2);

		Input4 = new JTextField();
		Input4.setHorizontalAlignment(SwingConstants.CENTER);
		Input4.setBounds(368, 13, 34, 25);
		Input4.setColumns(2);

		Input5 = new JTextField();
		Input5.setHorizontalAlignment(SwingConstants.CENTER);
		Input5.setBounds(408, 13, 34, 25);
		Input5.setColumns(2);

		CheckButton = new JButton("\u78BA\u8A8D\r\n");
		CheckButton.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		CheckButton.setForeground(Color.RED);
		CheckButton.setBounds(288, 97, 80, 43);
		panel.setLayout(null);
		panel.add(Input0);
		panel.add(Input1);
		panel.add(Input2);
		panel.add(Input3);
		panel.add(Input4);
		panel.add(Input5);
		panel.add(CheckButton);

		Input = new JTextField();
		Input.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		Input.setBounds(14, 51, 621, 43);
		panel.add(Input);
		Input.setColumns(10);
		Input.addActionListener(new CheckButtonEventListener());

		PromptText = new JLabel("\u8ACB\u5148\u8F38\u5165\u958B\u734E\u865F\u78BC");
		PromptText.setHorizontalAlignment(SwingConstants.CENTER);
		PromptText.setBounds(0, 186, 649, 236);
		table.getContentPane().add(PromptText);
		PromptText.setFont(new Font("新細明體", Font.PLAIN, 50));

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 151, 649, 36);
		table.getContentPane().add(panel_1);

		T3 = new JButton("3\u5C3E");
		T3.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T1 = new JButton("1\u5C3E");
		T1.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T4 = new JButton("4\u5C3E");
		T4.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T5 = new JButton("5\u5C3E");
		T5.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T6 = new JButton("6\u5C3E");
		T6.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T2 = new JButton("2\u5C3E");
		T2.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T7 = new JButton("7\u5C3E");
		T7.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T8 = new JButton("8\u5C3E");
		T8.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T9 = new JButton("9\u5C3E");
		T9.setFont(new Font("微軟正黑體", Font.PLAIN, 15));

		T0 = new JButton("0\u5C3E");
		T0.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(4)
						.addComponent(T0, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T2, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T3, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T4, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T5, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T6, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T7, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T8, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(T9, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE).addGap(18)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(T0, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(T1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(T2).addComponent(T3).addComponent(T4).addComponent(T5).addComponent(T6)
								.addComponent(T7).addComponent(T8).addComponent(T9))
						.addGap(4)));
		panel_1.setLayout(gl_panel_1);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 102, 255));
		table.setJMenuBar(menuBar);

		JMenu menu = new JMenu("\u8AAA\u660E");
		menu.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		menu.setForeground(new Color(255, 255, 255));
		menuBar.add(menu);

		JMenuItem menuItem = new JMenuItem("\u95DC\u65BC\u6A02\u900F\u5C0D\u734E");
		menuItem.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		menu.add(menuItem);
	}

	class CheckButtonEventListener extends KeyAdapter implements ActionListener
	{
		@Override
		public void keyReleased(KeyEvent e)
		{
			// System.out.print("10000");
			JTextField temp[] = getInput();
			for (int i = 0; i < 6; i++)
			{
				if (e.getSource() == temp[i] && temp[i].getText().length() > 1)
				{
					temp[(i == 5 ? -1 : i) + 1].grabFocus();
					break;
				}
			}
		}

		public void actionPerformed(ActionEvent e)
		{
			/*
			 * JTextField temp0[]=getInput(); for(int i=0;i<6;i++) {
			 * System.out.println(temp0[i].requestFocusInWindow()); }
			 */
			if (e.getSource() == T0)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append("10 20 30 40");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T1)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 01 11 21 31 41");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T2)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 02 12 22 32 42");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T3)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 03 13 23 33 43");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T4)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 04 14 24 34 44");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T5)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 05 15 25 35 45");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T6)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 06 16 26 36 46");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T7)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 07 17 27 37 47");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T8)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 08 18 28 38 48");
				Input.setText(sb.toString());
			}
			if (e.getSource() == T9)
			{
				StringBuilder sb = new StringBuilder(100);
				sb.append(Input.getText());
				sb.append(" 09 19 29 39 49");
				Input.setText(sb.toString());
			}
			if (e.getSource() == Input || e.getSource() == CheckButton)
			{
				if (b == true)
				{
					JTextField temp[] = getInput();
					for (int i = 0; i < 6; i++)
					{

						System.out.print(temp[i].getText());
						Data[i] = temp[i].getText();
						temp[i].setEditable(false);
					}
					PromptText.setText("中獎號碼讀取完畢!");
					b = false;
					System.out.println(b);
				} else
				{
					String temp[] = Input.getText().split("\\s+");
					int count = 0;
					Input.setText(null);
					for (String a : temp)
					{
						System.out.print(a);
					}
					System.out.println(temp.length);
					System.out.println(Data[2].equals(temp[0]));
					for (int i = 0; i < temp.length; i++)
					{
						for (int j = 0; j < 6; j++)
						{
							if (temp[i].equals(Data[j]))
							{
								System.out.println(Data[j]);
								temp[count++] = Data[j];
								break;

							}
						}
					}

					switch (count)
					{
						case 0:
							PromptText.setForeground(Color.BLACK);
							PromptText.setFont(new Font("新細明體", Font.PLAIN, 70));
							PromptText.setText("未中獎");
							break;
						case 1:
							PromptText.setForeground(Color.RED);
							PromptText.setText("<html>" + temp[count - 1] + "中獎，共一個號碼中獎</html>");
							break;
						default:
							StringBuilder sb = new StringBuilder(30);
							PromptText.setForeground(Color.RED);
							for (int i = 0; i < count; i++)
							{
								sb.append(temp[i] + "，");
							}
							PromptText.setText("<html>" + sb + "中獎，共" + count + "個號碼中獎</html>");
					}
				}
			} else if (e.getSource() == Input0)
			{
				Input1.grabFocus();
			} else if (e.getSource() == Input1)
			{
				Input2.grabFocus();
			} else if (e.getSource() == Input2)
			{
				Input3.grabFocus();
			} else if (e.getSource() == Input3)
			{
				Input4.grabFocus();
			} else if (e.getSource() == Input4)
			{
				Input5.grabFocus();
			} else if (e.getSource() == Input5)
			{
				Input0.grabFocus();
			}
		}
	}

	/*
	 * class Key extends KeyAdapter { public void keyTyped(KeyEvent e) { int
	 * count=100; JTextField temp[]=getInput(); for(int i=0;i<6;i++) {
	 * if(temp[i].requestFocusInWindow() && temp[i].getText().length()>1) {
	 * temp[i+1].grabFocus(); break; } } } }
	 */
	public CheckButtonEventListener addA()
	{
		return new CheckButtonEventListener();
	}

	/*
	 * public Key addB() { return new Key(); }
	 */
	public JTextField[] getInput()
	{
		JTextField temp[] = { Input0, Input1, Input2, Input3, Input4, Input5 };
		return temp;
	}

	public JButton[] getT()
	{
		JButton temp[] = { T0, T1, T2, T3, T4, T5, T6, T7, T8, T9 };
		return temp;
	}

	public void setVisible(boolean i)
	{
		table.setVisible(i);
	}
}
