package game_project.game;

import java.util.Scanner;

import game_project.user.UserDTO;

public class GaBaBo extends Game {
	// 가위바위보 게임
	
	// 상수 정의
	private final String[] choices = {"가위", "바위", "보"};
	private int computerChoice;
	private int playerInput; // 플레이어 입력값
	
	// 게임 실행
	@Override
	public void run(Scanner sc, UserDTO user) {
		
		System.out.println("가위 바위 보 게임 : 1. 가위, 2. 바위, 3. 보");
		while (true) {
			System.out.println("===============================================");
			
			// 플레이어 입력 받기
			while (true) {
				System.out.print("번호 입력 : ");
				try {
					playerInput = sc.nextInt();
					
					// 입력값 검사
					if (playerInput >= 1 && playerInput <= 3) {
	                    playerInput--; // 상수 배열의 인덱스에 맞게 조정
	                    break;
	                }
					System.out.println("※ 1 ~ 3 사이의 숫자만 입력해주세요.");
				}
				catch(Exception e) {
					System.out.println("※ 숫자를 입력해야 합니다.");
	                sc.nextLine(); // 입력 버퍼 비우기
				}
			}
			computerChoice = random.nextInt(3);
			
			// 승패 판단
			if (playerInput == computerChoice) {
	            System.out.println("비겼습니다!");
	        } else if ((playerInput == 0 && computerChoice == 2) ||
	                   (playerInput == 1 && computerChoice == 0) ||
	                   (playerInput == 2 && computerChoice == 1)) {
	            System.out.println("당신이 이겼습니다^^");
	        } else {
	            System.out.println("컴퓨터가 이겼습니다...");
	        }
			System.out.println("컴퓨터는 " + choices[computerChoice] + "입니다.");
			
			// 계속할지 여부 입력 받음
			while (true) {
			    System.out.print("계속하시겠습니까? (y/n) : ");
			    String cont = sc.next();

			    // 입력값 검사
			    if (cont.equalsIgnoreCase("y")) {
			        break; // 다음 판 진행
			    } else if (cont.equalsIgnoreCase("n")) {
			    	System.out.println("게임을 종료합니다.");
			        return; // 게임 종료
			    } else {
			        System.out.println("※ y 또는 n만 입력해주세요.");
			    }
			}
		}
	}
}
