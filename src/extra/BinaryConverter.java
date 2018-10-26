package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	boolean button = false;
	JTextField text = new JTextField(20);
public static void main(String[] args) {
	new BinaryConverter().jthings();	
}

public void jthings() {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	
	JLabel l = new JLabel("convert");
	JButton b = new JButton();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p.add(text);
	p.add(b);
	
	b.add(l);
	f.add(p);
	f.pack();
	
	p.setVisible(true);
	f.setVisible(true);
	text.setVisible(true);
	l.setVisible(true);
	b.setVisible(true);
	b.addActionListener(this);
	
}




String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String input = text.getText();
	System.out.println(convert(input));
	
}
}
