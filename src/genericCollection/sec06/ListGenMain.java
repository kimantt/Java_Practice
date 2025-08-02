package genericCollection.sec06;
import java.util.*;

public class ListGenMain {

	public static void main(String[] args) {
		// 제네릭 타입으로 ArrayList 사용 -> List interface 활용
		// ArrayList : String 객체만 저장 가능
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("DataBase");
		list.add("HTML");
		list.add("java"); // 중복값 저장
//		list.add(100); // String으로 저장 타입 구체화 했으므로 정수형은 저장불가
//		list.add(9.9);
		
		System.out.println("총 객체 수 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		list.remove(1);
		
		for (String value : list) 
			System.out.println(value);
		
		list.add("MultiMedia");
		// list.get(i)의 반환값이 현재 문자열이기 때문에 length() 사용가능
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + ":" + list.get(i).length());
		
		for (String value : list) 
			System.out.println(value.length());
	}

}
