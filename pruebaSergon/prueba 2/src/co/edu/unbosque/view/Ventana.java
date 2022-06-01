package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Ventana extends JFrame{

	
	private Inicio start;
	private Escoger_Jugador escoger;
	private Tablero avatar;
	
	public Ventana(){
		setTitle("Escaleras y Serpientes");
		setSize(1000,700);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicializarComponentes();
		
		setResizable(false);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		getContentPane().setLayout(new BorderLayout());
		
		start = new Inicio();
		escoger = new Escoger_Jugador();
		avatar = new Tablero();
		
		
		
		//getContentPane().add(start, BorderLayout.CENTER);
		getContentPane().add(avatar, BorderLayout.CENTER);
		//getContentPane().add(escoger, BorderLayout.CENTER); 
		
	}
	
	

	public Inicio getStart() {
		return start;
	}

	public void setStart(Inicio start) {
		this.start = start;
	}

	public Escoger_Jugador getEscoger() {
		return escoger;
	}

	public void setEscoger(Escoger_Jugador escoger) {
		this.escoger = escoger;
	}

	public Tablero getAvatar() {
		return avatar;
	}

	public void setAvatar(Tablero avatar) {
		this.avatar = avatar;
	}

	
		
	}

	
	

