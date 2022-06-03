//hola yo cambio esto
package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Jugadores;
import co.edu.unbosque.view.*;

public class Controlador implements ActionListener{
	
	private Ventana ventana;
	private Jugadores j;
	private Escoger_Jugador escoger;
	

	public Controlador() {
		ventana = new Ventana();
		escoger = new Escoger_Jugador();
		asignarOyentes();
	}
	
	public int[] lanzamiento(int dado) {
		 
		int[] resultados = new int[1]; //Se tiran tres dados

		resultados[0] = (int)(Math.random()*6 + 1); 
		
	
		return resultados;
	}

	public void asignarOyentes(){
		ventana.getStart().getJugar().addActionListener(this);
		ventana.getStart().getTutorial().addActionListener(this);
		ventana.getStart().getHistorial().addActionListener(this);
		ventana.getEscoger().getPc().addActionListener(this);
		ventana.getAvatar().getDado().addActionListener(this);;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Comando = e.getActionCommand();

		if(Comando.equals("jugar")) {
			
			ventana.getStart().setVisible(false); 
			ventana.getContentPane().add(escoger);
			
			
		}
		
		if(Comando.equals("tuto")) {
			JOptionPane.showMessageDialog(ventana, "1. Para empezar seleccione el bot�n jugar"+"\n"+"2. Seleccione el modo de juego de su preferencia"+"\n"+"3. Escoja su avatar"+"\n"+"4. Escoja un mapa"+"\n"+"5. tire del dado para avanzar"+"\n"+"6. Si cae en una casilla con escalera deber� responder correctamente una pregunta para poder subir"+"\n"+"7. Por el contrario, si cae en una serpiente deber� responder correctamente una pregunta para evitar descender"+"\n"+"8. Ganar� el primero en llegar al otro extremo del tablero"+"\n"+"�BUENA SUERTE!");

		}
		if(Comando.equals("pc")){

			ventana.getStart().setVisible(true); 
			ventana.getEscoger().setVisible(false);
		}
		
		if(Comando.equals("dado")) {
			lanzamiento(0);
			 
		}
	}

}
