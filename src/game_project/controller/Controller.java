package game_project.controller;

import game_project.user.IUserDAO;
import game_project.user.UserDAO;
import game_project.user.UserDTO;
import game_project.view.ResultView;

public class Controller {
	// 싱글톤
	private static Controller instance = new Controller();
	
	private Controller() {}
	
	// 인스턴스 반환
	public static Controller getTinstance() {
		return instance;
	}
	
	///////////// 데이터 처리 메서드 /////////////
	IUserDAO iDao = new UserDAO();
	public void insert(UserDTO newDto) {
		// DAO의 insert() 호출
		try {
			UserDTO dto = new UserDTO();
			dto.setId(newDto.getId());
			dto.setPass(newDto.getPass());
			dto.setName(newDto.getName());
			
			if (iDao.insertUser(dto)) {
				ResultView.succMsg(dto.getName() + "님의 회원가입이 완료되었습니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			ResultView.errorMsg("회원가입 오류");
		}
	}
	
	public void update(UserDTO newDto) {
		// DAO의 update() 호출
		try {
			UserDTO dto = new UserDTO();
			dto.setId(newDto.getId());
			dto.setPass(newDto.getPass());
			dto.setName(newDto.getName());
			
			if (iDao.updateUser(dto)) {
				ResultView.succMsg("회원정보가 수정되었습니다");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			ResultView.errorMsg("회원정보 수정 오류");
		}
	}
	
	public boolean delete(UserDTO dto) {
		try {			
			if (iDao.deleteUser(dto)) {
				ResultView.succMsg(dto.getName() + "님의 회원탈되가 완료되었습니다.");
				return true;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			ResultView.errorMsg("회원탈퇴 오류");
		}
		return false;
	}
	
	public UserDTO login(UserDTO dto) {
		try {
			return iDao.loginCheck(dto);
		} catch(Exception e) {
			e.printStackTrace();
			ResultView.errorMsg("로그인 오류");
		}
		return null;
	}
}
