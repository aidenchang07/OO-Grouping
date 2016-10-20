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
import javax.swing.JTable;

public class Client {
	
	private static JButton btnGrouping;
	private JFrame frame;
	private JTable table;

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
		
		btnGrouping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "你好~");
			}
		});
		
		/* 學生欄位的數值 */
		String [] header= {"學號","英文能力","程式能力"};
		String [][] data = {{"A10423001", "60", "20"},
							{"A10423002", "70", "30"},
							{"A10423003", "20", "80"},
							{"A10423004", "20", "80"},
							{"A10423005", "20", "80"},
							{"A10423006", "20", "80"},
							{"A10423007", "20", "80"},
							{"A10423008", "20", "80"},
							{"A10423009", "20", "80"},
							{"A10423010", "20", "80"},
							{"A10423011", "20", "80"},
							{"A10423012", "20", "80"},
							{"A10423013", "20", "80"},
							{"A10423014", "20", "80"},
							{"A10423015", "20", "80"},
							{"A10423016", "20", "80"},
							{"A10423017", "20", "80"},
							{"A10423018", "20", "80"},
							{"A10423019", "20", "80"},
							{"A10423020", "20", "80"},
							{"A10423021", "20", "80"},
							{"A10423022", "20", "80"},
							{"A10423023", "20", "80"},
							{"A10423024", "20", "80"},
							{"A10423025", "20", "80"}};
		
		
		
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
		btnGrouping.setBounds(319, 373, 139, 27);
		frame.getContentPane().add(btnGrouping);
		
		/* 學生欄位 */
		table = new JTable();
		table.setBounds(421, 102, 324, 210);
		frame.getContentPane().add(table);
		
	}
	
}
