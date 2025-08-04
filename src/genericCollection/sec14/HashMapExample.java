package genericCollection.sec14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		// 1. 사용자로부터 영문단어=한글단어 형태의 entry를 입력받아 HashMap에 저장하는 로직 구현
		Scanner sc = new Scanner(System.in);
		String word;
		Map<String, String> words = new HashMap<String, String>();
		
		while (true) {
			// 사전에 등록할 단어 입력
			String temp[] = new String[2];
			System.out.print("사전에 등록할 단어를 입력해주세요 (apple=사과) : ");
			word = sc.nextLine();
			
			// 입력값 쪼개서 Map에 저장
			temp = word.split("=");
			words.put(temp[0].trim(), temp[1].trim()); // trim() : 공백제거
			
			// 계속 입력할 것인지 질문
			System.out.print("단어를 계속 등록하시겠습니까? (y / n) : ");
			if (sc.nextLine().equals("n"))
				break;
		}
		
		// 2. HashMap에 입력된 영단어를 검색할 수 있는 로직을 구현
		// exit 입력되면 종료
		// 없는 단어 검색 시 "사전에 없는 단어입니다" 출력
		String foundWord;
		
		while (true) {
			// 찾을 단어 등록
			System.out.print("찾고 싶은 단어는? (영단어) ");
			foundWord =  sc.nextLine();
			
			// 단어 찾기
			if (foundWord.equals("exit")) {
				System.out.println("죵료합니다...");
				break;
			}
			else if (words.get(foundWord) == null)
				System.out.println(foundWord + "는 사전에 없는 단어입니다.");
			else
				System.out.println(words.get(foundWord));
		}
		
	}

}
