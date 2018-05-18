package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe13 {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Formulário");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JLabel
		JLabel inf= new JLabel("Digite o número");
		inf.setBounds(30, 30, 270, 20);
		
		JLabel num = new JLabel("Número");
		num .setBounds(30, 60, 100, 20);

		

		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 120, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_num = new JTextField();
		c_num .setBounds(120, 60, 150, 20);


		
		//JButton
		
		JButton acao = new JButton("Verificar");
		acao.setBounds(30, 90, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center><br>";
				int num = Integer.parseInt(c_num.getText());
				texto +="Antecessor: "+(num-1)+"<br>Sucessor: "+(num+1);
				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});
		
		formulario.add(inf);
		formulario.add(num);
		formulario.add(c_num);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
