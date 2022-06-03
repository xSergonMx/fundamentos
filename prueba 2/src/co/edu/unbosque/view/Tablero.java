package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class Tablero extends JPanel{

	private Image imagen;
	private JLabel jugador;
	private JButton dad;

	public Tablero() {
		setLayout(null );
		inicializarComponentes();
		setVisible(true);
	}
	public void inicializarComponentes() {
		
		dad = new JButton();
		dad.setText("dado");
		dad.setActionCommand("dado");
		dad.setBounds(800, 500, 100, 100);
		
		jugador = new JLabel();
		jugador.setIcon(new ImageIcon(getClass().getResource("/Imagenes/serpientes.png")));
		jugador.setBounds(200, 300, 100, 100);
		
		add(dad);
		add(jugador);
		
		
	}
	
		
	
	int arr[][][] = {
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {-2,-2}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {-3,3}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {2,1}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {-5,-3}, {0,0}},
			{{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}}
			
			};
	
	public int posicion_actual( int dado, int pos[]){

		dado = (int) (Math.random()*6+1);

		 pos = new int [1];

		for (int i = 1; i < dado+1; i++) {
			if(pos[1] < 9) {
				pos[1] += 1;
			}
			else {
				pos = [pos[0]-1,0]; 
			}

		}

		return ver_img(arr,pos);

	}
	
	public int ver_img(int pos[], int[][] arr){
		
		pos = new int[1];
		arr = new int [pos[0]][pos[1]];
		
		getJugador();
		
	
		
		return [pos[0] +(arr[0]), pos[1] +(arr[1])];
	}
	

	
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
	
	public JLabel getJugador() {
		return jugador;
	}
	public void setJugador(JLabel jugador) {
		this.jugador = jugador;
	}
	public JButton getDad() {
		return dad;
	}
	public void setDad(JButton dad) {
		this.dad = dad;
	}
	public int[][][] getArr() {
		return arr;
	}
	public void setArr(int[][][] arr) {
		this.arr = arr;
	}

}

