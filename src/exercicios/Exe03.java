package exercicios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exe03 {
	
	public static void main(String[] args) {
		JFrame formulario = new JFrame("Media de notas com formulário de Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel n1 = new JLabel("Nota 1");
		n1 .setBounds(30, 30, 100, 20);
		
		JLabel n2 = new JLabel("Nota 2");
		n2.setBounds(30, 60, 100, 20);
		
		JLabel n3 = new JLabel("Nota 3");
		n3.setBounds(30, 90, 100, 20);
		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 210, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_n1 = new JTextField();
		c_n1 .setBounds(120, 30, 150, 20);
		JTextField c_n2 = new JTextField();
		c_n2.setBounds(120, 60, 150, 20);
		JTextField c_n3 = new JTextField();
		c_n3.setBounds(120, 90, 150, 20); 
		
		//JButton
		
		JButton acao = new JButton("Exibir situação");
		acao.setBounds(30, 150, 250, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double media = (Double.parseDouble(c_n1.getText())+Double.parseDouble(c_n2.getText())+Double.parseDouble(c_n3.getText()))/3.0;
				
				String texto = "<html><div style=\"width: 200px;\"><center>A situação do aluno";
				texto+= "<br>Média "+String.format("%.2f",media );
				texto+="<br>Situação: ";
				if(media<5) {
					texto +="Reprovado";
				}else if(media<7) {
					texto +="Em Exame";
				}else {;
					texto +="Aprovado";
				}
				texto +="</center><div></html>";
				
				resultado.setText(texto);
				c_n1.setText("");
				c_n2.setText("");
				c_n3.setText("");
				
			}
		});
		
		
		formulario.add(n1);
		formulario.add(n2);
		formulario.add(n3);
		formulario.add(c_n1);
		formulario.add(c_n2);
		formulario.add(c_n3);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);
		
		

	}


}
