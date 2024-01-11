import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(157, 30, 262, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE :");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(78, 86, 167, 18);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setFont(new Font("Constantia", Font.BOLD, 11));
		sizefield.setBounds(282, 83, 96, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating stack
				size =Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message ="Stack of size"+size+"created";
				JOptionPane.showMessageDialog(contentPane,message);
				
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(183, 115, 148, 41);
		contentPane.add(create);
		
		JButton btnNewButton = new JButton("ENTER AN ELEMENT :");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(62, 182, 179, 27);
		contentPane.add(btnNewButton);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				 }
				 else
				 {
					 elem=Integer.valueOf(element.getText());			 
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successful");
					element.setText("");
				 }
			}
		});
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(395, 182, 89, 27);
		contentPane.add(push);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.BOLD, 14));
		element.setBounds(261, 185, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				 if(top==-1)
				 {
					JOptionPane.showMessageDialog(contentPane, "POP not possible");
				 }
				 else {
					 JOptionPane.showMessageDialog(contentPane,"Element deleted is "+s[top]);
					 --top;
				 }
			}
		});
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(244, 222, 89, 36);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg=" ";
				 if(top==-1) {
					 JOptionPane.showMessageDialog(contentPane, "Display not possible");
					 
				 }
				 else
				 {
					 for(int i=top;i>=0;i--) {
						 msg=msg+" "+s[i];
					 }
					 displaybox.setText(msg);
				 }
			 }
			
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(233, 269, 102, 36);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setFont(new Font("Constantia", Font.BOLD, 14));
		displaybox.setBounds(105, 325, 363, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
