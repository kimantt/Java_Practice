package game_project.game;

import java.util.InputMismatchException;
import java.util.Scanner;

import game_project.user.UserDTO;

public class Guess extends Game {
	// 숫자 맞추기 게임
	
	private boolean firstTime; // 초기 숫자 입력 문구 출력용 플래그
	private int computerNo;
	private int playerNo;
	
	@Override
	public void run(Scanner sc, UserDTO user) {
		
		// 초기 숫자 입력 문구 출력용 플래그
		firstTime = true;
		
		// 랜덤 숫자 설정
		computerNo = random.nextInt(10) + 1;
		System.out.println("어떤 숫자일까요? 맞춰보세요^^ (1 ~ 10)");
		
		do {
			System.out.println("-----------------------------------------------");
			// 값 판단 후 입력 문구 출력
			if (firstTime) {
				System.out.print("숫자 입력 : ");
				firstTime = false;
			}
			else if (playerNo < 1 || playerNo > 10)
				System.out.print("1 ~ 10의 정수만 입력해주세요. 다시 입력 : ");
			else if (playerNo != computerNo)
				System.out.print("아닙니다. 다시 맞춰보세요^^ 다시 입력 : ");
			
			// 숫자 입력 받기
			try {
		        playerNo = sc.nextInt();
		    }
			catch (InputMismatchException e) { // 숫자 말고 다른 문자를 입력했을 때
		        System.out.println("※※정수만 입력 가능합니다.※※");
		        sc.nextLine(); // 입력 버퍼 비우기
		    }
			catch(Exception e) {
				System.out.println("※※오류 발생 - " + e);
				sc.nextLine(); // 입력 버퍼 비우기
			}
		
			// 정답 맞추면 루프 탈출
		} while (playerNo != computerNo);
		
		// 종료되면 정답 출력
		System.out.println("드디어 맞췄습니다~ 나의 숫자는 " + computerNo + "입니다");
	}
}
