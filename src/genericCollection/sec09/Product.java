package genericCollection.sec09;

public class Product {
	private int prdNo;
	private String prdName;
	private int prdPrice;
	
	public Product(int prdNo, String prdName, int prdPrice) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	
	@Override
	public String toString() {
		return "상품 번호 : " + prdNo +
			   "\n상품명 : " + prdName +
			   "\n상품 가격 : " + prdPrice +
			   "\n-------------------";
	}
}
