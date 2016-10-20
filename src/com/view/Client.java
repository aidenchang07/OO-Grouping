package com.view;

import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class Client {
	
	private JButton btnGrouping;
	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;

	public static void main(String[] args) {
		Client window = new Client();
		window.frame.setVisible(true);
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
		
		frame = new JFrame("OOSE Grouping");
		frame.getContentPane().setFont(new Font("Consolas", Font.PLAIN, 16));
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		
		/* 分組按鈕 */
		btnGrouping = new JButton("Grouping");
		btnGrouping.setFont(new Font("Consolas", Font.PLAIN, 16));
		Image img = new ImageIcon(this.getClass().getResource("/icon_old_go_next.png")).getImage();
		frame.getContentPane().setLayout(null);
		btnGrouping.setIcon(new ImageIcon(img));
		btnGrouping.setBounds(287, 399, 246, 41);
		frame.getContentPane().add(btnGrouping);
		
		
		table = new JTable(getStudentData(), getTableName());
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(14, 13, 246, 226);
		table.setBounds(421, 102, 324, 210);
		frame.getContentPane().add(scrollPane);
		
		frame.getContentPane().setVisible(true);
		
		btnGrouping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "你好~");
			}
		});
		
	}
	
//	private void createTable() {
//		table = new JTable(getStudentData(), getTableName());
//		table.setBounds(421, 102, 324, 210);
//		JScrollPane js = new JScrollPane(table);
//		frame.getContentPane().add(js);
//		frame.getContentPane().setVisible(true);
//	}
	
	private String[] getTableName() {
		/* 學生欄位 */
		String [] columns= {"學號","英文能力","程式能力"};
		return columns;
	}
	
	private Object[][] getStudentData() {
		/* 產生隨機值 */
		Random rand = new Random();
		/* 學生欄位的數值 */
		Object [][] data = {{"A10423001", rand.nextInt(100), rand.nextInt(100)},
							{"A10423002", rand.nextInt(100), rand.nextInt(100)},
							{"A10423003", rand.nextInt(100), rand.nextInt(100)}};
		return data;
	}
	
}
