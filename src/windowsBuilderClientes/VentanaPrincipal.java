package windowsBuilderClientes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnClientes;
	private JMenuItem mAltaCli;
	private JMenuItem mBajaCli;
	private JMenuItem mConsultaCli;
	private JMenu mnProductos;
	private JMenuItem mAltaProd;
	private JMenuItem mBajaProd;
	private JMenuItem mConsultaProd;
	private JToolBar toolBar;
	private JButton btnAltaCli;
	private JButton btnBajCli;
	private JButton btnConsultaCli;
	private JButton btnAltaProd;
	private JButton btnBajaProd;
	private JButton btnConsultaProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		mAltaCli = new JMenuItem("Alta");
		mnClientes.add(mAltaCli);
		
		mBajaCli = new JMenuItem("Baja");
		mnClientes.add(mBajaCli);
		
		mConsultaCli = new JMenuItem("Consulta");
		mnClientes.add(mConsultaCli);
		
		mnProductos = new JMenu("Productos");
		menuBar.add(mnProductos);
		
		mAltaProd = new JMenuItem("Alta");
		mnProductos.add(mAltaProd);
		
		mBajaProd = new JMenuItem("Baja");
		mnProductos.add(mBajaProd);
		
		mConsultaProd = new JMenuItem("Consulta");
		mnProductos.add(mConsultaProd);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnAltaCli = new JButton("");
		btnAltaCli.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/cliente.png")));
		toolBar.add(btnAltaCli);
		
		btnBajCli = new JButton("");
		btnBajCli.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/cliente.png")));
		toolBar.add(btnBajCli);
		
		btnConsultaCli = new JButton("");
		btnConsultaCli.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/cliente.png")));
		toolBar.add(btnConsultaCli);
		
		btnAltaProd = new JButton("");
		btnAltaProd.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/icons8-cesta-100.png")));
		toolBar.add(btnAltaProd);
		
		btnBajaProd = new JButton("");
		btnBajaProd.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/icons8-cesta-100.png")));
		toolBar.add(btnBajaProd);
		
		btnConsultaProd = new JButton("");
		btnConsultaProd.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/icons8-cesta-100.png")));
		toolBar.add(btnConsultaProd);
	}

}
