package genericCollection.sec15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapStudent {

	public static void main(String[] args) {
		// 3명의 학생 점수를 Map에 저장
		// Student 클래스를 key로 점수를 value로 저장
		
		//Map<Student, Integer> map = new HashMap<Student, Integer>();
		Map<Student, Integer> map = new LinkedHashMap<Student, Integer>();
		
		// map에 entry 저장 시 key가 사용자정의 클래스 인스턴스인 것을 제외하고는 동일
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(2, "홍길동"), 85);
		map.put(new Student(3, "성춘향"), 95); // 학생 번호로 학생을 구분 : 번호가 같은 학생은 존재하지 않는다는 규칙
		// key가 중복되면 value를 update - Student 객체를 따로 구성했으므로 update 진행되지 않고 새로 추가됨
		// Student 클래스가 상속받은 hasCode(), equals() 메서드 재정의해서 객체 필드 값이 동일하면 동일한 객체로 처리되도록 구현
		// HashSet()과 같은 내용
		map.put(new Student(3, "성춘향"), 100);
		
		// 4명의 학생의 data가 출력 - 순서를 보장하지 않음 (순서가 보장되게 하고자 하면 LinkedHashMap 사용)
		for (Student k : map.keySet()) {
			System.out.println(k.getStdNo() + " " + k.getStdName() + " " + map.get(k));
		}

	}

}
