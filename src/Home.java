import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 492);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 255));
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(206, 67, 261, 33);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				new Array().setVisible(true);
				
			}
		});
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.setBackground(new Color(255, 255, 255));
		array.setBounds(256, 111, 95, 44);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(255, 0, 0));
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setBounds(131, 172, 85, 33);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(255, 0, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBounds(450, 172, 95, 33);
		contentPane.add(queue);
		
		JButton cq = new JButton("CIRCULAR QUEUE");
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		cq.setForeground(new Color(255, 0, 0));
		cq.setFont(new Font("Constantia", Font.BOLD, 14));
		cq.setBounds(59, 260, 173, 33);
		contentPane.add(cq);
		
		JButton SLL = new JButton("SINGLEY LINKED LIST");
		SLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLY LINKEDLIST WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		SLL.setForeground(new Color(255, 0, 0));
		SLL.setFont(new Font("Constantia", Font.BOLD, 14));
		SLL.setBounds(438, 254, 219, 39);
		contentPane.add(SLL);
		
		JButton DLL = new JButton("DOUBLY LINKED LIST");
		DLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LINKEDLIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);
			}
		});
		DLL.setForeground(new Color(255, 0, 0));
		DLL.setFont(new Font("Constantia", Font.BOLD, 14));
		DLL.setBounds(225, 333, 203, 44);
		contentPane.add(DLL);
	}
}
