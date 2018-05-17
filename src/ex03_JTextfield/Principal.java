package ex03_JTextfield;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(30, 30, 150, 20);
		
		//JTextfield
		JTextField campo = new JTextField();
		campo.setBounds(180, 30, 150, 20);
		//campo.setText("vc não pode digitar");
		//campo.setEnabled(false);

		//Adicionar elementos
		formulario.add(rotulo);
		formulario.add(campo);
		
		//exibir
		formulario.setVisible(true);
		
		
		
		
		
	}

}
