package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class Inicio extends JPanel {
	
	private Image imagen;
	private JLabel titulo;
	private JButton jugar;
	private JButton tutorial;
	private JButton historial;
	
	
	
	public Inicio(){
		setLayout(new GridLayout(4,1));
		inicializarComponentes();
		setVisible(true);
		setSize(200,200);
	}
	
	public void inicializarComponentes(){
		
		titulo = new JLabel();
		titulo.setText("ESCALERAS Y SERPIENTES");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("serif",Font.BOLD,40));
		titulo.setForeground(Color.green);
		
		jugar = new JButton();
		jugar.setText("Jugar");
		jugar.setActionCommand("jugar");
		jugar.setForeground(Color.GREEN);
		jugar.setFont(new Font("serif",Font.BOLD,30));
		jugar.setBorder(null);
		jugar.setBorderPainted(false);
		jugar.setFocusPainted(false);
		jugar.setContentAreaFilled(false);
		
		tutorial = new JButton();
		tutorial.setText("Tutorial");
		tutorial.setActionCommand("tuto");
		tutorial.setForeground(Color.GREEN);
		tutorial.setFont(new Font("serif",Font.BOLD,30));
		tutorial.setBorder(null);
		tutorial.setBorderPainted(false);
		tutorial.setFocusPainted(false);
		tutorial.setContentAreaFilled(false);
		
		historial = new JButton();
		historial.setText("Historial");
		historial.setActionCommand("historia");
		historial.setForeground(Color.GREEN);
		historial.setFont(new Font("serif",Font.BOLD,30));
		historial.setBorder(null);
		historial.setBorderPainted(false);
		historial.setFocusPainted(false);
		historial.setContentAreaFilled(false);
		
		add(titulo);
		add(jugar);
		add(tutorial);
		add(historial);
		
}
	@Override
	public void paint(Graphics g){
		imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg")).getImage();
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

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getJugar() {
		return jugar;
	}

	public void setJugar(JButton jugar) {
		this.jugar = jugar;
	}

	public JButton getTutorial() {
		return tutorial;
	}

	public void setTutorial(JButton tutorial) {
		this.tutorial = tutorial;
	}

	public JButton getHistorial() {
		return historial;
	}

	public void setHistorial(JButton historial) {
		this.historial = historial;
	}

	
		
	}

		
	

	
	

