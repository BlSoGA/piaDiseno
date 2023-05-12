import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class index extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField jpassClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setTitle("Inicio de Sesi\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 348);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(224, 243, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char [] clave = jpassClave.getPassword();
				String claveFinal = new String (clave);
				
				if (txtUser.getText().equals("Sofia") && claveFinal.equals("123")){
						dispose();
						JOptionPane.showMessageDialog(null,"Bienvenidos al sistema","Ingresaste",JOptionPane.INFORMATION_MESSAGE);
				Inicio i = new Inicio();
				i.setVisible(true);
						
			} else{
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
				txtUser.setText("");
				jpassClave.setText("");
				txtUser.requestFocus();
			}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(192, 198, 96, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Inicio de Sesi\u00F3n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 40, 456, 29);
		contentPane.add(lblNewLabel);
		
		txtUser = new JTextField();
		txtUser.setBounds(183, 107, 125, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(183, 149, 125, 20);
		contentPane.add(jpassClave);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(89, 108, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(86, 150, 89, 14);
		contentPane.add(lblNewLabel_2);
	}
}
