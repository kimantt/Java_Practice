package oopInheritance.sec07;

public class Car {
	private String carNo;
	private String carName;
	private String carMaker;
	private int carYear;
	
	public Car(String no, String name, String maker, int year) {
		this.carNo = no;
		this.carName = name;
		this.carMaker = maker;
		this.carYear = year;
	}
	
	@Override
	public String toString() {
		return "차량 번호 : " + carNo +
			   "\n차종 : " + carName + 
			   "\n제조사 : " + carMaker +
			   "\n연식 : " + carYear;
	}
}
