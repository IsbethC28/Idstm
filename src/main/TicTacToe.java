package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {
	public TicTacToe() {
		setBackground(new Color(240, 240, 240));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_1 = new JButton(" ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton(" ");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton(" ");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton(" ");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton(" ");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton(" ");
		panel.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton(" ");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton(" ");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton(" ");
		panel.add(btnNewButton_8);
	}
	
}
