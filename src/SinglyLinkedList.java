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

public class SinglyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sll = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		sll.setForeground(new Color(0, 0, 255));
		sll.setFont(new Font("Constantia", Font.BOLD, 16));
		sll.setBounds(180, 47, 305, 20);
		contentPane.add(sll);
		
		elementrear = new JTextField();
		elementrear.setFont(new Font("Constantia", Font.BOLD, 14));
		elementrear.setBounds(258, 109, 96, 20);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(79, 112, 156, 18);
		contentPane.add(lblNewLabel);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				Node temp;
				int elem;
				elem=Integer.valueOf(elementrear.getText());
				 Node newnode = new Node();
				 newnode.data=elem;
				 newnode.link=null;		 
				 if(first==null) {
					 first = newnode;
					 JOptionPane.showMessageDialog(contentPane,"Insert Rear successful");
					 elementrear.setText("");
				 }
				 else {
					 temp = first;
					 if(temp.link!=null) {
						 temp = temp.link;
						 JOptionPane.showMessageDialog(contentPane,"Insert Rear successful");
						 elementrear.setText("");
					 }
					 temp.link = newnode;
					 
				 }
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertrear.setBounds(378, 105, 135, 33);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int elem ;
				elem=Integer.valueOf(elementfront.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link=null;
				if(first==null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane,"Insert Front successful");
					 elementfront.setText("");
				}
				else {
					newnode.link=first;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane,"Insert Front successful");
					 elementfront.setText("");
				}
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertfront.setBounds(377, 149, 147, 29);
		contentPane.add(insertfront);
		
		elementfront = new JTextField();
		elementfront.setFont(new Font("Constantia", Font.BOLD, 14));
		elementfront.setBounds(258, 158, 96, 20);
		contentPane.add(elementfront);
		elementfront.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(79, 161, 156, 18);
		contentPane.add(lblNewLabel_1);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				 Node temp;
				 if(first==null) {				
					 JOptionPane.showMessageDialog(contentPane,"Deletion Not Possible");
				 }
				 if(first.link==null) {
					 JOptionPane.showMessageDialog(contentPane,	"Element Deleted is:"+first.data);
					 first=null;
				 }
				 else {
					 temp = first;
					 if(temp.link.link!=null) {
						 temp = temp.link;
					 }
					 JOptionPane.showMessageDialog(contentPane,"Element Deleted is :"+temp.link.data);
					 temp.link=null;
				 }
			
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleterear.setBounds(258, 226, 136, 33);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane,"Deletion Not Possible");
				 }
			    if(first.link==null) {
				JOptionPane.showMessageDialog(contentPane,"Element delted is :"+first.data);
					 first = null;
				 }
				else {
				 JOptionPane.showMessageDialog(contentPane,"Element deleted is :"+first.data);
					 first = first.link;
				 }
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 14));
		deletefront.setBounds(255, 281, 156, 33);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				 Node temp;
				 if(first == null) {
					 JOptionPane.showMessageDialog(contentPane,"Display Not Possible");
				 }
				 else if(first.link == null) {
					 msg=msg+" "+first.data;
					 displaybox.setText(msg);
				 }
				 else {
					 temp = first;
					 while(temp!=null) {
						 msg=msg+" "+temp.data;
						 temp = temp.link;
					 }
					 displaybox.setText(msg);
				 }
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(258, 328, 136, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setFont(new Font("Constantia", Font.BOLD, 14));
		displaybox.setBounds(52, 366, 589, 39);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
