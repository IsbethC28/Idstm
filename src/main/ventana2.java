package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

        //crearInterfaz();
        pintar();
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
    
    public void pintar () {
    	JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.setColor(Color.blue);
                g2d.fillRect(0, 0, 500, 500);

                g2d.setColor(Color.cyan);
                g2d.fillRect(100, 150, 300, 200);
           
                g2d.setColor(Color.lightGray);
                g2d.fillRect(80, 120, 340, 40);

                g2d.setColor(Color.BLACK);
                g2d.fillRect(350, 80, 40, 60);
                
                g2d.setColor(Color.white);
                g2d.fillRect(140, 180, 100, 100);

                g2d.setColor(Color.cyan);
                g2d.fillRect(150, 190, 30, 80);
                g2d.fillRect(190, 190, 30, 80);
                
                g2d.setColor(Color.lightGray);
                g2d.fillRect(130, 280, 120, 15);

              
                g2d.setColor(Color.GRAY);
                g2d.fillRect(280, 180, 80, 150);

                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(290, 190, 60, 130);
                
             
                g2d.setColor(Color.YELLOW);
                g2d.fillRect(340, 250, 10, 10);

               
                g2d.setColor(Color.GREEN);
                g2d.fillRect(0, 350, 500, 50);

               
                g2d.setColor(new Color(120, 70, 0));
                g2d.fillRect(0, 400, 500, 50);
                
                g2d.setColor(Color.ORANGE);
                g2d.fillRect(400, 260, 50, 90);

                
            }
    	};
    	
    	pane.setSize(1000,700);
    	pane.setLocation(0, 0);
    	this.add(pane);
    }
}