package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exe07 {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Número para tabuada");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel num = new JLabel("Número");
		num.setBounds(30, 30, 100, 20);
		

		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30,100, 250, 50); 
		//resultado.setLocation(30, 100);
		//resultado.setSize(250, 50);
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_num = new JTextField();
		c_num.setBounds(120, 30, 160, 20);

		
		
		
		//JButton
		
		JButton acao = new JButton("Calcular");
		acao.setBounds(30, 60, 250, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 
				String texto = "Tabuada";
				int numero = Integer.parseInt(c_num.getText());
				for(int x = 0; x<11; x++) {
					texto+="<br>"+numero+" x "+x+" = "+(numero*x);
					resultado.setSize(250, (x*20));
				}
				resultado.setText("<html><div style=\"width: 200px;\"><center>"+texto+"</center><div></html>");

			}
		});
		
		
		formulario.add(num);
		formulario.add(c_num);

		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
