package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe11 {

	public static void main(String[] args) {
		String[][] resultados = {
				{"4.99","Reprovado"},
				{"6.99","Em Exame"},
				{"8.99","Bom"},
				{"9.99","Ótimo"},
				{"10","Parabéns"},
		};
		JFrame formulario = new JFrame("Formulário");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JLabel
		JLabel inf= new JLabel("Digite as notas e as faltas");
		inf.setBounds(30, 30, 270, 20);
		
		JLabel n1 = new JLabel("Nota 1");
		n1.setBounds(30, 60, 100, 20);
		
		JLabel n2= new JLabel("Nota 2");
		n2.setBounds(30, 90, 100, 20);
		
		JLabel n3= new JLabel("Nota 3");
		n3.setBounds(30, 120, 100, 20);
		
		JLabel n4 = new JLabel("Nota 4");
		n4.setBounds(30, 150, 100, 20);
		
		JLabel faltas= new JLabel("Faltas");
		faltas.setBounds(30, 180, 100, 20);
		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 270, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_n1 = new JTextField();
		c_n1.setBounds(120, 60, 150, 20);
		JTextField c_n2 = new JTextField();
		c_n2.setBounds(120, 90, 150, 20);
		JTextField c_n3 = new JTextField();
		c_n3.setBounds(120, 120, 150, 20);
		JTextField c_n4 = new JTextField();
		c_n4 .setBounds(120, 150, 150, 20);
		JTextField c_faltas = new JTextField();
		c_faltas.setBounds(120, 180, 150, 20);

		
		
		
		
		//JButton
		
		JButton acao = new JButton("Verificar");
		acao.setBounds(30, 240, 240, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "<html><div style=\"width: 200px;\"><center>Situação<br>";
				double notas[] = new double[4];
				int faltas = 0;
				notas[0]= Integer.parseInt(c_n1.getText());
				notas[1]= Integer.parseInt(c_n2.getText());
				notas[2]= Integer.parseInt(c_n3.getText());
				notas[3]= Integer.parseInt(c_n4.getText());
				faltas= Integer.parseInt(c_faltas.getText());
				double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
				if(faltas>15) {
					texto+="Reprovado por faltas<br>";
				}else {
					for(int x = 0; x<resultados.length;x++) {
						if(media<(Double.parseDouble(resultados[x][0]))) {
							texto +=resultados[x][1]+"<br>";
							x = resultados.length;
						}
					}
				}
				texto+="Média: "+media;
				

				texto+="</center><div></html>";
				resultado.setText(texto);
			}
		});
		
		formulario.add(inf);
		formulario.add(n1);
		formulario.add(n2);
		formulario.add(n3);
		formulario.add(n4);
		formulario.add(faltas);
		formulario.add(c_n1);
		formulario.add(c_n2);
		formulario.add(c_n3);
		formulario.add(c_n4);
		formulario.add(c_faltas);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
