import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Entradas extends JFrame {
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
					Entradas frame = new Entradas();
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
	public Entradas() {
		setTitle("Entradas");
		getContentPane().setBackground(new Color(224, 243, 242));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1107, 755);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(92, 195, 764, 513);
		getContentPane().add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Articulo", "Fecha", "Cantidad"},
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
		table.setBounds(51, 81, 671, 108);
		panel.add(table);
		
		JLabel lblNewLabel = new JLabel("Ingrese ID para buscar el Producto");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(66, 220, 269, 42);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(66, 259, 179, 31);
		panel.add(textField);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(new Color(255, 255, 255));
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\xmag_search_find_export_locate_5984.png"));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuscar.setBackground(new Color(4, 138, 153));
		btnBuscar.setBounds(447, 364, 146, 59);
		panel.add(btnBuscar);
		
		JLabel lblIngreseNombreDel = new JLabel("Ingrese Nombre del Producto para Buscar ");
		lblIngreseNombreDel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblIngreseNombreDel.setBounds(66, 300, 332, 42);
		panel.add(lblIngreseNombreDel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(66, 339, 179, 31);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(66, 380, 269, 42);
		panel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(66, 415, 179, 31);
		panel.add(textField_2);
		
		JButton btnEntradas = new JButton("Entradas");
		btnEntradas.setForeground(new Color(255, 255, 255));
		btnEntradas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntradas.setBackground(new Color(4, 138, 153));
		btnEntradas.setBounds(904, 38, 146, 59);
		getContentPane().add(btnEntradas);
		
		JButton btnSalidas = new JButton("Salidas");
		btnSalidas.setForeground(new Color(255, 255, 255));
		btnSalidas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSalidas.setBackground(new Color(4, 138, 153));
		btnSalidas.setBounds(748, 107, 146, 59);
		getContentPane().add(btnSalidas);
		
		JButton btnProductos_2 = new JButton("Estad\u00EDsticas");
		btnProductos_2.setForeground(new Color(255, 255, 255));
		btnProductos_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2.setBackground(new Color(4, 138, 153));
		btnProductos_2.setBounds(904, 107, 146, 59);
		getContentPane().add(btnProductos_2);
		
		JButton btnProductos_2_1 = new JButton("Productos");
		btnProductos_2_1.setForeground(new Color(255, 255, 255));
		btnProductos_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1.setBounds(748, 38, 146, 59);
		getContentPane().add(btnProductos_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("ENTRADAS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_1.setBounds(247, 61, 391, 106);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnProductos_2_1_1 = new JButton("");
		btnProductos_2_1_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\back_arrow_14447.png"));
		btnProductos_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1_1.setBounds(61, 38, 71, 59);
		getContentPane().add(btnProductos_2_1_1);
	}

}
