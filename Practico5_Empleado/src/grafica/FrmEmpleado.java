package grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import logica.Empleado;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class FrmEmpleado extends JFrame {
	private JPanel panel_1;
	private JTextField txtSalarioAnual;
	private JButton btnSalarioAnual;
	private JButton btnPresentismo;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JButton btnSalir;
	private JButton btnLimpiar;
	private JLabel lblSalario;
	private JTextField txtSalario;

	
	
	public FrmEmpleado() {
		iniciarComponentes();
		iniciarManejadoresEventos();
	}
	
	
	private void iniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del empleado", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 21, 175, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 28, 46, 14);
		panel.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 53, 46, 14);
		panel.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(66, 50, 86, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 25, 86, 20);
		panel.add(txtNombre);
		
		lblSalario = new JLabel("Salario");
		lblSalario.setBounds(10, 78, 46, 14);
		panel.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(66, 75, 86, 20);
		panel.add(txtSalario);
		txtSalario.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(195, 21, 229, 117);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Visualizar salario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(152, 251, 152));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnSalarioAnual = new JButton("Salario anual");
		btnSalarioAnual.setBounds(64, 21, 113, 23);
		panel_1.add(btnSalarioAnual);
		
		btnPresentismo = new JButton("Presentismo");
		btnPresentismo.setBounds(64, 80, 113, 23);
		panel_1.add(btnPresentismo);
		
		txtSalarioAnual = new JTextField();
		txtSalarioAnual.setBounds(10, 49, 209, 20);
		panel_1.add(txtSalarioAnual);
		txtSalarioAnual.setColumns(10);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(195, 227, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(350, 227, 74, 23);
		contentPane.add(btnSalir);
		
		
	}
	
	private void iniciarManejadoresEventos() {
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setText(null);
				txtApellido.setText(null);
				txtSalario.setText(null);
				txtSalarioAnual.setText(null);		
			}
		});
		
		btnSalarioAnual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=txtNombre.getText();
				String apellido=txtApellido.getText();
				double salario=Double.valueOf(txtSalario.getText());
				Empleado e1=new Empleado(nombre,apellido,salario);
				txtSalarioAnual.setText(String.valueOf(e1.toString()));


				
			}
		});
		
		btnPresentismo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=txtNombre.getText();
				String apellido=txtApellido.getText();
				double salario=Double.valueOf(txtSalario.getText());
				Empleado e1=new Empleado(nombre,apellido,salario);
				txtSalarioAnual.setText(String.valueOf(e1.presentismo()));

			
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEmpleado frame = new FrmEmpleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
