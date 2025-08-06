package game_project.start;

import java.util.InputMismatchException;
import java.util.Scanner;

// 유저 정보 관련 소스
import game_project.info.AppInfo;
import game_project.user.UserDAO;
import game_project.user.UserDTO;

// 게임 관련 소스
import game_project.game.Game;
import game_project.game.GaBaBo;
import game_project.game.Guess;

public class AppStart {

	public static void main(String[] args) {
		// 게임 프로젝트
		
		Scanner sc = new Scanner(System.in);
		int menu; // 메뉴 선택값 저장소
		AppInfo appInfo = AppInfo.getInstance(); // 애플리케이션 정보
		UserDAO userDAO = UserDAO.getInstance(); // 유저 정보 저장소
		UserDTO user = null; // 현재 유저
		Game game;
		
		
		// 초기 출력
		System.out.println("***********************************************");
		System.out.println("    ★★게임에 오신 것을 환영합니다^^");
		
		// 게임 루프
		while (true) {
			menu = 0; // 선택항목 초기화
			System.out.println("***********************************************");
			System.out.println("            메뉴");
			System.out.println("-----------------------------------------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 애플리케이션 정보");
			System.out.println("4. 가위바위보 게임");
			System.out.println("5. 숫자 맞추기 게임");
			System.out.println("6. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("메뉴 번호 입력 : ");
			
			try {
				// 메뉴 입력받고 switch문으로 분기
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					System.out.println("***********************************************");
					System.out.println("        회원가입");
					userDAO.register(sc);
					break;
				case 2:
					System.out.println("***********************************************");
					System.out.println("        로그인");
					user = userDAO.login(sc);
					break;
				case 3:
					System.out.println("***********************************************");
					System.out.println("        애플리케이션 정보");
					System.out.println("-----------------------------------------------");
					System.out.println(appInfo);
					break;
				case 4:
					if (user == null) { // 로그인 했는지 검사
						System.out.println("※※먼저 로그인 해주세요.※※");
						break;
					}
					System.out.println("***********************************************");
					System.out.println("        가위바위보 게임");
					game = new GaBaBo();
					game.run(sc, user); // 게임 실행
					game = null; // 게임 종료 후 참조 제거
					break;
				case 5:
					if (user == null) { // 로그인 했는지 검사
						System.out.println("※※먼저 로그인 해주세요.※※");
						break;
					}
					System.out.println("***********************************************");
					System.out.println("        숫자 맞추기 게임");
					game = new Guess();
					game.run(sc, user); // 게임 실행
					game = null; // 게임 종료 후 참조 제거
					break;
				case 6:
					System.out.println("***********************************************");
					System.out.println("종료합니다!");
					System.out.println("***********************************************");
					System.exit(0);
				default:
					System.out.println("다시 입력해주세요");
				}
			}
			catch(InputMismatchException e) { // 메뉴에서 숫자 말고 다른 문자를 입력했을 때
				System.out.println("※※1 ~ 6의 숫자를 입력하셔야 합니다.※※");
				sc.nextLine(); // 입력 버퍼 비우기
			}
			catch(Exception e) {
				System.out.println("※※오류 발생 - " + e);
				sc.nextLine(); // 입력 버퍼 비우기
			}
			
		}

	}

}
