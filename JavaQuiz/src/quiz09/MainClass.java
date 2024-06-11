package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		
		Computer computer = new Computer(new KeyBoard(), new Mouse(), new Monitor() );
		computer.computerInfo();
		
		Monitor m = computer.getMonitor();
		m.info();
	}
}
