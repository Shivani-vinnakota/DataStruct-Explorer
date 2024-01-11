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

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int  q[];
	private int  r =-1;
	private int  f=0;
	private int size;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(241, 36, 235, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(145, 98, 161, 30);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setFont(new Font("Constantia", Font.BOLD, 11));
		sizefield.setBounds(316, 103, 96, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating queue
				size =Integer.valueOf(sizefield.getText());
				q = new int[size];
				String message ="Queue of size"+size+"created";
				JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(203, 139, 157, 27);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(145, 211, 157, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.BOLD, 12));
		element.setText("");
		element.setBounds(301, 211, 77, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert
				int elem;
				if(r==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(403, 206, 89, 30);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String message="deleted element is :"+q[f];
				JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setForeground(new Color(0, 0, 0));
		delete.setBounds(284, 262, 89, 30);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg=" ";
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=f;i<=r;i++) {
						 msg=msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			
		}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(284, 310, 94, 30);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setFont(new Font("Constantia", Font.BOLD, 14));
		displaybox.setBounds(115, 352, 471, 30);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
