package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exe06 {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Calculos com formulário de Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel num1 = new JLabel("1º número");
		num1.setBounds(30, 30, 100, 20);
		
		JLabel num2 = new JLabel("2º número");
		num2.setBounds(30, 60, 100, 20);
		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 210, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_num1 = new JTextField();
		c_num1 .setBounds(120, 30, 150, 20);
		JTextField c_num2 = new JTextField();
		c_num2.setBounds(120, 60, 150, 20);

		
		
		
		//JButton
		
		JButton acao = new JButton("Calcular");
		acao.setBounds(30, 150, 250, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 
				int n1=0, n2=0;
				boolean valida = false;
				String texto ="";
				try {
					n1=Integer.parseInt(c_num1.getText());
					n2=Integer.parseInt(c_num2.getText());
					valida=true;
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Algum número digitado é inválido N1"+c_num1.getText()+" N2"+c_num2.getText());
				}
				if(valida==true) {
					if(n1==n2){
						texto = "Soma -  Resultado: "+(n1+n2);
					}else {
						texto = "Multiplicação -  Resultado: "+(n1*n2);
					}
					resultado.setText("<html><div style=\"width: 200px;\"><center>"+texto+"</center><div></html>");

				}
				
				
			}
		});
		
		
		formulario.add(num1);
		formulario.add(num2);
		formulario.add(c_num1);
		formulario.add(c_num2);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
