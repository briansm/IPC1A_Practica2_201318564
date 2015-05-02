package aplicacionG01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prin3 extends JFrame {

	private JPanel contentPane;
	private JTextField discos;
	private JTextField serpiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prin3 frame = new prin3();
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
	public prin3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 134, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Brian\\Desktop\\WARNING\\Documentos\\progra\\serpiente2.png"));
		lblNewLabel.setBounds(87, 71, 54, 201);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Brian\\Desktop\\WARNING\\Documentos\\progra\\serpiente3.png"));
		lblNewLabel_1.setBounds(358, 71, 54, 201);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Brian\\Desktop\\WARNING\\Documentos\\progra\\serpiente4.png"));
		lblNewLabel_2.setBounds(223, 71, 54, 201);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTorresDeHanoi = new JLabel("TORRES DE HANOI");
		lblTorresDeHanoi.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblTorresDeHanoi.setBounds(162, 11, 189, 25);
		contentPane.add(lblTorresDeHanoi);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Brian\\Desktop\\WARNING\\Documentos\\progra\\AGU.png"));
		lblNewLabel_3.setBounds(39, 270, 120, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Brian\\Desktop\\WARNING\\Documentos\\progra\\AGU.png"));
		label.setBounds(184, 270, 120, 36);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Brian\\Desktop\\WARNING\\Documentos\\progra\\AGU.png"));
		label_1.setBounds(327, 270, 120, 36);
		contentPane.add(label_1);
		
		final JLabel rojo = new JLabel("");
		rojo.setIcon(new ImageIcon("C:\\IPC1A_Practica2_201318564\\r.png"));
		rojo.setBackground(new Color(255, 0, 0));
		rojo.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		rojo.setHorizontalAlignment(SwingConstants.CENTER);
		rojo.setBounds(57, 247, 121, 14);
		contentPane.add(rojo);
		
		final JLabel azul = new JLabel("New label");
		azul.setIcon(new ImageIcon("C:\\IPC1A_Practica2_201318564\\az.png"));
		azul.setBounds(65, 222, 94, 14);
		contentPane.add(azul);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\IPC1A_Practica2_201318564\\am.png"));
		lblNewLabel_5.setBounds(49, 188, 67, -15);
		contentPane.add(lblNewLabel_5);
		
		final JLabel amarillo = new JLabel("New label");
		amarillo.setIcon(new ImageIcon("C:\\IPC1A_Practica2_201318564\\am.png"));
		amarillo.setBounds(87, 197, 56, 14);
		contentPane.add(amarillo);
		
		JLabel lblElegirDisco = new JLabel("Elegir disco");
		lblElegirDisco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblElegirDisco.setBounds(50, 334, 109, 25);
		contentPane.add(lblElegirDisco);
		
		JButton btnAceptar = new JButton("aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ndisco=Integer.parseInt(discos.getText());
				int nserp=Integer.parseInt(serpiente.getText());
              switch(ndisco){
              case 1:
            	  if(nserp==2){
            		   amarillo.setLocation(225, 247);
            	  }else{
            		  amarillo.setLocation(353, 247);	
            	  }
              break;
              case 2:
            	  if(nserp==2){
            		   azul.setLocation(202, 247);
            	  }else{
            		  azul.setLocation(341, 247);	
            	  }
              break; 
              case 3:
            	  if(nserp==2){
            		   rojo.setLocation(225, 247);
            	  }else{
            		  rojo.setLocation(341, 247);	
            	  }
              break;
              	default:
              		JOptionPane.showMessageDialog(null, ("no hay tantos disco y solo hay 3 serpientes"));
              }
               discos.setText("");
               serpiente.setText("");
			}
		});
		btnAceptar.setBounds(369, 368, 89, 23);
		contentPane.add(btnAceptar);
		
		discos = new JTextField();
		discos.setBounds(55, 369, 86, 20);
		contentPane.add(discos);
		discos.setColumns(10);
		
		JLabel lblElegirSerpiente = new JLabel("Elegir serpiente");
		lblElegirSerpiente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblElegirSerpiente.setBounds(182, 335, 122, 22);
		contentPane.add(lblElegirSerpiente);
		
		serpiente = new JTextField();
		serpiente.setBounds(202, 369, 86, 20);
		contentPane.add(serpiente);
		serpiente.setColumns(10);
		
		JButton btnMenu = new JButton("VOLVER");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				partida menu=new partida();
				menu.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(10, 11, 89, 23);
		contentPane.add(btnMenu);
	}
}
