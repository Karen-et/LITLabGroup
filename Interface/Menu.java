import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Menu {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 232, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(SystemColor.inactiveCaptionText);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("Alta usuarios");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btnNewButton.setBounds(52, 162, 134, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Baja usuarios");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btnNewButton_1.setBounds(52, 196, 134, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btnNewButton_2.setBounds(75, 283, 91, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mauro\\Desktop\\4d3bbfff-ba29-46ff-b552-4249f3b67668.jpg"));
		lblNewLabel.setBounds(40, 37, 156, 96);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		
	}
	}

