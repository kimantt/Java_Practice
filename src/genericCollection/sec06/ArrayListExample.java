package genericCollection.sec06;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// 단어들을 입력받고 가장 긴 단어를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		List<String> words = new ArrayList<String>();
		
		// 단어 입력
		for (int i = 0; i < 4; i++) {
			System.out.print("단어를 입력하세요>>");
			words.add(sc.next());
		}
		
		System.out.println("----------------------------");
		
		// 입력된 단어들 나열
		for (String word : words)
			System.out.print(word + " ");
		System.out.println();
		
		// 가장 긴 단어와 길이 찾기
		String longestWord = new String();
        int longestLength = 0;

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.length() > longestLength) {
            	longestLength = word.length();
            	longestWord = word;
            }
        }
        
        // 가장 긴 단어와 길이 출력
        System.out.println("가장 긴 단어는 : " + longestWord);
        System.out.println("가장 긴 단어의 길이는 : " + longestLength);

	}

}
