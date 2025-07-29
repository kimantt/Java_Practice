package oopClass.sec08;

// 사용자 정의 클래스 생성 : 개발자가 필요한 변수(필드/속성), 함수(메서드)를 정의
// 데이터를 다루기 위한 변수 : 멤버 변수
// 데이터를 조작하거나 기능을 수행하기 위한 함수 : 멤버 메서드
public class Car {
	// 멤버 변수, 데이터
	private String carNo; 	 // 차량번호
	private String carName;  // 차종
	private String carMaker; // 제조사
	private int carYear; 	 // 연식
	private int carCC;		 // 배기량
	
	// 생성자 오버로딩
	// 매개변수가 없는 생성자
	public Car() {
		
	}
	
	// 생성자 - private 필드를 초기화
	public Car(String carNo, String carName, String carMaker) {
		// 멤버변수와 매개변수명이 동일
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
	}
	
	public void setCarInfo(String no, String name, String maker, int carYear, int carCC) {
		carNo = no;
		carName = name;
		carMaker = maker;
		this.carYear = carYear;
		this.carCC = carCC;
	}
	
	public void showCarInfo() {
		System.out.println("챠랑번호 : " + carNo);
		System.out.println("차종 : " + carName);
		System.out.println("제조사 : " + carMaker);
		System.out.println("연식 : " + carYear);
		System.out.println("배기량 : " + carCC);
	}
}
