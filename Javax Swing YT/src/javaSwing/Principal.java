package javaSwing;

import javax.swing.*;
// importamos todas las clases del paquete javax.swing

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco = new miMarco();
		
		marco.setVisible(true);//Hacemos visible la ventana
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Al cerrar la ventana termina el proceso de compilado
		marco.setTitle("Titulo");
		marco.setLocation(800,400);
	}

}

class miMarco extends JFrame{
	
	//Constructor
	public miMarco() {
		
		setSize(500,300); //Establecemos el tamaño de la ventana
		/*
		nota: el tamaño de la venta va a variar dependiendo de la resolucion
		del monitor podemos detectar la resolucion de cada pantalla usando la clase
		toolkit pero es mas complicado
		*/
	}
	
}
