package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe04 {
	public static void main(String[] args) {
		JFrame formulario = new JFrame("Registro de produto e desconto com formulário de Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JLabel
		JLabel produto = new JLabel("Produto");
		produto.setBounds(30, 30, 100, 20);
		
		JLabel valor = new JLabel("Valor");
		valor.setBounds(30, 60, 100, 20);
		
		JLabel pagamento= new JLabel("Pagamento");
		pagamento.setBounds(30, 90, 100, 20);
		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 210, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_prod = new JTextField();
		c_prod .setBounds(120, 30, 150, 20);
		JTextField c_valor = new JTextField();
		c_valor.setBounds(120, 60, 150, 20);
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(120, 90, 150, 20);
		combo.addItem("Á Prazo");
		combo.addItem("Á vista");
		
		
		
		//JButton
		
		JButton acao = new JButton("Calcular preço");
		acao.setBounds(30, 150, 250, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "O produto "+produto.getText()+" custará R$ ";
				if(Double.parseDouble(c_valor.getText())>500&&combo.getSelectedIndex()==1) {
					texto += String.format("%.2f", (Double.parseDouble(c_valor.getText())*0.9));
				}else {
					texto += String.format("%.2f", Double.parseDouble(c_valor.getText()));
				}
				texto = "<html><div style=\"width: 200px;\"><center>"+texto+"</center><div></html>";
				resultado.setText(texto);
				
				
			}
		});
		
		
		formulario.add(produto);
		formulario.add(valor);
		formulario.add(pagamento);
		formulario.add(c_prod);
		formulario.add(c_valor);
		formulario.add(combo);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);
	}

}
