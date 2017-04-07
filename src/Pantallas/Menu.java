package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(5, 5, 405, 400);
		Image img = new ImageIcon(this.getClass().getResource("/Menu_juego.png")).getImage();
		contentPane.setLayout(null);
		
		JButton Start = new JButton("");
		Image imgStart = new ImageIcon(this.getClass().getResource("/Menu_juego_boton1.png")).getImage();
		Start.setIcon(new ImageIcon(imgStart));
		Start.setBounds(144, 164, 123, 55);
		contentPane.add(Start);
		
		JButton chooseDificulty = new JButton("");
		chooseDificulty.setBounds(107, 250, 195, 48);
		contentPane.add(chooseDificulty);
		lblFondo.setIcon(new ImageIcon(img));
		contentPane.add(lblFondo);
		Image imgChooseDificulty = new ImageIcon(this.getClass().getResource("/Menu_juego_boton2.png")).getImage();
		chooseDificulty.setIcon(new ImageIcon(imgChooseDificulty));
		
		
	}
}
