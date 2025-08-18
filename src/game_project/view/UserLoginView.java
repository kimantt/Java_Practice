package game_project.view;

import java.util.Scanner;

import game_project.controller.Controller;
import game_project.user.UserDTO;

public class UserLoginView {
	// Controller 클래스로 입력된 회원 정보를 전달
	Controller controller = Controller.getTinstance();
	
	public UserDTO login(Scanner sc) {
		
		String id, pass;
		System.out.println("-----------------------------------------------");
		System.out.print("아이디 : ");
		id = sc.nextLine();
		System.out.print("비밀번호 : ");
		pass = sc.nextLine();
		System.out.println("-----------------------------------------------");
		
		return controller.login(new UserDTO(id, pass, null));
	}
	
}
