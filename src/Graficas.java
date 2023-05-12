import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Graficas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graficas frame = new Graficas();
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
	public Graficas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 646);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBorder(new EmptyBorder(0, 0, 0, 0));
		table.setFont(new Font("Arial", Font.PLAIN, 17));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSurrendersFocusOnKeystroke(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Saldo de Apertura", null},
				{"Ingresos Totales", null},
				{"Gastos ", null},
				{"Balance", null},
				{"Saldo Final", null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(97);
		table.setBounds(73, 327, 132, -185);
		contentPane.add(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(415, 172, 578, 408);
		contentPane.add(panel);
		
		table_1 = new JTable();
		table_1.setBounds(64, 234, 271, 112);
		contentPane.add(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Saldo de Aperura", null},
				{"Ingresos Totales", null},
				{"Gastos ", null},
				{"Balance ", null},
				{"Saldo Final", null},
				{"Productos Vendidos", null},
				{"No Clientes", null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(94);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(54);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table_1.setFont(new Font("Arial", Font.PLAIN, 17));
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBorder(new CompoundBorder(null, new LineBorder(new Color(0, 0, 0), 1, true)));
		table_1.setBackground(Color.WHITE);
		
		JButton btnProductos_2_1 = new JButton("Productos");
		btnProductos_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1.setBounds(769, 10, 146, 59);
		contentPane.add(btnProductos_2_1);
		
		JButton btnEntradas = new JButton("Entradas");
		btnEntradas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntradas.setBackground(new Color(4, 138, 153));
		btnEntradas.setBounds(925, 10, 146, 59);
		contentPane.add(btnEntradas);
		
		JButton btnProductos_2 = new JButton("Estadisticas");
		btnProductos_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2.setBackground(new Color(4, 138, 153));
		btnProductos_2.setBounds(925, 79, 146, 59);
		contentPane.add(btnProductos_2);
		
		JButton btnSalidas = new JButton("Salidas");
		btnSalidas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSalidas.setBackground(new Color(4, 138, 153));
		btnSalidas.setBounds(769, 79, 146, 59);
		contentPane.add(btnSalidas);
		
		JButton btnProductos_2_1_1 = new JButton("Atr\u00E1s");
		btnProductos_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1_1.setBounds(24, 30, 146, 59);
		contentPane.add(btnProductos_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Estadisticas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setBounds(310, 10, 391, 106);
		contentPane.add(lblNewLabel_1);
		
		JButton btnProductos_2_1_2 = new JButton("Ventas");
		btnProductos_2_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_2.setBackground(new Color(4, 138, 153));
		btnProductos_2_1_2.setBounds(33, 428, 146, 59);
		contentPane.add(btnProductos_2_1_2);
		
		JButton btnEntradas_1 = new JButton("Grafica");
		btnEntradas_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntradas_1.setBackground(new Color(4, 138, 153));
		btnEntradas_1.setBounds(189, 428, 146, 59);
		contentPane.add(btnEntradas_1);
	}
}
