package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;

public class Alta_De_Usuario {

	private JFrame frmAltaDeUsuario;
	private JTextField tfNombre;
	private JTextField tfApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alta_De_Usuario window = new Alta_De_Usuario();
					window.frmAltaDeUsuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Alta_De_Usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAltaDeUsuario = new JFrame();
		frmAltaDeUsuario.setAlwaysOnTop(true);
		frmAltaDeUsuario.setAutoRequestFocus(false);
		frmAltaDeUsuario.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Estudio\\Pictures\\pink flower.png"));
		frmAltaDeUsuario.setTitle("Alta De Usuario");
		frmAltaDeUsuario.setBounds(100, 100, 450, 300);
		frmAltaDeUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAltaDeUsuario.getContentPane().setLayout(null);
		frmAltaDeUsuario.setVisible(false);
		frmAltaDeUsuario.setUndecorated(true);
		frmAltaDeUsuario.setBounds(100, 100, 434, 260);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir... ", "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysand\u00FA", "R\u00EDo Negro", "Rivera", "Rocha", "Salto", "San Jos\u00E9", "Soriano", "Tacuaremb\u00F3"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(207, 136, 196, 22);
		frmAltaDeUsuario.getContentPane().add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(358, 173, 30, 20);
		frmAltaDeUsuario.getContentPane().add(spinner);
		
		JLabel lblCantidadDeHijos = new JLabel("CANTIDAD DE HIJOS");
		lblCantidadDeHijos.setForeground(Color.WHITE);
		lblCantidadDeHijos.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		lblCantidadDeHijos.setBounds(207, 167, 181, 29);
		frmAltaDeUsuario.getContentPane().add(lblCantidadDeHijos);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBounds(258, 227, 89, 23);
		frmAltaDeUsuario.getContentPane().add(btnEnviar);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(207, 34, 196, 20);
		frmAltaDeUsuario.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setColumns(10);
		tfApellido.setBounds(207, 82, 196, 20);
		frmAltaDeUsuario.getContentPane().add(tfApellido);
		
		JLabel lcono = new JLabel("New label");
		lcono.setIcon(new ImageIcon("C:\\Users\\Estudio\\Downloads\\undraw_Mobile_application_mr4r (1) (2) (1) (1).png"));
		lcono.setBounds(26, 44, 153, 132);
		frmAltaDeUsuario.getContentPane().add(lcono);
		
		JLabel Texto2 = new JLabel("DEPARTAMENTO");
		Texto2.setForeground(Color.WHITE);
		Texto2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		Texto2.setBounds(207, 113, 134, 29);
		frmAltaDeUsuario.getContentPane().add(Texto2);
		
		JLabel texto1 = new JLabel("NOMBRE");
		texto1.setForeground(Color.WHITE);
		texto1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		texto1.setBounds(207, 11, 60, 29);
		frmAltaDeUsuario.getContentPane().add(texto1);
		
		JLabel Texto2_1 = new JLabel("APELLIDO");
		Texto2_1.setForeground(Color.WHITE);
		Texto2_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		Texto2_1.setBounds(207, 57, 85, 29);
		frmAltaDeUsuario.getContentPane().add(Texto2_1);
		
		JLabel Fondo = new JLabel("New label");
		Fondo.setFont(new Font("Team Athletics", Font.BOLD, 11));
		Fondo.setIcon(new ImageIcon("C:\\Users\\Estudio\\Downloads\\background (1).jpg"));
		Fondo.setBounds(0, 0, 434, 260);
		frmAltaDeUsuario.getContentPane().add(Fondo);
	}
}
