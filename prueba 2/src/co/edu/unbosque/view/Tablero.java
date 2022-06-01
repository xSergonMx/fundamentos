package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Tablero extends JPanel{

	private Image imagen;
	private JButton dado;

	public Tablero() {
		setLayout(null );
		inicializarComponentes();
		setVisible(true);
	}
	public void inicializarComponentes() {
		
		dado = new JButton();
		dado.setText("dado");
		dado.setActionCommand("dado");
		dado.setBounds(800, 500, 100, 100);
		
		add(dado);
		
	}
	
//	public int[] lanzamiento() {
//		 
//		int[] resultados = new int[1]; //Se tiran tres dados
// 
//		resultados[0] = (int)(Math.random()*6 + 1); 
//		
//	
//		return resultados;
//	}
	@Override
	public void paint(Graphics g){
		imagen = new ImageIcon(getClass().getResource("/Imagenes/tablero.jpg")).getImage();
		g.drawImage(imagen, 0, 0, 1000, 700, getFocusCycleRootAncestor());

		setOpaque(false);

		super.paint(g);

	}
	public Image getImagen() {
		return imagen;
	}
	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
	public JButton getDado() {
		return dado;
	}
	public void setDado(JButton dado) {
		this.dado = dado;
	}

}

