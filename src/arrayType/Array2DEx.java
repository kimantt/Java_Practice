package arrayType;
import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {
		// 영단어의 뜻을 알아 맞히는 프로그램
		Scanner sc = new Scanner(System.in);
		String[][] words = {{"chair", "의자"},
							{"computer", "컴퓨터"},
							{"integer", "정수"}};
		String answer;
		
		for (int i = 0; i < words.length; i++) {
			System.out.print("Q" + (i+1) + ". " + words[i][0] + "의 뜻은? : ");
			answer = sc.next();
			
			if (answer.equals(words[i][1]))
				System.out.println("정답입니다.\n");
			else
				System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.\n");
		}
		
		sc.close();

	}

}
