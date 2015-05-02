package aplicacionG01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class partida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					partida frame = new partida();
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
	public partida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MODO DE JUEGO");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(65, 11, 152, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRINCIPIANTE");
		lblNewLabel_1.setBounds(41, 58, 84, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnDiscos = new JButton("3 DISCOS");
		btnDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			prin3 prin3=new prin3();
			prin3.setVisible(true);
			}
		});
		btnDiscos.setBounds(27, 83, 89, 23);
		contentPane.add(btnDiscos);
		
		JButton btnDiscos_1 = new JButton("4 DISCOS");
		btnDiscos_1.setBounds(27, 130, 89, 23);
		contentPane.add(btnDiscos_1);
		
		JButton btnDiscos_2 = new JButton("5 DISCOS");
		btnDiscos_2.setBounds(182, 130, 89, 23);
		contentPane.add(btnDiscos_2);
		
		JButton btnDiscos_3 = new JButton("6 DISCOS");
		btnDiscos_3.setBounds(182, 83, 89, 23);
		contentPane.add(btnDiscos_3);
		
		JButton btnDiscos_4 = new JButton("7 DISCOS");
		btnDiscos_4.setBounds(113, 207, 89, 23);
		contentPane.add(btnDiscos_4);
		
		JButton btnDiscos_5 = new JButton("8 DISCOS");
		btnDiscos_5.setBounds(113, 260, 89, 23);
		contentPane.add(btnDiscos_5);
		
		JLabel lblNewLabel_2 = new JLabel("MEDIO");
		lblNewLabel_2.setBounds(206, 58, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblExperto = new JLabel("EXPERTO");
		lblExperto.setBounds(126, 182, 61, 14);
		contentPane.add(lblExperto);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana regreso=new ventana();
	regreso.setVisible(true);
	dispose();
	
			}
		});
		btnMenu.setBounds(317, 302, 89, 23);
		contentPane.add(btnMenu);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\IPC1A_Practica2_201318564\\aplicacionG01\\T1.jpg"));
		lblNewLabel_3.setBounds(292, 148, 114, 94);
		contentPane.add(lblNewLabel_3);
	}

}
