package study.Inherit.Inherit06;

public class Main {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);

	}

}
