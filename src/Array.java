import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField displaybox;
    private int arr[];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setBounds(203, 33, 284, 22);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setBounds(140, 83, 180, 22);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(330, 84, 96, 20);
		length.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.setBounds(236, 124, 147, 27);
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating Array
				//String len=length.getText()
                 //int l = Integer.valueOf(len);
				int len =Integer.valueOf(length.getText());
				arr = new int[len];
				String message="Array of length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT :");
		lblNewLabel_2.setBounds(31, 176, 258, 27);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.BOLD, 11));
		element.setBounds(252, 177, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION");
		lblNewLabel_3.setBounds(358, 176, 106, 22);
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		insertposition = new JTextField();
		insertposition.setFont(new Font("Constantia", Font.BOLD, 11));
		insertposition.setBounds(440, 177, 69, 20);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.setBounds(523, 176, 89, 27);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="Element"+elem+"inserted at position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER THE POSITION");
		lblNewLabel_4.setBounds(84, 229, 187, 35);
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(252, 236, 96, 20);
		deleteposition.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.setBounds(368, 233, 96, 27);
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deleteposition.getText());
				  arr[pos]=0;
				  String message="Element deleted at position"+pos;
				  JOptionPane.showMessageDialog(contentPane, message);
				  deleteposition.setText("");
			}
		});
		delete.setForeground(new Color(0, 0, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.setBounds(264, 285, 106, 35);
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg=" ";
				for (int i=0;i<=arr.length-1;i++)
				  {
					 msg=msg+" "+arr[i];
				  }
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(63, 342, 514, 35);
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
