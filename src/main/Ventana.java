package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;      
import java.awt.*;          
import java.awt.event.*;    

public class Ventana extends JFrame{
	
	JLabel users_title;
	
	public Ventana() {
		
		
		this.setVisible(true);
		this.setSize(414, 537);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension (500,500));
		this.setMaximumSize(new Dimension (600,600));
		this.setTitle("hola");
		this.setBackground(Color.BLACK);
		this.setLayout(null);
		
	}

	public void calculadora() {
		JPanel contenedor = new JPanel();
		 contenedor.setSize(400,500);
		 contenedor.setLocation(0,0);
		 contenedor.setLayout(null);
		 contenedor.setBackground(Color.BLACK);
		 contenedor.setOpaque(true);
		 contenedor.setLayout(null);
		 contenedor.setVisible(true);
		 this.add(contenedor);
		 
		 JLabel console = new JLabel();
		 console.setText(" 180105");
		 console.setSize(300,50);
		 console.setLocation(50,20);
		 console.setOpaque(true);
		 console.setBackground(Color.BLACK);
		 console.setFont(new Font("Arial",Font.BOLD,15));
		 console.setForeground(Color.WHITE);
		 console.setHorizontalAlignment(JLabel.CENTER);
		 console.setBorder(BorderFactory.createLineBorder(Color.white,1,true));
		 contenedor.add(console);
		 
		JButton boton7 = new JButton("7");
		boton7.setBounds(50,80,60,60);
		boton7.setBackground(Color.BLACK);
		boton7.setForeground(Color.white);
		boton7.setFocusPainted(false);
		boton7.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(120,80,60,60);
		boton8.setBackground(Color.BLACK);
		boton8.setForeground(Color.white);
		boton8.setFocusPainted(false);
		boton8.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(190,80,60,60);
		boton9.setBackground(Color.BLACK);
		boton9.setForeground(Color.white);
		boton9.setFocusPainted(false);
		boton9.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton9);
		
		JButton botonDiv = new JButton("/");
		botonDiv.setBounds(260,80,90,60);
		botonDiv.setBackground(Color.decode("#008A39"));
		botonDiv.setForeground(Color.white);
		botonDiv.setFocusPainted(false);
		botonDiv.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonDiv);
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(50,150,60,60);
		boton4.setBackground(Color.BLACK);
		boton4.setForeground(Color.white);
		boton4.setFocusPainted(false);
		boton4.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(120,150,60,60);
		boton5.setBackground(Color.BLACK);
		boton5.setForeground(Color.white);
		boton5.setFocusPainted(false);
		boton5.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(190,150,60,60);
		boton6.setBackground(Color.BLACK);
		boton6.setForeground(Color.white);
		boton6.setFocusPainted(false);
		boton6.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton6);
		
		JButton botonMult = new JButton("x");
		botonMult.setBounds(260,150,90,60);
		botonMult.setBackground(Color.decode("#008A39"));
		botonMult.setForeground(Color.white);
		botonMult.setFocusPainted(false);
		botonMult.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonMult);
		
		JButton boton1 = new JButton("1");
		boton1.setBounds(50,220,60,60);
		boton1.setBackground(Color.BLACK);
		boton1.setForeground(Color.white);
		boton1.setFocusPainted(false);
		boton1.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(120,220,60,60);
		boton2.setBackground(Color.BLACK);
		boton2.setForeground(Color.white);
		boton2.setFocusPainted(false);
		boton2.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(190,220,60,60);
		boton3.setBackground(Color.BLACK);
		boton3.setForeground(Color.white);
		boton3.setFocusPainted(false);
		boton3.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton3);
		
		JButton botonRes = new JButton("-");
		botonRes.setBounds(260,220,90,60);
		botonRes.setBackground(Color.decode("#008A39"));
		botonRes.setForeground(Color.white);
		botonRes.setFocusPainted(false);
		botonRes.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonRes);
		
		/*JButton boton0 = new JButton("0");
		boton0.setBounds(50,290,60,60);
		boton0.setBackground(Color.BLACK);
		boton0.setForeground(Color.white);
		boton0.setFocusPainted(false);
		boton0.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton0);*/
		
		JButton botonPunto = new JButton(".");
		botonPunto.setBounds(120,290,60,60);
		botonPunto.setBackground(Color.BLACK);
		botonPunto.setForeground(Color.white);
		botonPunto.setFocusPainted(false);
		botonPunto.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonPunto);
		
		JButton botonParentesis = new JButton("( )");
		botonParentesis.setBounds(190,290,60,60);
		botonParentesis.setBackground(Color.BLACK);
		botonParentesis.setForeground(Color.white);
		botonParentesis.setFocusPainted(false);
		botonParentesis.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonParentesis);

		JButton botonSuma = new JButton("+");
		botonSuma.setBounds(260,290,90,60);
		botonSuma.setBackground(Color.decode("#008A39"));
		botonSuma.setForeground(Color.white);
		botonSuma.setFocusPainted(false);
		botonSuma.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonSuma);
		
		JButton botonANS2 = new JButton("ANS");
		botonANS2.setBounds(50,360,60,60);
		botonANS2.setBackground(Color.decode("#000CAB"));
		botonANS2.setForeground(Color.white);
		botonANS2.setFocusPainted(false);
		botonANS2.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonANS2);
		
		JButton botonDEL = new JButton("DEL");
		botonDEL.setBounds(120,360,60,60);
		botonDEL.setBackground(Color.decode("#000CAB"));
		botonDEL.setForeground(Color.white);
		botonDEL.setFocusPainted(false);
		botonDEL.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonDEL);
		
		JButton botonAC2 = new JButton("AC");
		botonAC2.setBounds(190,360,60,60);
		botonAC2.setBackground(Color.decode("#000CAB"));
		botonAC2.setForeground(Color.white);
		botonAC2.setFocusPainted(false);
		botonAC2.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonAC2);
		
		
		
		JButton botonIgual = new JButton("=");
		botonIgual.setBounds(260,360,90,60);
		botonIgual.setBackground(Color.decode("#AB0000"));
		botonIgual.setForeground(Color.white);
		botonIgual.setFocusPainted(false);
		botonIgual.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonIgual);
		
		botonIgual.repaint();
	}
	
	public void registro() {
		
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
	public void login() {
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
	}
	
	public void test() {

       
        JPanel test_panel = new JPanel();
        test_panel.setSize(414, 537);
        test_panel.setLocation(100, 50);
        test_panel.setBackground(Color.white);
        test_panel.setLayout(new BorderLayout(30, 30));
        this.add(test_panel);

       
        this.users_title = new JLabel("0");
        users_title.setFont(new Font("Arial", Font.BOLD, 32));
        users_title.setBackground(Color.decode("#222222"));
        users_title.setForeground(Color.WHITE);
        users_title.setHorizontalAlignment(SwingConstants.RIGHT);
        users_title.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 15));
        users_title.setOpaque(true);
        test_panel.add(users_title, BorderLayout.NORTH);

     
        JLabel users_title2 = new JLabel(" ");
        users_title2.setFont(new Font("Arial", Font.BOLD, 14));
        users_title2.setBackground(Color.decode("#222222"));
        users_title2.setForeground(Color.decode("#AAAAAA"));
        users_title2.setHorizontalAlignment(SwingConstants.CENTER);
        users_title2.setOpaque(true);
        users_title2.setPreferredSize(new Dimension(5, 0));
        test_panel.add(users_title2, BorderLayout.LINE_START);

        
        JLabel users_title3 = new JLabel(" ");
        users_title3.setFont(new Font("Arial", Font.BOLD, 14));
        users_title3.setBackground(Color.decode("#222222"));
        users_title3.setForeground(Color.decode("#AAAAAA"));
        users_title3.setHorizontalAlignment(SwingConstants.CENTER);
        users_title3.setOpaque(true);
        users_title3.setPreferredSize(new Dimension(5, 0));
        test_panel.add(users_title3, BorderLayout.LINE_END);

       
        JPanel center_panel = new JPanel();
        center_panel.setBackground(Color.decode("#1C1C1C"));
        center_panel.setLayout(new GridLayout(5, 4, 4, 4));

        String[] botones = {
                "AC", "(", ")", "%",
                "7", "8", "9", "x",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ".", "="
        };

       
        Color colorOp = Color.decode("#FF9F0A");
        Color colorFunc = Color.decode("#505050"); 
        Color colorNum = Color.decode("#333333"); 
        Color colorEqual = Color.decode("#FF9F0A"); 
        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            boton.setForeground(Color.WHITE);
            boton.setFocusPainted(false);
            boton.setBorderPainted(false);
            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

            
            if (texto.equals("=")) {
                boton.setBackground(colorEqual);
            } else if (texto.equals("x") || texto.equals("+") || texto.equals("-") || texto.equals("%")) {
                boton.setBackground(colorOp);
            } else if (texto.equals("AC") || texto.equals("(") || texto.equals(")") || texto.equals("+/-")) {
                boton.setBackground(colorFunc);
                boton.setForeground(Color.decode("#FF9F0A"));
            } else {
                boton.setBackground(colorNum);
            }

          
            Color base = boton.getBackground();
            boton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    boton.setBackground(base.brighter());
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    boton.setBackground(base);
                }
            });

            center_panel.add(boton);

            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String current = users_title.getText();

                    switch (texto) {

                        case "AC":

                            users_title.setText("0");
                            break;

                        case "+/-":

                        	try {
                                if (!current.equals("0") && !current.isEmpty()) {
                                    double val = Double.parseDouble(current);
                                    val = val * -1;
                                    users_title.setText(formatResult(val));
                                }
                            } catch (NumberFormatException ex) {
                               
                            }
                            break;

                        case "=":
                          
                            try {
                                String expr = current.replace("x", "*");
                                double result = evaluate(expr);
                                users_title.setText(formatResult(result));
                            } catch (Exception ex) {
                                users_title.setText("Error");
                            }
                            break;

                        default:
                          
                            if (current.equals("0") || current.equals("Error")) {
                               
                                if (texto.matches("[0-9]") || texto.equals(".")) {
                                    users_title.setText(texto);
                                } else {
                                    users_title.setText(current.equals("Error") ? texto : "0" + texto);
                                }
                            } else {
                                users_title.setText(current + texto);
                            }
                            break;
                    }
                }
            });
        }

        test_panel.add(center_panel, BorderLayout.CENTER);

      
        JPanel south_panel = new JPanel();
        south_panel.setBackground(Color.decode("#1C1C1C"));
        south_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        south_panel.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        String[] southBotones = { "DEL", "←", "CE", "√", "x²" };
        for (String t : southBotones) {
            JButton btn = new JButton(t);
            btn.setFont(new Font("Arial", Font.BOLD, 14));
            btn.setBackground(Color.decode("#505050"));
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setBorderPainted(false);
            btn.setPreferredSize(new Dimension(60, 35));
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

            btn.addMouseListener(new MouseAdapter() {
                Color base = btn.getBackground();

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(base.brighter());
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(base);
                }
            });

            btn.addActionListener(ev -> {
                String cur = users_title.getText();
                switch (t) {
                    case "DEL":
                    case "←":
                    	
                        if (!cur.equals("0") && !cur.isEmpty()) {
                            String s = cur.length() > 1 ? cur.substring(0, cur.length() - 1) : "0";
                            users_title.setText(s);
                        }
                        break;
                    case "CE":
                        users_title.setText("0");
                        break;
                    case "√":
                        try {
                            double val = Double.parseDouble(cur);
                            users_title.setText(formatResult(Math.sqrt(val)));
                        } catch (NumberFormatException ex) {
                            users_title.setText("Error");
                        }
                        break;
                    case "x²":
                        try {
                            double val = Double.parseDouble(cur);
                            users_title.setText(formatResult(val * val));
                        } catch (NumberFormatException ex) {
                            users_title.setText("Error");
                        }
                        break;
                }
            });

            south_panel.add(btn);
        }

        test_panel.add(south_panel, BorderLayout.SOUTH);
   }

    private double evaluate(String expr) {
        expr = expr.trim();
        return new ExprParser(expr).parse();
    }

    private String formatResult(double val) {
        if (val == Math.floor(val) && !Double.isInfinite(val)) {
            return String.valueOf((long) val);
        }
        return String.valueOf(val);
    }

    private static class ExprParser {
        private final String input;
        private int pos;

        ExprParser(String input) {
            this.input = input.replaceAll("\\s+", "");
            this.pos = 0;
        }

        double parse() {
            double result = parseExpr();
            if (pos != input.length())
                throw new RuntimeException("Unexpected: " + input.charAt(pos));
            return result;
        }

      
        private double parseExpr() {
            double result = parseTerm();
            while (pos < input.length()) {
                char c = input.charAt(pos);
                if (c == '+') {
                    pos++;
                    result += parseTerm();
                } else if (c == '-') {
                    pos++;
                    result -= parseTerm();
                } else
                    break;
            }
            return result;
        }

        private double parseTerm() {
            double result = parseFactor();
            while (pos < input.length()) {
                char c = input.charAt(pos);
                if (c == '*') {
                    pos++;
                    result *= parseFactor();
                } else if (c == '/') {
                    pos++;
                    double d = parseFactor();
                    if (d == 0)
                        throw new ArithmeticException("Div/0");
                    result /= d;
                } else if (c == '%') {
                    pos++;
                    result %= parseFactor();
                } else
                    break;
            }
            return result;
        }

       
        private double parseFactor() {
            if (pos < input.length() && input.charAt(pos) == '-') {
                pos++;
                return -parseFactor();
            }
            if (pos < input.length() && input.charAt(pos) == '(') {
                pos++; // consume '('
                double result = parseExpr();
                if (pos < input.length() && input.charAt(pos) == ')')
                    pos++;
                else
                    throw new RuntimeException("Missing )");
                return result;
            }
           
            int start = pos;
            if (pos < input.length() && input.charAt(pos) == '+')
                pos++;
            while (pos < input.length() && (Character.isDigit(input.charAt(pos)) || input.charAt(pos) == '.'))
                pos++;
            if (pos == start)
                throw new RuntimeException("Unexpected char at " + pos);
            return Double.parseDouble(input.substring(start, pos));
        }
    }
}
