package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class TicTacToe extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		Botongato[][] tablero = new Botongato[3][3];
	    String turno = "X";

	    JLabel lblX;
	    JLabel lblO;

	    int puntosX = 0;
	    int puntosO = 0;

	    public TicTacToe() {

	        setTitle("Tic Tac Toe");
	        setSize(400, 450);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        getContentPane().setLayout(new BorderLayout());

	       
	        JPanel panelTop = new JPanel(new GridLayout(1, 2));
	        panelTop.setBackground(new Color(153, 204, 102));

	        lblX = new JLabel("X: 0", SwingConstants.CENTER);
	        lblO = new JLabel("O: 0", SwingConstants.CENTER);
	        lblO.setBackground(new Color(255, 255, 255));

	        lblX.setForeground(Color.WHITE);
	        lblO.setForeground(Color.WHITE);
	        lblX.setFont(new Font("Arial", Font.BOLD, 16));
	        lblO.setFont(new Font("Arial", Font.BOLD, 16));

	        panelTop.add(lblX);
	        panelTop.add(lblO);

	        getContentPane().add(panelTop, BorderLayout.NORTH);

	       
	        JPanel panelBoard = new JPanel(new GridLayout(3, 3));
	        panelBoard.setBackground(new Color(255, 228, 225));

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {

	                Botongato boton = new Botongato(i, j);
	                tablero[i][j] = boton;

	                boton.setFont(new Font("Arial", Font.BOLD, 30));
	                boton.setBackground(Color.WHITE);

	                boton.addActionListener(e -> jugar(boton));

	                panelBoard.add(boton);
	            }
	        }

	        getContentPane().add(panelBoard, BorderLayout.CENTER);

	       
	        JPanel panelBottom = new JPanel();
	        panelBottom.setBackground(new Color(153, 204, 102));

	        JButton btnReiniciar = new JButton("Reiniciar");
	        btnReiniciar.setBackground(new Color(255, 228, 225));

	        btnReiniciar.addActionListener(e -> reiniciar());

	        panelBottom.add(btnReiniciar);

	        getContentPane().add(panelBottom, BorderLayout.SOUTH);

	        setVisible(true);
	    }

	    
	    public void jugar(Botongato boton) {

	        if (!boton.getValor().equals("")) return;

	        boton.setValor(turno);

	        if (verificarGanador(turno)) {

	            JOptionPane.showMessageDialog(this, "Gano " + turno);
	            
	            if (turno.equals("X")) {
	                puntosX++;
	            } else {
	                puntosO++;
	            }

	            actualizarMarcador();
	            reiniciar();
	            return;
	        }

	        turno = turno.equals("X") ? "O" : "X";
	    }

	    public boolean verificarGanador(String jugador) {

	        for (int i = 0; i < 3; i++) {
	            if (tablero[i][0].getValor().equals(jugador) &&
	                tablero[i][1].getValor().equals(jugador) &&
	                tablero[i][2].getValor().equals(jugador)) return true;
	        }

	        for (int j = 0; j < 3; j++) {
	            if (tablero[0][j].getValor().equals(jugador) &&
	                tablero[1][j].getValor().equals(jugador) &&
	                tablero[2][j].getValor().equals(jugador)) return true;
	        }

	        if (tablero[0][0].getValor().equals(jugador) &&
	            tablero[1][1].getValor().equals(jugador) &&
	            tablero[2][2].getValor().equals(jugador)) return true;

	        if (tablero[0][2].getValor().equals(jugador) &&
	            tablero[1][1].getValor().equals(jugador) &&
	            tablero[2][0].getValor().equals(jugador)) return true;

	        return false;
	    }

	    
	    public void reiniciar() {

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tablero[i][j].setValor("");
	            }
	        }

	        turno = "X";
	    }

	    public void actualizarMarcador() {
	        lblX.setText("X: " + puntosX);
	        lblO.setText("O: " + puntosO);
	    }

	    public static void main(String[] args) {
	        new TicTacToe();
	    }
	}