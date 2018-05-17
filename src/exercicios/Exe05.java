package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DatabaseMetaData;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exe05 {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Verificação de calendário com Input");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel dia = new JLabel("<html><center>Digite um dia<br> de Fevereiro</center></html>");
		dia.setBounds(30, 30, 110, 40);

		
		
		JLabel resultado = new JLabel();
		resultado.setBounds(30, 150, 250, 50); 
		//resultado.setBackground(Color.red);
		//resultado.setOpaque(true);
		
		//JTextfield
		JTextField c_dia = new JTextField();
		c_dia .setBounds(130, 40, 150, 20);
		
		
		
		
		//JButton
		
		JButton acao = new JButton("Verificar data");
		acao.setBounds(30, 70, 250, 20);
		acao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto ="";
				int dia = 0;
				try {
					dia = Integer.parseInt(c_dia.getText()); 
					if(dia<1||dia>28) {
						dia = Integer.parseInt("erro");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Data inválida "+c_dia.getText());
				}
				if(dia!=0){
					Calendar cal = Calendar.getInstance();
					cal.set(2018, 1, dia);
					
					int diaSemana = cal.get(cal.DAY_OF_WEEK);
					if(diaSemana==1||diaSemana==7){
						texto = "Final de Semana";
					}else{
						texto = "Dia de semana";
					}
					resultado.setText("<html><div style=\"width: 200px;\"><center>"+texto+"</center><div></html>");
				    
				}
				
				
				
			}
		});
		
		
		formulario.add(dia);
		formulario.add(c_dia);
		formulario.add(acao);
		formulario.add(resultado);
		
		//Exibir
		formulario.setVisible(true);

	}

}
