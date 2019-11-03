package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton one = new JButton();
	JButton two = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.setup();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	void setup(){
	frame.setVisible(true);
	frame.add(panel);
	one.setText("Add Name");
	one.addActionListener(this);
	panel.add(one);
	two.setText("View Names");
	two.addActionListener(this);
	panel.add(two);
	frame.pack();
	names.add("Guest #1: Bob Banders");
	names.add("Guest #2: Sandy Summers");
	names.add("Guest #3: Greg Ganders");
	names.add("Guest #4: Donny Doners");
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==one) {
			String n = JOptionPane.showInputDialog("Enter a name.");
			names.add("Guest #5: " + n);
		}
		if(e.getSource()==two) {
			JOptionPane.showMessageDialog(null, "" + names);
		}
	}
}
