import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1332, 790);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(23, 64, 567, 656);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(188, 256, 324, 33);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(188, 191, 324, 33);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(188, 119, 324, 33);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Cliente");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(24, 119, 123, 33);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Cliente");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(24, 190, 154, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("N\u00FAmero tel.");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(24, 256, 123, 33);
		panel_1.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(4, 138, 153));
		btnNewButton.setBounds(105, 487, 123, 45);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("Usuarios");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_3_1.setBackground(new Color(0, 255, 64));
		lblNewLabel_3_1.setBounds(0, 29, 567, 57);
		panel_1.add(lblNewLabel_3_1);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEditar.setBackground(new Color(4, 138, 153));
		btnEditar.setBounds(341, 487, 123, 45);
		panel_1.add(btnEditar);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(188, 322, 324, 33);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Correo");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(24, 322, 123, 33);
		panel_1.add(lblNewLabel_1_2_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(673, 164, 580, 334);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Cliente", "Tel.", "Correo"},
				{"", null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setToolTipText("Cliente\r\n");
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setFont(new Font("Arial", Font.PLAIN, 17));
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new CompoundBorder(null, new LineBorder(new Color(0, 0, 0), 1, true)));
		table.setBackground(Color.WHITE);
		table.setBounds(46, 10, 504, 271);
		panel.add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(50);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cliente"}));
		comboBox.setToolTipText("\r\n");
		comboBox.setFont(new Font("Arial", Font.PLAIN, 17));
		comboBox.setBounds(673, 92, 465, 33);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Informaci\u00F3n de Clientes");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_3.setBounds(672, 23, 636, 64);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
