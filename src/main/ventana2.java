package main;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class ventana2 extends JFrame implements ActionListener {

    JTextField txtCapital, txtTiempo, txtTasa;
    JTextField txtInteres, txtMonto;

    JButton calcular, cancelar;

    public ventana2(){

        setTitle("Calculando el Interés");
        setSize(450,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        crearInterfaz();
    }

    public void crearInterfaz(){

      
        JPanel principal = new JPanel();
        principal.setBackground(new Color(230,210,150));
        principal.setLayout(new BorderLayout(10,10));
        add(principal);

       
        JLabel titulo = new JLabel("Interés");
        titulo.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,26));
        titulo.setForeground(Color.RED);

        principal.add(titulo, BorderLayout.NORTH);

       
        JPanel panelDatos = new JPanel();
        panelDatos.setBackground(new Color(140,230,140));
        panelDatos.setBorder(new TitledBorder("Calcular Interés"));
        panelDatos.setLayout(new GridLayout(4,2,10,10));

        txtCapital = new JTextField();
        txtTiempo = new JTextField();
        txtTasa = new JTextField();

        panelDatos.add(new JLabel("Capital:"));
        panelDatos.add(txtCapital);

        panelDatos.add(new JLabel("Tiempo:"));
        panelDatos.add(txtTiempo);

        panelDatos.add(new JLabel("Tasa Interés:"));
        panelDatos.add(txtTasa);

        calcular = new JButton("Calcular");
        cancelar = new JButton("Cancelar");

        calcular.addActionListener(this);
        cancelar.addActionListener(this);

        panelDatos.add(calcular);
        panelDatos.add(cancelar);

        principal.add(panelDatos, BorderLayout.CENTER);

        

        JPanel panelResultados = new JPanel();
        panelResultados.setBackground(new Color(240,140,140));
        panelResultados.setLayout(new GridLayout(2,2,10,10));

        txtInteres = new JTextField();
        txtMonto = new JTextField();

        txtInteres.setEditable(false);
        txtMonto.setEditable(false);

        panelResultados.add(new JLabel("Interés:"));
        panelResultados.add(txtInteres);

        panelResultados.add(new JLabel("Monto:"));
        panelResultados.add(txtMonto);

        principal.add(panelResultados, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==calcular){

            double capital = Double.parseDouble(txtCapital.getText());
            double tiempo = Double.parseDouble(txtTiempo.getText());
            double tasa = Double.parseDouble(txtTasa.getText());

            double interes = capital * tasa * tiempo;
            double monto = capital + interes;

            txtInteres.setText(String.valueOf(interes));
            txtMonto.setText(String.valueOf(monto));
        }

        if(e.getSource()==cancelar){

            txtCapital.setText("");
            txtTiempo.setText("");
            txtTasa.setText("");
            txtInteres.setText("");
            txtMonto.setText("");
        }
    }
}