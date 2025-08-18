package game_project.view;

import java.util.Scanner;

import game_project.controller.Controller;
import game_project.user.UserDTO;

public class UserUpdateView {
	// Controller 클래스로 입력된 회원 정보를 전달
	Controller controller = Controller.getTinstance();
	
	public void update(Scanner sc, UserDTO dto) {
		
		String pass, name;
		System.out.println("-----------------------------------------------");
		System.out.println("    회원정보 수정");
		System.out.print("변경하실 비밀번호를 입력해주세요 : ");
		pass = sc.nextLine();
		System.out.print("변경하실 이름을 입력해주세요 : ");
		name = sc.nextLine();
		System.out.println("-----------------------------------------------");
		
		controller.update(new UserDTO(dto.getId(), pass, name));
	}
	
}
