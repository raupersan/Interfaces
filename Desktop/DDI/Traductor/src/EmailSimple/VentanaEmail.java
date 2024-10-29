package EmailSimple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaEmail {

	private JFrame frame;
	private JTextField destinatario;
	private JLabel lblNewLabel_1;
	private JTextField asunto;
	private JLabel lblNewLabel_2;
	private JTextField cuerpo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEmail window = new VentanaEmail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaEmail() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Para");
		lblNewLabel.setBounds(24, 10, 44, 23);
		frame.getContentPane().add(lblNewLabel);
		
		destinatario = new JTextField();
		
		destinatario.setBounds(78, 11, 137, 20);
		frame.getContentPane().add(destinatario);
		destinatario.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Asunto");
		lblNewLabel_1.setBounds(22, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		asunto = new JTextField();
		asunto.setBounds(78, 42, 137, 36);
		frame.getContentPane().add(asunto);
		asunto.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Mensaje");
		lblNewLabel_2.setBounds(24, 208, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		cuerpo = new JTextField();
		cuerpo.setBounds(78, 105, 137, 134);
		frame.getContentPane().add(cuerpo);
		cuerpo.setColumns(10);
		
		JButton enviar = new JButton("Enviar");
		enviar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.enviarEmail(destinatario.getText(), asunto.getText(), cuerpo.getText());
				
			}
		});
		enviar.setBounds(282, 214, 89, 23);
		frame.getContentPane().add(enviar);
	}
}
