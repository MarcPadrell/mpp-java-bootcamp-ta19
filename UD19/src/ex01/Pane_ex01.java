package ex01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Pane_ex01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void pane_ex01() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pane_ex01 frame = new Pane_ex01();
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
	public Pane_ex01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 302);
		contentPane = new JPanel();
		setTitle("Saludador");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		textField = new JTextField();
		textField.setBounds(83, 109, 285, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u00A1Saludar!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = textField.getText();
				JOptionPane.showMessageDialog(null, "¡Hola "+nom+"!");
			}
		});
		btnNewButton.setBounds(177, 163, 85, 21);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setBounds(152, 58, 154, 13);
		contentPane.add(lblNewLabel);
	}
}
