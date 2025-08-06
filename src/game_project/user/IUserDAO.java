package game_project.user;

public interface IUserDAO {
	// 유저 DAO 인터페이스
	
	// 유저정보 저장 (회원가입)
	public void insertUser(UserDTO dto);
	
	// 로그인 검사
	public UserDTO loginCheck(String id, String pass);
}
