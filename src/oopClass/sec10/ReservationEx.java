package oopClass.sec10;

public class ReservationEx {

	public static void main(String[] args) {
		// 항공권 예약 정보 프로그램
		// 매개변수가 없는 생성자
		Reservation rsv1 = new Reservation();
		rsv1.showRsvInfo();

		// 매개변수가 있는 생성자
		Reservation rsv2 = new Reservation("AA1111", "이순신", "인천", "시카고", 2000000, "C50");
		rsv2.showRsvInfo();
	}

}
