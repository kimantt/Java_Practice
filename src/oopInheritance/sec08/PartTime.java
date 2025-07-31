package oopInheritance.sec08;

public class PartTime extends Worker {
	private int hours;
	private int unitPrice;
	
	// 파트타임 직원 한 명의 정보들(이름, 주민번호, 근무시간, 시급)을 저장가능해야함 - 인스턴스 생성 시 직원정보 저장
	public PartTime(String joominNo, String name, int hours, int unitPrice) {
		super(joominNo, name);
		this.hours = hours;
		this.unitPrice = unitPrice;
	}
	
	public int calculatePay() {
		return hours * unitPrice;
	}
	
	@Override
	public String toString() {
		return super.toString() +
			   "\n시급 : " + unitPrice + "원" +
			   "\n근무시간 : " + hours + "시간" +
			   "\n총 지불액 : " + calculatePay() + "원";
	}
}
