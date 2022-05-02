package ex03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pane_ex03 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void pane_ex03() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pane_ex03 frame = new Pane_ex03();
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
	public Pane_ex03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(48, 54, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(48, 27, 174, 13);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(48, 77, 103, 21);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Mac");
		rdbtnNewRadioButton_1_1.setBounds(48, 100, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnLinux);
		bgroup.add(rdbtnNewRadioButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(48, 154, 148, 13);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programaci\u00F3n");
		chckbxNewCheckBox.setBounds(48, 181, 129, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxDiseoGrfico.setBounds(48, 204, 129, 21);
		contentPane.add(chckbxDiseoGrfico);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracin.setBounds(48, 227, 129, 21);
		contentPane.add(chckbxAdministracin);
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(48, 294, 200, 44);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(48, 267, 188, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String so;
				String especialidad = "";
				int horas;
				
				if (rdbtnNewRadioButton.isSelected()) {
					so = rdbtnNewRadioButton.getText();
				}else if (rdbtnLinux.isSelected()) {
					so = rdbtnLinux.getText();
				}else {
					so = rdbtnNewRadioButton_1_1.getText();				
				}
				
				if(chckbxAdministracin.isSelected()) {
					especialidad += "["+chckbxAdministracin.getText()+"]";
				}
				if (chckbxDiseoGrfico.isSelected()) {
					especialidad += "["+chckbxDiseoGrfico.getText()+"]";
				}
				if (chckbxNewCheckBox.isSelected()){
					especialidad += "["+chckbxNewCheckBox.getText()+"]";
				}
				
				horas = slider.getValue();
				
				JOptionPane.showMessageDialog(null, "Sistema operatiu : "+so+". Especialitat: "+especialidad+". Horas: "+horas);
				
			}
		});
		btnNewButton.setBounds(48, 370, 85, 21);
		contentPane.add(btnNewButton);
	}
}
