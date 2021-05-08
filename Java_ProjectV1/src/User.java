import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class User extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public User() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 232, 317);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Alta Usuarios");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
		        AltaUser a1 = new AltaUser();
		        a1.setVisible(true);}
		});
		btnNewButton.setBounds(24, 114, 174, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Baja Usuarios");
		btnNewButton_1.setBounds(24, 148, 174, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblMenDeInicio = new JLabel("Men\u00FA de inicio");
		lblMenDeInicio.setForeground(SystemColor.inactiveCaptionBorder);
		lblMenDeInicio.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		lblMenDeInicio.setBounds(33, 25, 165, 33);
		contentPane.add(lblMenDeInicio);
		
		JButton btnCerrar = new JButton("Salir");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {dispose();
			}
		});
		btnCerrar.setBounds(24, 245, 174, 23);
		contentPane.add(btnCerrar);
	}
}
