package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format.Field;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe09 {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Registro de produto e desconto com formulário de Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JLabel
		JLabel num1 = new JLabel("1º Número");
		num1.setBounds(30, 30, 100, 20);
		
		JLabel num2 = new JLabel("2º Número");
		num2.setBounds(30, 60, 100, 20);
		
		JLabel num3= new JLabel("3º Número");
		num3.setBounds(30, 90, 100, 20);
		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 210, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_num1 = new JTextField();
		c_num1 .setBounds(120, 30, 150, 20);
		JTextField c_num2 = new JTextField();
		c_num2.setBounds(120, 60, 150, 20);
		JTextField c_num3 = new JTextField();
		c_num3.setBounds(120, 90, 150, 20);
		
		
		
		
		//JButton
		
		JButton acao = new JButton("Verificar");
		acao.setBounds(30, 130, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center>O número menor é:<br>";
				int num[] = new int[3];
				num[0]= Integer.parseInt(String.valueOf(c_num1.getText()));
				num[1]= Integer.parseInt(String.valueOf(c_num2.getText()));
				num[2]= Integer.parseInt(String.valueOf(c_num3.getText()));
				for(int x =0; x<3; x++) {
					for(int y=x+1;y<3; y++) {
						if(num[x]>num[y]) {
							int n = num[x];
							num[x]=num[y];
							num[y]=n;
						}
					}
				}
				texto +=num[0];

				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});
		
		
		formulario.add(num1);
		formulario.add(num2);
		formulario.add(num3);
		formulario.add(c_num1);
		formulario.add(c_num2);
		formulario.add(c_num3);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
