import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.accessibility.AccessibleIcon;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSpinner;

public class AltaUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) throws ExceptionsValidator{
		Persona [] usuario = new Persona [1];
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaUser frame = new AltaUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AltaUser() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 320);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);//coloca el frame en el centro de la pantalla.
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		
		btnAtrs.setBounds(10, 286, 89, 23);
		contentPane.add(btnAtrs);
		
		textField = new JTextField();
		textField.setBounds(149, 73, 199, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblClientes = new JLabel("Alta Usuario");
		lblClientes.setForeground(SystemColor.inactiveCaptionBorder);
		lblClientes.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		lblClientes.setBounds(10, 11, 265, 33);
		contentPane.add(lblClientes);
		
		JLabel lblCdigoCliente = new JLabel("Nombre");
		lblCdigoCliente.setForeground(SystemColor.inactiveCaptionBorder);
		lblCdigoCliente.setFont(new Font("Calibri Light", Font.PLAIN, 16));
		lblCdigoCliente.setBounds(10, 69, 56, 33);
		contentPane.add(lblCdigoCliente);
		
		JLabel lblNombre = new JLabel("Apellido");
		lblNombre.setForeground(SystemColor.inactiveCaptionBorder);
		lblNombre.setFont(new Font("Calibri Light", Font.PLAIN, 16));
		lblNombre.setBounds(10, 113, 61, 33);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(149, 117, 199, 20);
		contentPane.add(textField_1);
		
		JComboBox departamento = new JComboBox();
		departamento.setModel(new DefaultComboBoxModel(new String[] {"Elegir... ", "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysand\u00FA", "R\u00EDo Negro", "Rivera", "Rocha", "Salto", "San Jos\u00E9", "Soriano", "Tacuaremb\u00F3"}));
		departamento.setBounds(149, 161, 193, 20);
		contentPane.add(departamento);
		
		JLabel lblAccin = new JLabel("Departamento");
		lblAccin.setForeground(SystemColor.inactiveCaptionBorder);
		lblAccin.setFont(new Font("Calibri Light", Font.PLAIN, 16));
		lblAccin.setBounds(10, 157, 103, 33);
		contentPane.add(lblAccin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setVisible(false);
		lblNewLabel.setBounds(10, 261, 421, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNoPuedeEstar = new JLabel("");
		lblNoPuedeEstar.setForeground(Color.YELLOW);
		lblNoPuedeEstar.setFont(new Font("Calibri Light", Font.PLAIN, 16));
		lblNoPuedeEstar.setBounds(10, 245, 499, 33);
		contentPane.add(lblNoPuedeEstar);
		lblNoPuedeEstar.setVisible(false);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(298, 204, 50, 23);
		contentPane.add(spinner);
		
		JLabel lblCantidadDeHijos = new JLabel("Cantidad de hijos");
		lblCantidadDeHijos.setForeground(SystemColor.inactiveCaptionBorder);
		lblCantidadDeHijos.setFont(new Font("Calibri Light", Font.PLAIN, 16));
		lblCantidadDeHijos.setBounds(10, 201, 138, 33);
		contentPane.add(lblCantidadDeHijos);	
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				String nombre = textField.getText();
				String apellido = textField_1.getText();
				int posicion = departamento.getSelectedIndex();//ComboBox
				int hijos = (int) spinner.getValue();//Spinner
				try {
					if(nombre.isEmpty()) {
						throw new ExceptionsValidator("El nombre no puede estar vacio");
					}
					if (apellido.isEmpty()) {
						throw new ExceptionsValidator("El apellido no puede estar vacio");
					}
					if(posicion==0) {
						throw new ExceptionsValidator("Debe seleccionar un Departamento");
					}
					String seleccionDpto = departamento.getSelectedItem().toString();
					Persona usuario = new Persona(0,nombre, apellido, seleccionDpto, (byte) hijos);
					lblNoPuedeEstar.setText("El usuario ha sido dado de alta");
					System.out.println(usuario);
				} catch (Exception e) {
						String error=e.getMessage();
						lblNoPuedeEstar.setText(error);
						lblNoPuedeEstar.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(420, 286, 89, 23);
		contentPane.add(btnNewButton);
	}
}
