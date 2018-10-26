import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor?");
	String strTime = JOptionPane.showInputDialog("How long?");
	int numTime = Integer.parseInt(strTime);
	Microwave m = new Microwave();
	Popcorn p = new Popcorn(flavor);
	m.putInMicrowave(p);
	m.setTime(numTime);
	m.startMicrowave();
}
}
