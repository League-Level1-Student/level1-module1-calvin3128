package extra;

import javax.swing.JOptionPane;

public class Run {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is the platypus' name?");
	Platypus plat = new Platypus(name);
	plat.sayHi();
}
}
