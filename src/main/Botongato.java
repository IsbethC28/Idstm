package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botongato  extends JButton {

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String valor;
	    private int fila;
	    private int columna;

	    public Botongato(int fila, int columna) {
	        this.fila = fila;
	        this.columna = columna;
	        this.valor = "";

	        setFont(new Font("Arial", Font.BOLD, 60));
	        setFocusPainted(false);
	        setOpaque(true);

	        setBorder(BorderFactory.createLineBorder(new Color(255,228,225), 4));
	        setBackground(Color.WHITE);
	    }

	    public String getValor() {
	        return valor;
	    }

	    public void setValor(String valor) {
	        this.valor = valor;
	        setText(valor);

	        if (valor.equals("X")) {
	            setBackground(new Color(255,228,255));
	        } else if (valor.equals("O")) {
	            setBackground(new Color(153,204,102));
	        } else {
	            setBackground(Color.WHITE);
	        }
	    }

	    public int getFila() {
	        return fila;
	    }

	    public int getColumna() {
	        return columna;
	    }
}


