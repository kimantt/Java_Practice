package oopClass.sec10;

public class Reservation {
	//멤버변수
	private String plane; // 항공기
	private String name;  // 예약자
	private String start; // 출발지
	private String end;   // 도착지
	private int price;    // 금액
	private String seat;  // 좌석번호
	
	public Reservation() {
		this("KE1001", "홍길동", "인천", "뉴욕", 1600000, "A38");
	}
	
	public Reservation(String plane, String name, String start,
						String end, int price, String seat)
	{
		this.plane = plane;
		this.name = name;
		this.start = start;
		this.end = end;
		this.price = price;
		this.seat = seat;
	}
	
	public void showRsvInfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기 : " + plane);
		System.out.println("예약자 : " + name);
		System.out.println("출발지 : " + start);
		System.out.println("도착지 : " + end);
		System.out.println("금액 : " + price);
		System.out.println("좌석번호 : " + seat);
	}
	
}
