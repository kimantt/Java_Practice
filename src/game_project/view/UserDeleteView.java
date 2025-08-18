package game_project.view;

import java.util.Scanner;

import game_project.controller.Controller;
import game_project.user.UserDTO;

public class UserDeleteView {
	// Controller 클래스로 입력된 회원 정보를 전달
	Controller controller = Controller.getTinstance();
	
	public boolean delete(Scanner sc, UserDTO dto) {
		
		String choice;
		System.out.println("-----------------------------------------------");
		System.out.println("    회원탈퇴");
		System.out.print("정말로 탈퇴하시겠습니까? (y/n) : ");
		choice = sc.nextLine();
		System.out.println("-----------------------------------------------");
		
		while (true) {
			if (choice.equals("y")) {
				if (controller.delete(dto)) {
					System.out.println("회원탈퇴가 완료되었습니다.");
					return true;
				}
			}
			else if (choice.equals("n")) {
				System.out.println("회원탈퇴가 취소되었습니다.");
				break;
			}
			else
				System.out.println("다시 입력해주세요.");
		}
		return false;
	}
	
}
