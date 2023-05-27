package aVista;

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

	// 1.TENEMOS QUE VOLVER PRIVADAS TODAS CON LAS QUE VAYAMOS A INTERACTUAR +
	// GETTERS
	private JPanel contentPane;
	private JMenu mnClientes;
	private JMenuItem mAltaCli;
	private JMenuItem mBajaCli;
	private JMenuItem mConsultaCli;
	private JMenu mnProductos;
	private JMenuItem mGestionProd;

	private JToolBar toolBar;
	private JButton btnAltaCli;
	private JButton btnBajCli;
	private JButton btnConsultaCli;
	private JButton btnGestionProd;


	public JPanel getContentPane() {
		return contentPane;
	}

	public JMenu getMnClientes() {
		return mnClientes;
	}

	public JMenuItem getmAltaCli() {
		return mAltaCli;
	}

	public JMenuItem getmBajaCli() {
		return mBajaCli;
	}

	public JMenuItem getmConsultaCli() {
		return mConsultaCli;
	}

	public JMenu getMnProductos() {
		return mnProductos;
	}

	public JMenuItem getmGestionProd() {
		return mGestionProd;
	}



	public JToolBar getToolBar() {
		return toolBar;
	}

	public JButton getBtnAltaCli() {
		return btnAltaCli;
	}

	public JButton getBtnBajCli() {
		return btnBajCli;
	}

	public JButton getBtnConsultaCli() {
		return btnConsultaCli;
	}



	public JButton getBtnGestionProd() {
		return btnGestionProd;
	}

	/**
	 * QUITAMOS ESTO Launch the application.
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { VentanaPrincipal frame = new
	 * VentanaPrincipal(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 * 
	 * 
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
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

		mGestionProd = new JMenuItem("Gestión Productos");
		mnProductos.add(mGestionProd);


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

		btnGestionProd = new JButton("");
		btnGestionProd.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/icons8-cesta-100.png")));
		toolBar.add(btnGestionProd);

	
	}

}
