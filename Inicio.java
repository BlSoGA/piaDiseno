import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JList;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setBackground(new Color(255, 255, 255));
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(25, 37, 102, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_1.setBounds(25, 105, 102, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_2.setBounds(25, 176, 102, 44);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_3.setBounds(25, 247, 102, 44);
		contentPane.add(btnNewButton_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(172, 358, 0, -345);
		contentPane.add(separator);
		
		JList list = new JList();
		list.setBounds(238, 53, 215, 14);
		contentPane.add(list);
	}
}
