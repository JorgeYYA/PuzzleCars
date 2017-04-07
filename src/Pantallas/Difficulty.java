package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Difficulty extends JFrame {

	private JPanel contentPane;

	
	public Difficulty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		Image img = new ImageIcon(this.getClass().getResource("/Set_difficulty.png")).getImage();
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				System.out.println("click");
				
			}
		});
		
		btnNewButton.setBounds(140, 117, 126, 45);
		contentPane.add(btnNewButton);
		
		
		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setBounds(140, 174, 125, 44);
		contentPane.add(btnNewButton_1);
		//btnNewButton_1.setVisible(false);
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(null);
		btnNewButton_2.setBounds(140, 231, 125, 44);
		contentPane.add(btnNewButton_2);
		//btnNewButton_2.setVisible(false);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(5, 5, 406, 400);
		lblFondo.setIcon(new ImageIcon(img));
		contentPane.add(lblFondo);
		
		
		Image img1 = new ImageIcon(this.getClass().getResource("/Screen_3_boton1.png")).getImage();		
		btnNewButton.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("/Screen_3_boton2.png")).getImage();		
		btnNewButton_1.setIcon(new ImageIcon(img2));
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Screen_3_boton3.png")).getImage();		
		btnNewButton_2.setIcon(new ImageIcon(img3));
	}
}
	
