package game_project.view;

import java.util.Scanner;

import game_project.controller.Controller;
import game_project.user.UserDTO;

public class UserInsertView {
	// Controller 클래스로 입력된 회원 정보를 전달
	Controller controller = Controller.getTinstance();
	
	public void insert(Scanner sc) {
		
		String id, name, pass;
		System.out.println("-----------------------------------------------");
		System.out.print("아이디 : ");
		id = sc.nextLine();
		System.out.print("비밀번호 : ");
		pass = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println("-----------------------------------------------");
		
		controller.insert(new UserDTO(id, pass, name));
	}
	
}
