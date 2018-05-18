package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe10 {

	public static void main(String[] args) {
		double[] moedas = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00};
		JFrame formulario = new JFrame("Registro de produto e desconto com formulário de Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JLabel
		JLabel inf= new JLabel("Digite a quantidade de cada Moeda");
		inf.setBounds(30, 30, 270, 20);
		
		JLabel c1 = new JLabel("R$ 0,01");
		c1.setBounds(30, 60, 100, 20);
		
		JLabel c5= new JLabel("R$ 0,05");
		c5.setBounds(30, 90, 100, 20);
		
		JLabel c10= new JLabel("R$ 0,10");
		c10.setBounds(30, 120, 100, 20);
		
		JLabel c25 = new JLabel("R$ 0,25");
		c25.setBounds(30, 150, 100, 20);
		
		JLabel c50= new JLabel("R$ 0,50");
		c50.setBounds(30, 180, 100, 20);
		
		JLabel c100= new JLabel("R$ 1,00");
		c100.setBounds(30, 210, 100, 20);
		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 270, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_c1 = new JTextField();
		c_c1.setBounds(120, 60, 150, 20);
		JTextField c_c5 = new JTextField();
		c_c5.setBounds(120, 90, 150, 20);
		JTextField c_c10 = new JTextField();
		c_c10.setBounds(120, 120, 150, 20);
		JTextField c_c25 = new JTextField();
		c_c25 .setBounds(120, 150, 150, 20);
		JTextField c_c50 = new JTextField();
		c_c50.setBounds(120, 180, 150, 20);
		JTextField c_c100 = new JTextField();
		c_c100.setBounds(120, 210, 150, 20);
		
		
		
		
		//JButton
		
		JButton acao = new JButton("Verificar");
		acao.setBounds(30, 240, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center>O total guardado é de:<br>R$ ";
				int[] quant = new int[6];
				quant[0]=Integer.parseInt(c_c1.getText());
				quant[1]=Integer.parseInt(c_c5.getText());
				quant[2]=Integer.parseInt(c_c10.getText());
				quant[3]=Integer.parseInt(c_c25.getText());
				quant[4]=Integer.parseInt(c_c50.getText());
				quant[5]=Integer.parseInt(c_c100.getText());
				
				double total =0.0;
				for(int x=0; x<6; x++) {
					total +=moedas[x]*quant[x];
				}
				texto +=String.format("%.2f", total);

				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});
		
		formulario.add(inf);
		formulario.add(c1);
		formulario.add(c5);
		formulario.add(c10);
		formulario.add(c25);
		formulario.add(c50);
		formulario.add(c100);
		formulario.add(c_c1);
		formulario.add(c_c5);
		formulario.add(c_c10);
		formulario.add(c_c25);
		formulario.add(c_c50);
		formulario.add(c_c100);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);


	}

}
