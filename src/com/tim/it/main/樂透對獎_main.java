package com.tim.it.main;

import java.awt.EventQueue;
import com.tim.it.jfram.*;
import javax.swing.JTextField;
import javax.swing.JButton;

public class �ֳz���_main
{

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					�ֳz��� window = new �ֳz���();
					window.setVisible(true);
					window.CheckButton.addActionListener(window.addA());
					JTextField Input[] = window.getInput();
					JButton T[] = window.getT();
					for (int i = 0; i < 6; i++)
					{
						Input[i].addActionListener(window.addA());
						Input[i].addKeyListener(window.addA());

					}
					for (int i = 0; i < 10; i++)
					{
						T[i].addActionListener(window.addA());
					}
					window.table.addKeyListener(window.addA());
					// Input[0].addKeyListener(window.addB());
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

}
