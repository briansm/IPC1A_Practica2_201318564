package aplicacionG01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("TORRES DE HANOI");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblMenu.setBounds(137, 11, 199, 41);
		lblMenu.setForeground(new Color(128, 0, 0));
		lblMenu.setBackground(new Color(0, 0, 0));
		contentPane.add(lblMenu);
		
		JButton btnNewButton = new JButton("INICIAR ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 partida partida=new partida();
			        partida.setVisible(true);
			        dispose();
			}
		});
		btnNewButton.setBounds(234, 129, 102, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OPCIONES");
		btnNewButton_1.setBounds(278, 189, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnComoJugar = new JButton("COMO JUGAR");
		btnComoJugar.setBounds(328, 247, 124, 23);
		contentPane.add(btnComoJugar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\IPC1A_Practica2_201318564\\aplicacionG01\\images.jpg"));
		lblNewLabel.setBounds(21, 63, 205, 241);
		contentPane.add(lblNewLabel);
	}
}
