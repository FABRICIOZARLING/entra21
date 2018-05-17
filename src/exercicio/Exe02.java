package exercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exe02 {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Valor com formulário de Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel valor = new JLabel("Difite o valor");
		valor.setBounds(30, 30, 100, 20);
		
	
		
		//JTextfield
		JTextField c_valor = new JTextField();
		c_valor.setBounds(120, 30, 150, 20);

		//JButton
		
		JButton acao = new JButton("Exibir");
		acao.setBounds(30, 60, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double desconto = Double.parseDouble(c_valor.getText());
				desconto = desconto -(desconto*0.1);
				
				String texto = "Com desconto o valor fica R$ "+String.format("%.2f", desconto);
				
				JOptionPane.showMessageDialog(null, texto);
				
			}
		});
		
		formulario.add(valor);
		formulario.add(c_valor);
		formulario.add(acao);
		
		//Exibir
		formulario.setVisible(true);


	}

}
