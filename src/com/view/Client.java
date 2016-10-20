package com.view;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Client {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
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
	public Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Consolas", Font.PLAIN, 16));
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/* 分組按鈕 */
		JButton btnGrouping = new JButton("Grouping");
		btnGrouping.setFont(new Font("Consolas", Font.PLAIN, 16));
		Image img = new ImageIcon(this.getClass().getResource("/icon_old_go_next.png")).getImage();
		btnGrouping.setIcon(new ImageIcon(img));
		btnGrouping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "你好~");
			}
		});
		btnGrouping.setBounds(344, 373, 139, 27);
		frame.getContentPane().add(btnGrouping);
		
	}
}
