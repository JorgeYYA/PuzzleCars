package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Juego extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton coche = new JButton("coche");
		coche.setBounds(163, 191, 89, 23);
		contentPane.add(coche);
		
		JLabel fondo = new JLabel("");
		fondo.setBounds(5, 5, 409, 400);
		fondo.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(fondo);
		Image imgfondo = new ImageIcon(this.getClass().getResource("/Screen_1_2.png")).getImage();		
		fondo.setIcon(new ImageIcon(imgfondo));
	}
}
