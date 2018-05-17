package ex04_JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.KeyStore.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JButton");
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
		
		//JButton
		JButton  botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(100, 60, 150, 20);
		
		//adicionar uma ação ao botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//exibir nome
				JOptionPane.showMessageDialog(null, "ola "+campo.getText() );
				campo.setText("");
				campo.requestFocus();

			}
		});
	

		//Adicionar elementos
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);

		
		//exibir
		formulario.setVisible(true);
		


	}

}
