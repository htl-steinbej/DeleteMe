package pkgGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainGUI extends JFrame {
	private JButton btnOK = new JButton();/*MASTER*/
	private JMenu menue = new JMenu();
	private JLabel lblMessage = new JLabel(); /*EDITED BY THE MASTER*/
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
