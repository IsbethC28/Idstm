package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class ventanaa3 {

	private JFrame frmRegistroDeUsuarios;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaa3 window = new ventanaa3();
					window.frmRegistroDeUsuarios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaa3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeUsuarios = new JFrame();
		frmRegistroDeUsuarios.setBounds(100, 100, 450, 300);
		frmRegistroDeUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeUsuarios.getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel titulo = new JLabel("Registro de Usuarios");
		titulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 26 ));
		titulo.setForeground(Color.RED);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(252, 255, 198));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos generales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmRegistroDeUsuarios.getContentPane().add(panel);
		panel.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombres:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido Materno:");
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento:");
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		panel.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("M");
		panel_4.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("F");
		panel_4.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_5 = new JLabel("Nacionalidad:");
		panel.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perú", "México", "Chile", "Argentina"}));
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Perfil del Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(204, 248, 177));
		frmRegistroDeUsuarios.getContentPane().add(panel_1);
		
		JLabel lblFoto = new JLabel("foto");
		ImageIcon foto = new ImageIcon ("usuario.png");
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBackground(new Color(240, 240, 240));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\doña isbeth\\OneDrive\\Desktop\\29479ba0435741580ca9f4a467be6207.jpg"));
		panel_1.add(lblNewLabel_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		panel_1.add(chckbxNewCheckBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(188, 222, 203));
		panel_2.setBorder(new TitledBorder(null, "Datos Opcionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmRegistroDeUsuarios.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Descripción:");
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Preferencias:");
		panel_2.add(lblNewLabel_8);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1);
		
		JList list = new JList();
		scrollPane_1.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar", "Escuchar música", "Leer", "Deportes", "Jugar videojuegos", "Dormir", "Otros"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(252, 255, 198));
		frmRegistroDeUsuarios.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Nuevo");
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		panel_3.add(btnNewButton_2);
	}

}
