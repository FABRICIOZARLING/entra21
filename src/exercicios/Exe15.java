package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exe15 {

	public static void main(String[] args) {
		double [] diarias = {45.0, 65.0, 110.0};
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Formulário");
		formulario.setLayout(null);
		
		JLabel inf= new JLabel("Check-in no Hotel");
		inf.setBounds(30, 30, 270, 20);
		
		JLabel apto = new JLabel("Apartamento");
		apto .setBounds(30, 60, 100, 20);
		
		JLabel diaria = new JLabel("Dias");
		diaria .setBounds(30, 90, 100, 20);

		JLabel resultado = new JLabel();
		resultado.setBounds(30, 150, 250, 70); 
		
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(120, 60, 150, 20);
		combo.addItem("Apt Simples");
		combo.addItem("Apt Duplo");
		combo.addItem("Suíte Luxo");
		
		JTextField c_diaria = new JTextField();
		c_diaria .setBounds(120, 90, 150, 20);
		//JButton
		
		JButton acao = new JButton("Verificar");
		acao.setBounds(30, 120, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center><br>";
				texto+= "O total a pagar é R$ "+String.format("%.2f", (diarias[combo.getSelectedIndex()]*Integer.parseInt(c_diaria.getText())));
				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});

		
		//Adicione ao JFrame
		formulario.add(inf);
		formulario.add(apto);
		formulario.add(diaria);
		formulario.add(combo);
		formulario.add(acao);
		formulario.add(c_diaria);
		formulario.add(resultado);
		
		//exibir
		
		formulario.setVisible(true);

	}

}
