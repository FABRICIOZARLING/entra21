package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe12 {

	public static void main(String[] args) {
		String[][] multas = {
				{"30","200,00"},
				{"10","100,00"},
				{"0","50,00"},
		};
		JFrame formulario = new JFrame("Formulário");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JLabel
		JLabel inf= new JLabel("Digite as velocidades");
		inf.setBounds(30, 30, 270, 20);
		
		JLabel vel_perm = new JLabel("Velocidade Permitida");
		vel_perm .setBounds(30, 60, 180, 20);
		
		JLabel vel_veic= new JLabel("Velocidade veículo");
		vel_veic.setBounds(30, 90, 180, 20);
		

		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 150, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_vel_perm = new JTextField();
		c_vel_perm .setBounds(200, 60, 70, 20);
		JTextField c_vel_veic= new JTextField();
		c_vel_veic.setBounds(200, 90, 70, 20);

		
		//JButton
		
		JButton acao = new JButton("Verificar");
		acao.setBounds(30, 120, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center><br>";
				double[] veloc= new double[2];
				veloc[0] = Double.parseDouble(c_vel_perm.getText());
				veloc[1] = Double.parseDouble(c_vel_veic.getText());
				if(veloc[1]-veloc[0]<=0) {
					texto += "Bom Motorista";
				}else {
					for(int x=0; x<multas.length; x++) {
						if(Double.parseDouble(multas[x][0])<veloc[1]-veloc[0]) {
							texto += "Multa de R$"+multas[x][1]+" <br>Ultrapassou "+(veloc[1]-veloc[0])+" km";
							x=multas.length;
						}
					}
				}

				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});
		
		formulario.add(inf);
		formulario.add(vel_perm);
		formulario.add(vel_veic);
		formulario.add(c_vel_perm);
		formulario.add(c_vel_veic);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
