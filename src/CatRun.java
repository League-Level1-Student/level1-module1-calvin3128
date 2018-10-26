
public class CatRun {
public static void main(String[] args) {
	Cat cat = new Cat("cat");
	cat.meow();
	cat.printName();
	for (int i = 0; i < 9; i++) {
		cat.kill();	
	}
	
}
}
