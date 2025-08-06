package game_project.user;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class UserDAO implements IUserDAO{
	// 유저 DAO (싱글톤)

	// DB라고 치는 콜렉션
	private Map<String, UserDTO> userDB;
	
	// 싱글톤
	private static UserDAO instance;
	
	private UserDAO() {
		userDB = new HashMap<String, UserDTO>();
	}
	
	public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }
	
	// 회원가입
	public void register(Scanner sc) {
		sc.nextLine(); //입력 버퍼 비우기
		
		String id, name, pass;
		System.out.println("-----------------------------------------------");
		System.out.print("아이디 : ");
		id = sc.nextLine();
		System.out.print("비밀번호 : ");
		pass = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println("-----------------------------------------------");
		
		insertUser(new UserDTO(id, pass, name));
	}
	
	// 로그인
	public UserDTO login(Scanner sc) {
		sc.nextLine(); //입력 버퍼 비우기
		
		String id, pass;
		System.out.println("-----------------------------------------------");
		System.out.print("아이디 : ");
		id = sc.nextLine();
		System.out.print("비밀번호 : ");
		pass = sc.nextLine();
		System.out.println("-----------------------------------------------");
		
		return loginCheck(id, pass);
	}
	
	@Override
	public void insertUser(UserDTO dto) {
		// 유저정보 저장 시도
		String id = dto.getId();
	    String name = dto.getName();

	    // 중복된 유저 혹은 아이디 검사
	    UserDTO user = userDB.get(id);
	    if (user != null) {
	    	if (user.getName().equals(name)) {
	            System.out.println("이미 존재하는 사용자입니다.");
	        } else {
	            System.out.println("중복된 아이디입니다.");
	        }
	    }
	    else {
	        userDB.put(id, dto);
	        System.out.println(name + "님의 회원가입이 완료되었습니다.");
	    }
	}

	@Override
	public UserDTO loginCheck(String id, String pass) {
		// 로그인 시도
		UserDTO user = userDB.get(id);
		if (user == null) { // null pointer 검사
			System.out.println("해당 아이디의 사용자가 존재하지 않습니다.");
			return null; 
		}
		
		// 비밀번호 일치 검사
		if (user.getPass().equals(pass)) {
			System.out.println("로그인 성공");
			System.out.println(user.getName() + "님 반갑습니다!");
			return user;
		}
		else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		return null;
	}

}
