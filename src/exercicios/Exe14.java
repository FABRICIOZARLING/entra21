package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe14 {

	public static void main(String[] args) {
		String[][] imposto = {
				{"25000","15", "20"},
				{"12000","10", "15"},
				{"0","5", "0"},
		};
		JFrame formulario = new JFrame("Formulário");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JLabel
		JLabel inf= new JLabel("Imposto sobre o veículo");
		inf.setBounds(30, 30, 270, 20);
		
		JLabel valor = new JLabel("Valor");
		valor .setBounds(30, 60, 100, 20);

		

		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 120, 250, 70); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_valor = new JTextField();
		c_valor .setBounds(120, 60, 150, 20);


		
		//JButton
		
		JButton acao = new JButton("Verificar");
		acao.setBounds(30, 90, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center><br>";
				double preco = Double.parseDouble(c_valor.getText());
				for(int x =0; x<imposto.length; x++) {
					if(Double.parseDouble(imposto[x][0])<preco) {
						texto += "Imposto: R$"+String.format("%.2f", preco*(Integer.parseInt(imposto[x][2])/100.0));
						texto += "<br>Distribuidor: R$"+String.format("%.2f", preco*(Integer.parseInt(imposto[x][1])/100.0));
						x=imposto.length;
					}
				}
				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});
		
		formulario.add(inf);
		formulario.add(valor);
		formulario.add(c_valor);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);


	}

}
