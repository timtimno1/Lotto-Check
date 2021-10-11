package com.tim.it.main;

import java.awt.EventQueue;
import com.tim.it.jfram.*;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 樂透對獎_main
{

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					樂透對獎 window = new 樂透對獎();
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
