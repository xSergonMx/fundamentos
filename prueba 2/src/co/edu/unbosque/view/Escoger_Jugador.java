package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Escoger_Jugador extends JPanel{
	
	private JLabel titulo;
	private JButton pc;
	private JButton duel;
	private JButton race;	
	private JButton chaos;
	private Image imagen;

	public Escoger_Jugador() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes(){
		
		titulo = new JLabel();
		titulo.setText("GAME MODE");
		titulo.setFont(new Font("Serif", Font.BOLD,50));
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(350, 50, 500, 100);
		
		pc = new JButton();
		pc.setText("pc");
		pc.setBounds(100, 200, 220, 180);
		pc.setActionCommand("pc");
		//ImageIcon imagen = new ImageIcon("Imagenes/sepientes.png");
		//Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(pc.getWidth(), pc.getHeight(), Image.SCALE_DEFAULT));
		//pc.setIcon(icono);
		
		
		
		duel = new JButton();
		duel.setText("duel");
		duel.setBounds(400, 200, 220, 180);
		
		race = new JButton();
		race.setText("race");
		race.setBounds(700, 200, 220, 180);
	
		
		chaos = new JButton();
		chaos.setText("chaos");
		chaos.setBounds(400, 430, 220, 180);
		
		add(titulo);
		add(pc);
		add(duel);
		add(race);
		add(chaos);
		
	}
	@Override
	public void paint(Graphics g){
		imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoEscoger.jpg")).getImage();
		g.drawImage(imagen, 0, 0, 1000, 700, getFocusCycleRootAncestor());
		
		setOpaque(false);
		
		super.paint(g);
		
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getPc() {
		return pc;
	}

	public void setPc(JButton pc) {
		this.pc = pc;
	}

	public JButton getDuel() {
		return duel;
	}

	public void setDuel(JButton duel) {
		this.duel = duel;
	}

	public JButton getRace() {
		return race;
	}

	public void setRace(JButton race) {
		this.race = race;
	}

	public JButton getChaos() {
		return chaos;
	}

	public void setChaos(JButton chaos) {
		this.chaos = chaos;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
	
}

