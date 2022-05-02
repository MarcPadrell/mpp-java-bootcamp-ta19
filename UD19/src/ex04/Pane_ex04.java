package ex04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pane_ex04 extends JFrame {

	private JPanel contentPane;
	private JTextField num_1;
	private JTextField num_2;
	private JTextField resultado;
	private JButton suma;
	private JButton resta;
	private JButton multiplicacio;
	private JButton div;
	private JButton exit;
	private JButton about;
	private JLabel num1;
	private JLabel num2;
	private JLabel result;
	private JLabel operations;

	/**
	 * Launch the application.
	 */
	public static void pane_ex04() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pane_ex04 frame = new Pane_ex04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pane_ex04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num_1 = new JTextField();
		num_1.setBounds(125, 83, 96, 19);
		contentPane.add(num_1);
		num_1.setColumns(10);
		
		num_2 = new JTextField();
		num_2.setBounds(312, 83, 96, 19);
		contentPane.add(num_2);
		num_2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(218, 250, 96, 19);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		suma = new JButton("suma");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double numero_1 = Double.parseDouble(num_1.getText());
				double numero_2 = Double.parseDouble(num_2.getText());

				resultado.setText(""+(numero_1+numero_2));
				
			}
		});
		suma.setBounds(38, 165, 85, 21);
		contentPane.add(suma);
		
		resta = new JButton("resta");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double numero_1 = Double.parseDouble(num_1.getText());
				double numero_2 = Double.parseDouble(num_2.getText());

				resultado.setText(""+(numero_1-numero_2));
				
			}
		});
		resta.setBounds(169, 165, 85, 21);
		contentPane.add(resta);
		
		multiplicacio = new JButton("multiplicaci\u00F3n");
		multiplicacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double numero_1 = Double.parseDouble(num_1.getText());
				double numero_2 = Double.parseDouble(num_2.getText());

				resultado.setText(""+(numero_1*numero_2));
				
			}
		});
		multiplicacio.setBounds(312, 165, 115, 21);
		contentPane.add(multiplicacio);
		
		div = new JButton("divisi\u00F3n");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double numero_1 = Double.parseDouble(num_1.getText());
				double numero_2 = Double.parseDouble(num_2.getText());

				resultado.setText(""+(numero_1/numero_2));
				
			}
		});
		div.setBounds(469, 165, 85, 21);
		contentPane.add(div);
		
		exit = new JButton("Salir");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(483, 327, 85, 21);
		contentPane.add(exit);
		
		about = new JButton("About");
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "EXERCICE MADE BY MARC PADRELL");
			}
		});
		about.setBounds(10, 327, 85, 21);
		contentPane.add(about);
		
		num1 = new JLabel("N\u00FAmero 1");
		num1.setBounds(147, 60, 74, 13);
		contentPane.add(num1);
		
		num2 = new JLabel("N\u00FAmero 2");
		num2.setBounds(335, 60, 73, 13);
		contentPane.add(num2);
		
		result = new JLabel("Resultado");
		result.setBounds(242, 227, 72, 13);
		contentPane.add(result);
		
		operations = new JLabel("Operaciones");
		operations.setBounds(242, 129, 115, 13);
		contentPane.add(operations);
	}

}
