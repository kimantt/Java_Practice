package oopClass.sec04;

public class ProductMain {

	public static void main(String[] args) {
		// 상품 정보, 매출액, 재고액 출력 프로그램
		Product prd = new Product();
		
		prd.inputPrdInfo();
		prd.showPrdInfo();
		prd.showSalesAmount();
		prd.showStockAmount();

	}

}
