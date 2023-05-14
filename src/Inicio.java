import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JSpinner;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

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
		setBackground(new Color(224, 243, 242));
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1213, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 20));
		menuBar.setBackground(new Color(224, 243, 242));
		menuBar.setBounds(86, 63, 513, 55);
		contentPane.add(menuBar);
		
		JButton btnProductos_2_1_1 = new JButton("Inventario");
		btnProductos_2_1_1.setForeground(new Color(255, 255, 255));
		btnProductos_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_1.setBackground(new Color(4, 138, 153));
		menuBar.add(btnProductos_2_1_1);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setForeground(new Color(255, 255, 255));
		btnClientes.setFont(new Font("Arial", Font.PLAIN, 14));
		btnClientes.setBackground(new Color(4, 138, 153));
		menuBar.add(btnClientes);
		
		JButton btnClientes_1 = new JButton("Registro");
		btnClientes_1.setForeground(new Color(255, 255, 255));
		btnClientes_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnClientes_1.setBackground(new Color(4, 138, 153));
		menuBar.add(btnClientes_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(120, 130, 923, 513);
		contentPane.add(panel);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 16));
		spinner.setBounds(455, 85, 110, 38);
		panel.add(spinner);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(680, 23, 146, 124);
		panel.add(panel_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Producto", "Cantidad", "Costo Unitario", "Costo Total"},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setFont(new Font("Arial", Font.PLAIN, 17));
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new CompoundBorder(null, new LineBorder(new Color(0, 0, 0), 1, true)));
		table.setBackground(Color.WHITE);
		table.setBounds(92, 182, 722, 108);
		panel.add(table);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("$");
		textPane.setFont(new Font("Arial", Font.PLAIN, 20));
		textPane.setBounds(680, 385, 97, 50);
		panel.add(textPane);
		
		Label label = new Label("ID");
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(26, 23, 33, 50);
		panel.add(label);
		
		Label label_1 = new Label("Producto");
		label_1.setFont(new Font("Arial", Font.PLAIN, 20));
		label_1.setBounds(241, 25, 200, 50);
		panel.add(label_1);
		
		Label label_2 = new Label("Cantidad");
		label_2.setFont(new Font("Arial", Font.PLAIN, 20));
		label_2.setBounds(445, 23, 120, 50);
		panel.add(label_2);
		
		Label label_3 = new Label("Total");
		label_3.setFont(new Font("Arial", Font.PLAIN, 20));
		label_3.setBounds(680, 329, 200, 50);
		panel.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(32, 85, 171, 38);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 85, 171, 38);
		panel.add(textField_1);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setForeground(new Color(255, 255, 255));
		btnImprimir.setFont(new Font("Arial", Font.PLAIN, 14));
		btnImprimir.setBackground(new Color(4, 138, 153));
		btnImprimir.setBounds(690, 445, 85, 25);
		panel.add(btnImprimir);
	}
}
