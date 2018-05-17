package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exe01 {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Cadastro formulário de Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel nome = new JLabel();
		nome.setText("Nome");
		nome.setBounds(30, 30, 100, 20);
		
		JLabel idade = new JLabel();
		idade.setText("Idade");
		idade.setBounds(30, 60, 100, 20);
		
		JLabel cidade = new JLabel();
		cidade.setText("Cidade");
		cidade.setBounds(30, 90, 100, 20);
		
		
		//JTextfield
		JTextField c_nome = new JTextField();
		c_nome.setBounds(120, 30, 150, 20);
		JTextField c_idade = new JTextField();
		c_idade.setBounds(120, 60, 150, 20);
		JTextField c_cidade = new JTextField();
		c_cidade.setBounds(120, 90, 150, 20);
		
		//JButton
		
		JButton acao = new JButton("Exibir");
		acao.setBounds(30, 150, 280, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "";
				texto += "Seu nome é "+c_nome.getText();
				texto += "\nSua idade é "+c_idade.getText()+" anos";
				texto += "\nMora na cidade de "+c_cidade.getText();
				JOptionPane.showMessageDialog(null, texto);
				
			}
		});
		
		
		formulario.add(nome);
		formulario.add(idade);
		formulario.add(cidade);
		formulario.add(c_cidade);
		formulario.add(c_nome);
		formulario.add(c_idade);
		formulario.add(acao);
		
		//Exibir
		formulario.setVisible(true);

	}

}
