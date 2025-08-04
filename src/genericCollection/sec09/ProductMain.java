package genericCollection.sec09;

import java.util.LinkedList;

public class ProductMain {

	public static void main(String[] args) {
		// 상품 정보 출력
		
		// 상품 정보를 저장할 LinkedList 선언
		LinkedList<Product> productList = new LinkedList<Product>();
		
		// 상품 정보 저장
		productList.add(new Product(1000, "마우스", 20000));
		productList.add(new Product(1001, "키보드", 80000));
		productList.add(new Product(1002, "모니터", 220000));
		
		// 전체 상품 정보 출력
		for (Product prd : productList)
			System.out.println(prd);

	}

}
