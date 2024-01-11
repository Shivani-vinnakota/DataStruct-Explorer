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

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
    private int count=0;
    private int r=-1;
	private int f=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(206, 26, 285, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(188, 90, 140, 18);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setFont(new Font("Constantia", Font.BOLD, 12));
		sizefield.setBounds(359, 87, 96, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton create = new JButton("CREATE CIRCULAR QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating Circular Queue
				size =Integer.valueOf(sizefield.getText());
				cq = new int[size];
				String message ="Circular Queue of size"+size+"created";
				JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(206, 123, 236, 27);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(146, 168, 158, 27);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.BOLD, 14));
		element.setBounds(295, 169, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem;
				 if(count==size) {					  
					 JOptionPane.showMessageDialog(contentPane,"Insertion not possible" );
				  }
				  else
				  {
					 elem=Integer.valueOf(element.getText());
					  r = (r+1)%size;
					  cq[r]=elem;
					  ++count;
					  JOptionPane.showMessageDialog(contentPane, "Insertion Successful");
					  element.setText("");
				  }
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(434, 161, 89, 37);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete
				if(count==0) {
				 JOptionPane.showMessageDialog(contentPane,"Deletion not possible" );
				  }
				else {
					JOptionPane.showMessageDialog(contentPane,"deleted element is:"+cq[f] );
					  f=(f+1)%size;
					  --count;
					  
				  }
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(302, 210, 89, 38);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg=" ";
				 int f1=f;
				  if(count==0) {
					  JOptionPane.showMessageDialog(contentPane, "Display not possible");
				  }
				  else 
				  {
					  for(int i=1; i<=count;i++) {
						 msg=msg+" "+cq[f1];
						  f1=(f1+1)%size;
					  }
					  displaybox.setText(msg);				  }
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(295, 269, 98, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setFont(new Font("Constantia", Font.BOLD, 14));
		displaybox.setBounds(93, 332, 526, 27);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
