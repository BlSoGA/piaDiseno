import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Inventario extends JFrame {

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
					Inventario frame = new Inventario();
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
	public Inventario() {
		setTitle("Inventario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBackground(new Color(224, 243, 242));
		setBounds(100, 100, 1212, 764);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(453, 179, 710, 471);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Articulo", "Stock", "Precio Unitario"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Articulo", "Stock", "New column"
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
		lblNewLabel.setBounds(37, 259, 269, 42);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		
		textField = new JTextField();
		textField.setBounds(47, 311, 179, 31);
		panel.add(textField);
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\xmag_search_find_export_locate_5984.png"));
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuscar.setBackground(new Color(4, 138, 153));
		btnBuscar.setBounds(57, 363, 146, 59);
		panel.add(btnBuscar);
		
		JButton btnEntradas = new JButton("Entradas");
		btnEntradas.setBounds(1006, 41, 146, 59);
		contentPane.add(btnEntradas);
		btnEntradas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntradas.setBackground(new Color(4, 138, 153));
		
		JButton btnSalidas = new JButton("Salidas");
		btnSalidas.setBounds(850, 110, 146, 59);
		contentPane.add(btnSalidas);
		btnSalidas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSalidas.setBackground(new Color(4, 138, 153));
		
		JButton btnProductos_2 = new JButton("Graficas");
		btnProductos_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2.setBackground(new Color(4, 138, 153));
		btnProductos_2.setBounds(1006, 110, 146, 59);
		contentPane.add(btnProductos_2);
		
		JButton btnProductos_2_1 = new JButton("Productos");
		btnProductos_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1.setBounds(850, 41, 146, 59);
		contentPane.add(btnProductos_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(61, 179, 334, 481);
		contentPane.add(panel_1);
		
		JLabel lblCambiarNombreDe = new JLabel("Cambiar Nombre de Producto");
		lblCambiarNombreDe.setBounds(58, 44, 233, 42);
		panel_1.add(lblCambiarNombreDe);
		lblCambiarNombreDe.setFont(new Font("Arial", Font.PLAIN, 17));
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 96, 179, 33);
		panel_1.add(textField_1);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_1.setColumns(10);
		
		JLabel lblCantidadDeProducto = new JLabel("Cantidad de producto");
		lblCantidadDeProducto.setBounds(58, 139, 179, 42);
		panel_1.add(lblCantidadDeProducto);
		lblCantidadDeProducto.setFont(new Font("Arial", Font.PLAIN, 17));
		
		textField_2 = new JTextField();
		textField_2.setBounds(58, 284, 179, 31);
		panel_1.add(textField_2);
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Precio");
		lblNewLabel_2_1.setBounds(58, 232, 169, 42);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 17));
		
		JButton btnGuardar = new JButton("  Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\Save-as_37111.png"));
		btnGuardar.setBounds(80, 353, 146, 59);
		panel_1.add(btnGuardar);
		btnGuardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnGuardar.setBackground(new Color(4, 138, 153));
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 17));
		spinner.setBounds(58, 191, 169, 31);
		panel_1.add(spinner);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUCTOS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_1.setBounds(300, 30, 391, 106);
		contentPane.add(lblNewLabel_1);
		
		JButton btnProductos_2_1_1 = new JButton("");
		btnProductos_2_1_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\back_arrow_14447.png"));
		btnProductos_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1_1.setBounds(81, 41, 74, 59);
		contentPane.add(btnProductos_2_1_1);
	}

}
