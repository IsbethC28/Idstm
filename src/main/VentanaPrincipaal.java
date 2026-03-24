package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class VentanaPrincipaal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipaal frame = new VentanaPrincipaal();
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
	public VentanaPrincipaal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans-ArrayList y POO");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(62, 0, 319, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 25, 434, 57);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2,4));
		
		JLabel lblNewLabel_4 = new JLabel("Documento");
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dirección");
		panel.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Teléfono");
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos de factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 82, 434, 50);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("N° Factura");
		panel_1.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha");
		panel_1.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 131, 434, 37);
		contentPane.add(panel_2);
		
		JButton btnNewButton = new JButton("Ver listado de facturas");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Añadir");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(50, 205, 50));
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(btnNewButton_2);
		btnNewButton_2.setForeground(new Color(220, 20, 60));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 169, 434, 63);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "10", "20"},
				{"Cereal", "5", "50", null},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub total"
			}
		));
		scrollPane.setViewportView(table);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}
}
