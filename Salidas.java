import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Salidas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salidas frame = new Salidas();
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
	public Salidas() {
		setTitle("Salidas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 736);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProductos_2_1_1 = new JButton("Atr\u00E1s");
		btnProductos_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1_1.setBounds(27, 24, 146, 59);
		contentPane.add(btnProductos_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("SALIDAS");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_1.setBounds(361, 10, 391, 106);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(211, 162, 764, 513);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Producto", "Fecha", "Cantidad"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setFont(new Font("Arial", Font.PLAIN, 17));
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new CompoundBorder(null, new LineBorder(new Color(0, 0, 0), 1, true)));
		table.setBackground(Color.WHITE);
		table.setBounds(47, 43, 671, 108);
		panel.add(table);
		
		JLabel lblNewLabel = new JLabel("Ingrese ID para buscar el Producto");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(59, 193, 269, 42);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(59, 232, 179, 31);
		panel.add(textField);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuscar.setBackground(new Color(4, 138, 153));
		btnBuscar.setBounds(461, 273, 146, 59);
		panel.add(btnBuscar);
		
		JLabel lblIngreseNombreDel = new JLabel("Ingrese Nombre del Producto para Buscar ");
		lblIngreseNombreDel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblIngreseNombreDel.setBounds(59, 273, 332, 42);
		panel.add(lblIngreseNombreDel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(59, 312, 179, 31);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(59, 353, 269, 42);
		panel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(59, 388, 179, 31);
		panel.add(textField_2);
		
		JButton btnProductos_2_1 = new JButton("Productos");
		btnProductos_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1.setBounds(917, 24, 146, 59);
		contentPane.add(btnProductos_2_1);
		
		JButton btnEntradas = new JButton("Entradas");
		btnEntradas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntradas.setBackground(new Color(4, 138, 153));
		btnEntradas.setBounds(1073, 24, 146, 59);
		contentPane.add(btnEntradas);
		
		JButton btnProductos_2 = new JButton("Graficas");
		btnProductos_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2.setBackground(new Color(4, 138, 153));
		btnProductos_2.setBounds(1073, 93, 146, 59);
		contentPane.add(btnProductos_2);
		
		JButton btnSalidas = new JButton("Salidas");
		btnSalidas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSalidas.setBackground(new Color(4, 138, 153));
		btnSalidas.setBounds(917, 93, 146, 59);
		contentPane.add(btnSalidas);
	}

}
