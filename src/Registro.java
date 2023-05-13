import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Label;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setTitle("Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1391, 781);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Informaci\u00F3n de Empleados");
		lblNewLabel_3.setBounds(731, 67, 636, 64);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 40));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Usuario"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(807, 186, 465, 33);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(749, 238, 580, 334);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(46, 10, 504, 271);
		panel.add(table);
		table.setFont(new Font("Arial", Font.PLAIN, 17));
		table.setBorder(new CompoundBorder(null, new LineBorder(new Color(0, 0, 0), 1, true)));
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Empleado0", "Tel\u00E9fono"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID ", "Empleado", "Tel\u00E9fono"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(41);
		table.getColumnModel().getColumn(0).setMinWidth(17);
		table.getColumnModel().getColumn(1).setPreferredWidth(153);
		table.getColumnModel().getColumn(2).setPreferredWidth(86);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setBackground(new Color(255, 255, 255));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(67, 592, 517, -472);
		contentPane.add(desktopPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(104, 78, 567, 656);
		contentPane.add(panel_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(188, 391, 324, 31);
		panel_1.add(passwordField_1);
		passwordField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 322, 324, 31);
		panel_1.add(passwordField);
		passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(188, 256, 324, 33);
		panel_1.add(textField_2);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 191, 324, 33);
		panel_1.add(textField_1);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(188, 119, 324, 33);
		panel_1.add(textField);
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Empleado");
		lblNewLabel_1_1.setBounds(24, 119, 123, 33);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Empleado");
		lblNewLabel_1.setBounds(24, 191, 154, 33);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_2 = new JLabel("N\u00FAmero tel.");
		lblNewLabel_1_2.setBounds(24, 256, 123, 33);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 17));
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setBounds(24, 322, 115, 30);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		
		JLabel lblNewLabel_2_1 = new JLabel("Repetir Contrase\u00F1a");
		lblNewLabel_2_1.setBounds(24, 391, 179, 30);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 17));
		
		JButton btnNewButton = new JButton("  Guardar");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\Save-as_37111.png"));
		btnNewButton.setBackground(new Color(4, 138, 153));
		btnNewButton.setBounds(110, 506, 154, 57);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("Usuarios");
		lblNewLabel_3_1.setBounds(0, 29, 567, 57);
		panel_1.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setBackground(new Color(0, 255, 64));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		
		JButton btnEditar = new JButton("  Editar");
		btnEditar.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\documentediting_editdocuments_text_documentedi_2820.png"));
		btnEditar.setBackground(new Color(4, 138, 153));
		btnEditar.setBounds(336, 506, 141, 57);
		panel_1.add(btnEditar);
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btnProductos_2_1_1 = new JButton("");
		btnProductos_2_1_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\sofy\\Diseño\\piaDiseno\\Imagenes\\back_arrow_14447.png"));
		btnProductos_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnProductos_2_1_1.setBackground(new Color(4, 138, 153));
		btnProductos_2_1_1.setBounds(33, 10, 81, 59);
		contentPane.add(btnProductos_2_1_1);
	}
}
