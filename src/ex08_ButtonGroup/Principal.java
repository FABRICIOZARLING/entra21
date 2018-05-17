package ex08_ButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame("Utilizando ButtonGroup");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JRadionButton
		
		JRadioButton turnoMatutuino = new JRadioButton("Matutino");
		turnoMatutuino.setBounds(10, 10, 100, 20);
		turnoMatutuino.setActionCommand("Matutino");
		JRadioButton turnoVespertino = new JRadioButton("Vespertino");
		turnoVespertino.setBounds(110, 10, 100, 20);
		turnoVespertino.setActionCommand("Vespertino");
		JRadioButton turnoNoturno = new JRadioButton("Noturno");
		turnoNoturno.setBounds(210, 10, 100, 20);
		turnoNoturno.setActionCommand("Noturno");
		
		//ButtonGroup
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(turnoMatutuino);
		turnos.add(turnoNoturno);
		turnos.add(turnoVespertino);
		
		//JButton
		JButton botao = new JButton("Verificar turno");
		botao.setBounds(50, 50, 200, 20);
		
		//Ação
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null, turnos.getSelection().getActionCommand());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Selecione um turno");
				}
			}
		});
		
		//Adiciona componentes
		formulario.add(turnoMatutuino);
		formulario.add(turnoNoturno);
		formulario.add(turnoVespertino);
		formulario.add(botao);
		
		//Exibir
		formulario.setVisible(true);

	}

}
