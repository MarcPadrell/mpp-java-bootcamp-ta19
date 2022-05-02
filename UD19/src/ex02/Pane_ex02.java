package ex02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pane_ex02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void pane_ex02() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pane_ex02 frame = new Pane_ex02();
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
	public Pane_ex02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setBounds(81, 42, 191, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(81, 65, 142, 19);
		contentPane.add(textField);
		textField.setColumns(10);
				
		JLabel lblNewLabel_1 = new JLabel("Pel\u00EDculas");
		lblNewLabel_1.setBounds(365, 42, 72, 13);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(325, 64, 142, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
			}
		});
		btnNewButton.setBounds(109, 105, 85, 21);
		contentPane.add(btnNewButton);
		
		
		
	}
}
