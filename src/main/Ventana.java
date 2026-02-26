package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		
		this.setVisible(true);
		this.setSize(1000,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension (500,500));
		this.setMaximumSize(new Dimension (600,600));
		this.setTitle("hola");
		this.setBackground(Color.BLACK);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.decode("#EAE9E7"));
		contenedor.setSize(500,500);
		contenedor.setLocation(0, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200,30);
		title_login.setOpaque(true);
		title_login.setLocation(145, 30);
		title_login.setBackground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(30, 150);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(175, 400);
		acceder.setSize(145,50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		
		contenedor.repaint();
		contenedor.revalidate();
	
		
		JPanel registrer_container = new JPanel();
		registrer_container.setLocation(510, 0);
		registrer_container.setSize(500, 500);
		registrer_container.setOpaque(true);
		registrer_container.setBackground(Color.decode("#EAE9E7"));
		registrer_container.setLayout(null);
		this.add(registrer_container);
		
		JLabel bio_tag = new JLabel("Biografía");
		bio_tag.setBounds(100, 100, 250, 40);
		bio_tag.setBackground(Color.white);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		registrer_container.add(bio_tag);
		
		
		JTextArea bio = new JTextArea();
		bio.setBounds(120, 160, 250, 120);
		registrer_container.add(bio);
		
		JCheckBox sweet_option = new JCheckBox ("Dulce");
		sweet_option.setBounds(120, 330, 100, 50);
		registrer_container.add(sweet_option);
		
		
		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(220, 330, 100, 50);
		registrer_container.add(salty_option);
		
		JCheckBox healthy = new JCheckBox("Saludable");
		healthy.setBounds(320, 330, 100, 50);
		registrer_container.add(healthy);

		
		JRadioButton acept_terms = new JRadioButton("Aceptar");
        acept_terms.setBounds(120, 300, 100, 30);
        registrer_container.add(acept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazar");
        reject_terms.setBounds(250, 300, 100, 30);
        registrer_container.add(reject_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(acept_terms);
        terms.add(reject_terms);

   
        JButton registrar = new JButton("Registrar");
        registrar.setBounds(175, 360, 150, 40);
        registrer_container.add(registrar);

        this.setVisible(true); 
		
		
		
		registrer_container.repaint();
	}

}
