import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Invent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invent frame = new Invent();
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
	public Invent() {
		setBackground(new Color(224, 243, 242));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1341, 856);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProductos_2_1_1 = new JButton("");
		btnProductos_2_1_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\back_arrow_14447.png"));
		btnProductos_2_1_1.setBounds(41, 32, 76, 60);
		btnProductos_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_1.setBackground(new Color(4, 138, 153));
		contentPane.add(btnProductos_2_1_1);
		
		JButton btnEntradas = new JButton("Entradas");
		btnEntradas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntradas.setBackground(new Color(4, 138, 153));
		btnEntradas.setBounds(1091, 21, 146, 59);
		contentPane.add(btnEntradas);
		
		JButton btnSalidas = new JButton("Salidas");
		btnSalidas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSalidas.setBackground(new Color(4, 138, 153));
		btnSalidas.setBounds(935, 90, 146, 59);
		contentPane.add(btnSalidas);
		
		JButton btnProductos_2 = new JButton("Estadísticas");
		btnProductos_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2.setBackground(new Color(4, 138, 153));
		btnProductos_2.setBounds(1091, 90, 146, 59);
		contentPane.add(btnProductos_2);
		
		JButton btnProductos_2_1 = new JButton("Productos");
		btnProductos_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1.setBounds(935, 21, 146, 59);
		contentPane.add(btnProductos_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(69, 180, 334, 481);
		contentPane.add(panel_1);
		
		JLabel lblCambiarNombreDe = new JLabel("Cambiar Nombre de Producto");
		lblCambiarNombreDe.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCambiarNombreDe.setBounds(58, 44, 233, 42);
		panel_1.add(lblCambiarNombreDe);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(58, 96, 179, 33);
		panel_1.add(textField);
		
		JLabel lblCantidadDeProducto = new JLabel("Cantidad de producto");
		lblCantidadDeProducto.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCantidadDeProducto.setBounds(58, 139, 179, 42);
		panel_1.add(lblCantidadDeProducto);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(58, 284, 179, 31);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Precio");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(58, 232, 169, 42);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnGuardar = new JButton("  Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\Save-as_37111.png"));
		btnGuardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnGuardar.setBackground(new Color(4, 138, 153));
		btnGuardar.setBounds(80, 353, 157, 59);
		panel_1.add(btnGuardar);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 17));
		spinner.setBounds(58, 191, 169, 31);
		panel_1.add(spinner);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(486, 178, 710, 471);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Articulos", "Stock", "Precio Unitario"},
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
		table.setBounds(29, 62, 671, 164);
		panel.add(table);
		
		JLabel lblNewLabel = new JLabel("Ingrese ID para buscar el Producto");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(37, 259, 269, 42);
		panel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(47, 311, 179, 31);
		panel.add(textField_2);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\xmag_search_find_export_locate_5984.png"));
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuscar.setBackground(new Color(4, 138, 153));
		btnBuscar.setBounds(57, 363, 146, 59);
		panel.add(btnBuscar);
	}
}
