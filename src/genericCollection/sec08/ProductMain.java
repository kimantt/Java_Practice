package genericCollection.sec08;

import java.util.LinkedList;

public class ProductMain {

	public static void main(String[] args) {
		// 상품 정보 출력
		
		// 상품 정보를 저장할 LinkedList 선언
		LinkedList<Product> productList = new LinkedList<Product>();
		
		// 상품 정보 저장
		productList.add(new Product("자동차", "아반떼", 30000000));
		productList.add(new Product("스마트폰", "갤럭시 S20", 1000000));
		productList.add(new Product("에어컨", "휘센", 2000000));
		
		// 전체 상품 정보 출력
		for (Product prd : productList)
			System.out.println(prd);

	}

}
