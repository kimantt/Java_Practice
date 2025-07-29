package oopClass.sec04;
import java.util.Scanner;

public class Product {
	// 멤버변수
	private String prdName; // 상품명
	private int prdPrice; 	// 가격
	private int prdSold; 	// 판매수량
	private int prdStock; 	// 재고수량
	
	// 메서드
	// 상품 정보 입력
	public void inputPrdInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****상품 정보 입력****");
		System.out.print("상품명: "); 	prdName = sc.nextLine();
		System.out.print("가격: ");		prdPrice = sc.nextInt();
		System.out.print("판매 수량: ");	prdSold = sc.nextInt();
		System.out.print("재고 수량: ");	prdStock = sc.nextInt();
		
		sc.close();
	}
	
	// 상품 정보 출력
	public void showPrdInfo() {
		System.out.println("****상품 정보 출력****");
		System.out.println("상품명: " + prdName);
		System.out.println("가격: " + prdPrice);
		System.out.println("판매 수량: " + prdSold);
		System.out.println("재고 수량: " + prdStock);
	}
	
	// 매출액 계산 출력
	public void showSalesAmount() {
		System.out.printf("매출액: %,d%n", prdPrice*prdSold);
	}
	
	// 재고액 계산 출력
	public void showStockAmount() {
		System.out.printf("매출액: %,d%n", prdPrice*prdStock);
	}
}
