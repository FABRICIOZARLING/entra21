package ex02_JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//Instancial JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Ola Mundo!");
		rotulo.setBounds(50, 50, 300, 30);
	
		
		//adicionar componente ao JFrame
		formulario.add(rotulo);

	}

}
