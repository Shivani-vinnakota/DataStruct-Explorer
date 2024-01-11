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

public class DoublyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField displaybox;
	class Node
	  {
		  Node prevlink;
		  int data;
		  Node nextlink;
	  }
	  private Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(156, 50, 319, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(64, 110, 156, 18);
		contentPane.add(lblNewLabel_1);
		
		elementrear = new JTextField();
		elementrear.setFont(new Font("Constantia", Font.BOLD, 14));
		elementrear.setBounds(253, 109, 96, 20);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				int element;
				Node temp;
				  element = Integer.valueOf(elementrear.getText());
				  Node newnode  = new Node();
				  newnode.data=element;
				  newnode.prevlink=null;
				  newnode.nextlink=null;
				  if(first == null) {
					  first = newnode;
					  JOptionPane.showMessageDialog(contentPane, "Insert Rear successful");
					   elementrear.setText("");
				  }
				  else {
					  temp = first;
					  while(temp.nextlink!=null) 
					  {
						  temp = temp.nextlink;
					  }
					  temp.nextlink = newnode;
					  newnode.prevlink=temp;
					  JOptionPane.showMessageDialog(contentPane, "Insert Rear successful");
					   elementrear.setText("");
				  }	  
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertrear.setBounds(376, 108, 145, 27);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(64, 152, 156, 18);
		contentPane.add(lblNewLabel_2);
		
		elementfront = new JTextField();
		elementfront.setFont(new Font("Constantia", Font.PLAIN, 11));
		elementfront.setBounds(253, 151, 96, 20);
		contentPane.add(elementfront);
		elementfront.setColumns(10);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int elem;
              elem = Integer.valueOf(elementfront.getText());
				  Node newnode = new Node();
				  newnode.data = elem;
				  newnode.prevlink=null;
				  newnode.nextlink=null;
				  if(first == null) {
					   first = newnode;
					   JOptionPane.showMessageDialog(contentPane, "Insert front successful");
					   elementfront.setText("");
				  }
				  else {
					    newnode.nextlink = first;
					    first.prevlink=newnode;
					    first = newnode;
					    JOptionPane.showMessageDialog(contentPane, "Insert front successful");
						elementfront.setText("");
					    
				  }
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertfront.setBounds(376, 148, 145, 27);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				Node temp;
				  if(first == null) {
					  JOptionPane.showMessageDialog(contentPane,"Deletion Not Possible");
				  }
				  else if(first.nextlink==null) {
			JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data);
					  first = null;
				  }
				  else {
					  temp = first;
					  while(temp.nextlink.nextlink!=null) {
						  temp = temp.nextlink;
					  }
		 JOptionPane.showMessageDialog(contentPane,"Element Deleted is"+temp.nextlink.data);
					  temp.nextlink=null;
				  }
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleterear.setBounds(286, 209, 140, 33);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE  FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if(first == null) {
				JOptionPane.showMessageDialog(contentPane,"Deletion Not Possible");
				  }
				  if(first.nextlink==null) {
				JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data);
					  first = null;
				  }
				  else {
					  JOptionPane.showMessageDialog(contentPane,"Element deleted is "+ first.data);
					  first = first.nextlink;
					  first.prevlink = null;

					  
				  }
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 14));
		deletefront.setBounds(285, 260, 156, 33);
		contentPane.add(deletefront);
		
		JButton displayforward = new JButton(" DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display-forward
				String msg=" ";
				 Node temp;
				 if(first == null) {
					 JOptionPane.showMessageDialog(contentPane,"Display Not Possible");
				 }
				 else if(first.nextlink == null) {				 
					 msg=msg+" "+first.data;
					 displaybox.setText(msg);
				 }
				 else {
					 temp = first;
					 while(temp!=null) {
						 msg=msg+" "+temp.data;
						 temp = temp.nextlink;
					 }
					 displaybox.setText(msg);
				 }
			}
		});
		displayforward.setFont(new Font("Constantia", Font.BOLD, 14));
		displayforward.setBounds(156, 316, 193, 27);
		contentPane.add(displayforward);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setFont(new Font("Constantia", Font.BOLD, 14));
		displaybox.setBounds(36, 374, 571, 36);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display-reverse
				String msg="";
				Node temp;
				 if(first == null) {
					 JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				 }
				 else if(first.nextlink == null) {
					 msg=msg+" "+first.data;
					 displaybox.setText(msg);
				 }
				 else {
					 temp = first;
					 while(temp.nextlink!=null) {
						 temp = temp.nextlink;
					 }
					 while(temp!=null) {
						 msg=msg+" "+temp.data;
						 temp = temp.prevlink;
					 }
					 displaybox.setText(msg);
				 }
			}
		});
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 14));
		displayreverse.setBounds(366, 316, 179, 27);
		contentPane.add(displayreverse);
	}

}
