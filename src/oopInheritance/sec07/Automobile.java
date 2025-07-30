package oopInheritance.sec07;

public class Automobile extends Car {
	private String autoManual;
	
	public Automobile(String no, String name, String maker, int year, String autoManual) {
		super(no, name, maker, year);
		this.autoManual = autoManual;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n기어변속 : " + autoManual;
	}
}
