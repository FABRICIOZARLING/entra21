package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe08 {

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
		
		JLabel operacao= new JLabel("Operação");
		operacao.setBounds(30, 90, 100, 20);
		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 210, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_num1 = new JTextField();
		c_num1 .setBounds(120, 30, 150, 20);
		JTextField c_num2 = new JTextField();
		c_num2.setBounds(120, 60, 150, 20);
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(120, 90, 150, 20);
		combo.addItem("Adição");
		combo.addItem("Subtração");
		combo.addItem("Multiplicação");
		combo.addItem("Divisão");
		
		
		
		//JButton
		
		JButton acao = new JButton("Calcular");
		acao.setBounds(30, 130, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center>Resultado<br>";
				int num1, num2, equacao;
				num1=Integer.parseInt(c_num1.getText());
				num2=Integer.parseInt(c_num2.getText());
				equacao=combo.getSelectedIndex();
				if(equacao==0) {
					texto+=num1+num2;
				}else if(equacao==1) {
					texto+=num1-num2;
				}else if(equacao==2) {
					texto+=num1*num2;
				}else {
					if(num1%num2==0) {
						texto+=num1/num2;
					}else {
						texto+=(num1*1.0)/num2;

					}
				}
				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});
		
		
		formulario.add(num1);
		formulario.add(num2);
		formulario.add(operacao);
		formulario.add(c_num1);
		formulario.add(c_num2);
		formulario.add(combo);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
