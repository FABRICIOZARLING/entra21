package ex05_JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JComboBox");
		formulario.setLayout(null);
		
		//JComboBox
		
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10,10,270,30);
		combo.addItem("Item 1");
		combo.addItem("Item 2");
		combo.addItem("Item 3");
		
		//Ação no combo
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				
			}
		});
		
		
		//Adicione ao JFrame
		formulario.add(combo);
		
		//exibir
		
		formulario.setVisible(true);
		
	}

}
